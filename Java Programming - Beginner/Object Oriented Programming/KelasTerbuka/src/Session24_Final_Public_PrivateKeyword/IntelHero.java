package Session24_Final_Public_PrivateKeyword;


//Public ini akan terbuka untuk semuanya
public class IntelHero extends Hero{
	// private double health; // Tujuannya untuk menjalankan yang GetHealth
	
	IntelHero(String name, double health){
		super(name, health);
		// System.out.println(this.health); // Tidak bisa diakses karena Private di SuperClass
	}
	
	/*
	//Override GetHealth
		//Karena di SuperClass Public maka di SubClass harus Public
	public double getHealth() {
		// return this.health; //Tidak berfungsi karena di SuperClass Private
	}
	*/
	
	//Visibilty harus sama dengan SuperClass
	public void display() {
		System.out.println(this.name + " mempunyai banyak " + this.getHealth());
	}
	
	/*
	//Override Setter
	void setHealth(double newHealth) {
		System.out.println("Mencoba memasukan Health = " + newHealth);
	}
	*/
	
	//Overloading
	void setHealth(String newHealth) {
		System.out.println("Mencoba memasukan Health = " + newHealth);
	}
	
}
