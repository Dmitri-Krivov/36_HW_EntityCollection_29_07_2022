package telran.entity.dao;

import java.util.Collections;
import java.util.HashSet;

import telran.entity.interfaces.Entity;
import telran.entity.interfaces.EntityCollection;

public class AImpl implements EntityCollection {
	HashSet<Entity> myEntity = new HashSet<>();

	@Override
	// 0(1)
	public void add(Entity entity) {
		if (entity != null) {
			myEntity.add(entity);
		}
	}

	@Override
	// 0(n)
	public Entity removeMaxValue() {
		Entity max = Collections.max(myEntity, (s1, s2) -> s1.getValue() - s2.getValue());
		return max;
	}
}
