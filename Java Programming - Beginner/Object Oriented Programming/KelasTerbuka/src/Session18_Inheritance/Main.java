package Session18_Inheritance;

// Inheritance adalah hubungan is-a

/*
// Superclass, Parent Class, Base Class
class Hero{
	String name;
	
	//Method
	void display() {
		System.out.println("Name : " + this.name);
	}
}

// Subclass, Child Class, Derived Class
class HeroStrength extends Hero{
	
}

class HeroIntelligent extends Hero{
	
}
*/

public class Main {
	public static void main(String[] args) {
		Hero hero1 = new Hero();
		hero1.name = "Ucup";
		// System.out.println("Hero 1 : " + hero1.name);
		hero1.display();
		
		HeroStrength hero2 = new HeroStrength();
		hero2.name = "Otong";
		// System.out.println("Hero 2 : " + hero2.name);
		hero2.display();
		
		HeroIntelligent hero3 = new HeroIntelligent();
		hero3.name = "Michael Jordan";
		// System.out.println("Hero 3 : " + hero3.name);
		hero3.display();
	}
}