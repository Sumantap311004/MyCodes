package Session20_Super;

// this.name akan mengakses Attribut name kalau ada di kelas ini,
	// Jika tidak ada, akan mengakses Attribut dari Super Class.

// super.name akan selalu mengakses Atribut SuperClass
public class HeroStrength extends Hero {
	String name = "Class StrengthHero";
	
	void display() {
		System.out.println("Ini adalah " + this.name);
		this.dummyMethod();
	}
	
	void displaySuper() {
		System.out.println("Ini adalah " + super.name);
		super.dummyMethod();
	}
	
	void dummyMethod() {
		System.out.println("Method ini ada di SubClass");
	}
}
