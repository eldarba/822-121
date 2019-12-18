package b.objectMethods;

public class Motorcycle {
	
	private int number;
	private int speed;
	private int cc;

	// we need to override toString, hashcode, equals
	
	@Override
	public String toString() {
		return "Motorcycle [number=" + number + ", speed=" + speed + ", cc=" + cc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Motorcycle))
			return false;
		Motorcycle other = (Motorcycle) obj;
		if (number != other.number)
			return false;
		return true;
	}


	
	

}
