package Session26_AbstractClass;

import Session26_AbstractClass_Hero.Hero;
import Session26_AbstractClass_Hero.HeroIntel;
import Session26_AbstractClass_Hero.HeroAgility;

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
	}
}
