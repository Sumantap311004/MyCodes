public class Bicycle 
{
	public int gear;
	public int speed;
	
	public Bicycle()
	{
		gear = 0;
		speed = 0;
	}
	
	//Consturctor from Class Bicycle with Passing Parameters
	public Bicycle (int startSpeed, int startGear)
	{
		gear =  startGear;
		speed = startSpeed;
	}
	
	public void setGear(int newValue) 
	{
		gear = newValue;
	}
	
	public void applyBrake (int decrement) 
	{
		speed -= decrement;
	}
	
	public void speedUp (int increment) 
	{
		speed+=increment;
	}
	
	public int getSpeed() 
	{
		return speed;
	}

}
