
public class MountainBike extends Bicycle {
	// Class MountainBike adding 1 field
	public int seatHeight;
	
	//Class MountainBike have 1 Constructor
	public MountainBike (int startHeight, int startSpeed, int startGear)
	{
		// super(startSpeed, startGear);
		speed = startSpeed;
		gear= startSpeed;
		seatHeight = startHeight;
	}
	
	//Class MountainBike adding 1 function
	public void setHeight (int newValue ) {
		seatHeight = newValue;
	}
	
	public void printSpeed() 
	{
		System.out.println("Kecepatan Speda = "+super.getSpeed());
	}
	
	public int getHeight() 
	{
		return seatHeight;
	}
	
}
