package e.singletonDemo;

public class Superman {
	
	// 1. create a class instance of superman
	private static Superman instance = new Superman();
	
	private int speed;
	private int altitude;
	
	// 2. private CTOR
	private Superman() {
		
	}
	
	// 3. public static method to get the instance
	public static Superman getInstance() {
		return instance;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getAltitude() {
		return altitude;
	}
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}
	@Override
	public String toString() {
		return "Superman [speed=" + speed + ", altitude=" + altitude + "]";
	}
	
	

}
