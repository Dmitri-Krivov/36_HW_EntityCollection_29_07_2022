package telran.entity.model;

import java.util.Objects;

public class Entity implements Comparable<Entity> {
	private int value;

	public Entity(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity other = (Entity) obj;
		return value == other.value;
	}

	@Override
	public String toString() {
		return "Entity [value=" + value + "]";
	}

	@Override
	public int compareTo(Entity o) {
		return Integer.compare(value, o.value);
	}
	
	

}
