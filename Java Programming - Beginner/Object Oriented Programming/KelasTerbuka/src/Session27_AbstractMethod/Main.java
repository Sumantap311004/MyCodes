package Session27_AbstractMethod;

import Session27_AbstractMethod_Hero.Hero;
import Session27_AbstractMethod_Hero.HeroIntel;
import Session27_AbstractMethod_Hero.HeroStrength;
import Session27_AbstractMethod_Hero.HeroAgility;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		//Membuat Object dari kelas Non-Abstract
		HeroIntel hero1 = new HeroIntel("Otong");
		hero1.display();
		
		/*
		//Membuat Object dari Kelas Abstract
		Hero hero2 = new Hero ("Mario");
		hero2.display();
		//Tidak bisa membuat Object karena bentuknya adalah Abstract, hanya berperan sebagai Template
		*/
		
		HeroAgility hero3 = new HeroAgility ("Tutung");
		hero3.display();
		System.out.println("");
		
		//Proses Level
		hero1.levelUp();
		hero3.levelUp();
		hero1.display();
		hero3.display();
		
		HeroStrength hero4 = new HeroStrength("Ucup");
		hero4.levelUp();
		hero4.display();
	}
}