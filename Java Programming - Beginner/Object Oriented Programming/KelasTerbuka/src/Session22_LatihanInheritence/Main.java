package Session22_LatihanInheritence;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero1 = new Hero("Tanjiro", 10, 100);
		hero1.display();
		
		
		HeroStrength hero2 = new HeroStrength("Zenitsu", 20, 100);
		hero2.display();
		
		//Proses Attacking
		hero1.attack(hero2);
		hero2.attack(hero1);
		//Melihat setelah Attacking
		hero1.display();
		hero2.display();
		
	}

}
