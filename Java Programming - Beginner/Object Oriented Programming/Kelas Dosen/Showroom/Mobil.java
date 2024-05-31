

public class Mobil {
	
	public String name;
	public int capacity;
	public int speed;
	
	public Mobil() {
		capacity = 0;
		speed = 0;
	}
	
	public Mobil(int startCap, int startSpeed) {
		capacity = startCap;
		speed = startSpeed;
	}
	
	public String getName() {
		return name;
	}
}
