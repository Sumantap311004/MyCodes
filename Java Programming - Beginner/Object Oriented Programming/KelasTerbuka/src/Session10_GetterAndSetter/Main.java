package Session10_GetterAndSetter;

class Data {
	public int intPublic;
	private int intPrivate;
	private double doublePrivate;
	
	public Data() {
		this.intPublic = 0;
		this.intPrivate = 10;
	}
	
	void display() {
		System.out.println(this.intPublic);
		System.out.println(this.intPrivate);
		System.out.println(this.doublePrivate);
	}
	
	// Getter
	public int getIntPrivate() {
		return this.intPrivate;
	}
	
	//Setter
	public void setDoublePrivate(double value){
		this.doublePrivate = value;
	}
}

class Lingkaran {
	private double diameter;
	
	Lingkaran(double diameter){
		this.diameter = diameter;
	}
	
	//Setter
	public void setJari2(double jari2) {
		this.diameter = 2*jari2;
	}
	
	//Getter
	public double getJari2() {
		return this.diameter/2;
	}
	
	//Getter
	public double getLuas() {
		return 3.14*diameter*diameter/4;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data object = new Data();
		//Public
			//Read an Write dengan menggunakan Public
		object.intPublic = 5; //Write
		System.out.println("Public\t: " + object.intPublic); //Read
		
		//Read Only (Kita bisa menggunakan GETTER)
		int angka = object.getIntPrivate();
		System.out.println("Getter\t: " + angka);
		
		//Write Only (Kita Hanya bisa menulis menggunakan SETTER)
		object.setDoublePrivate(0.05);
		object.display();
		
		//Gabungan Read Only and Write Only dengan Setter dan Getter
		Lingkaran object2 = new Lingkaran(5);
		System.out.println("Jari-jari\t: " + object2.getJari2());
		object2.setJari2(14);
		System.out.println("Jari-jari baru\t: " + object2.getJari2());
		System.out.println("Luas\t: " + object2.getLuas());
	}

}
