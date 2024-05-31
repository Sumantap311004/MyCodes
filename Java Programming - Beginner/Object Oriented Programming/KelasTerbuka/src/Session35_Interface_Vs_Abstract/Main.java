package Session35_Interface_Vs_Abstract;

import Session35_Interface_Vs_Abstract_Hero.Hero;
import Session35_Interface_Vs_Abstract_Hero.HeroAgility;
import Session35_Interface_Vs_Abstract_Hero.HeroIntel;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test!!!");
		
		System.out.println();
		HeroAgility hero1 = new HeroAgility("Ucup", 100);
		hero1.display();
		
		System.out.println();
		HeroAgility hero2 = new HeroAgility("Otong", 20);
		hero2.display();
		
		System.out.println();
		hero1.attack(hero2);
		
		System.out.println();
		HeroIntel hero3 = new HeroIntel("Mamat", 1000);
		hero3.display();
		hero3.spell(hero2);
	}
}