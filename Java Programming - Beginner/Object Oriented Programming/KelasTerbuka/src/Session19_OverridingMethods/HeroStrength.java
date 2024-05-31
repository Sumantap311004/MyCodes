package Session19_OverridingMethods;

public class HeroStrength extends Hero{
	double defencePower;
	
	// Overriding Method
	void display() {
		System.out.println("");
		System.out.println("Hero Strength");
		System.out.println("Hero name : " + this.name);
		System.out.println("Defence Power: " + this.defencePower);
	}
}
