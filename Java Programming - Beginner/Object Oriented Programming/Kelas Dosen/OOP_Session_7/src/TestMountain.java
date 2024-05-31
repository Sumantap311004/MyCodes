
public class TestMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike obj = new MountainBike(100,10,1);
		
		System.out.println("Tinggi sepeda = "+obj.getHeight());
		System.out.println("Kecepatan sepeda = "+obj.getSpeed());
		obj.speedUp(10);
		System.out.println("Kecepatan sepeda = "+obj.getSpeed());
		obj.printSpeed();
	}
}
