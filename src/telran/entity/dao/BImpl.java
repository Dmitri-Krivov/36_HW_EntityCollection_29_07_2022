package telran.entity.dao;

import java.util.Comparator;
import java.util.TreeSet;

import telran.entity.interfaces.Entity;
import telran.entity.interfaces.EntityCollection;

public class BImpl implements EntityCollection {
	Comparator<Entity> comp = (e1, e2) -> Integer.compare(e1.getValue(), e2.getValue());
	private TreeSet<Entity> myEntity = new TreeSet<>(comp);

	@Override
	//O(log(n))
	public void add(Entity entity) {
		if (entity != null) {
			myEntity.add(entity);
		}
	}

	@Override
	//O(log(n))
	public Entity removeMaxValue() {
		Entity max = myEntity.last();
		myEntity.remove(max);
		return max;
	}

}
