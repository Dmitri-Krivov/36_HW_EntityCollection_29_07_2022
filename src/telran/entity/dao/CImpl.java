package telran.entity.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import telran.entity.interfaces.Entity;
import telran.entity.interfaces.EntityCollection;

public class CImpl implements EntityCollection {
	ArrayList<Entity> myEntity= new ArrayList<>();
	Comparator<Entity> comp = (e1,e2) -> Integer.compare(e1.getValue(),e2.getValue());

	@Override
	public void add(Entity entity) {
		if (entity != null) {
			int index = Collections.binarySearch(myEntity, entity, comp);
			if (index < 0) {
				myEntity.add(-index - 1, entity);
			}
		}
	}

	@Override
	//O(1)
	public Entity removeMaxValue() {
		return myEntity.remove(myEntity.size() - 1);
	}

}
