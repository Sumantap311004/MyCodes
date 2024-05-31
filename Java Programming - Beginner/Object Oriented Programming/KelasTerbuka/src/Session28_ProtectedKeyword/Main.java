package Session28_ProtectedKeyword;

import Session28_ProtectedKeyword_Hero.Hero;
import Session28_ProtectedKeyword_Hero.HeroStrength;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test!!!");
		System.out.println("");
		
		HeroStrength hero1 = new HeroStrength("Ucup");
		hero1.display();
		// System.out.println(hero1.name); //Tidak bisa karena Main bukan Anak Class Hero
	
		hero1.setName("Otong");
		hero1.display();
		
	}

}
