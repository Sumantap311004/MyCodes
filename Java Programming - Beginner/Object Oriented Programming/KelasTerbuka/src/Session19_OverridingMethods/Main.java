package Session19_OverridingMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero1 = new Hero();
		hero1.name = "Saitama";
		// hero1.defencePower = 100; // Tidak Bisa karena hanya ada di HeroStrength
		hero1.display();
		
		HeroStrength hero2 = new HeroStrength();
		hero2.name = "Mountain Lady";
		hero2.defencePower = 100;
		hero2.display();
	}

}
