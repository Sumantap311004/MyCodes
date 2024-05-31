package Session34_Interface;

import Session34_Interface_Hero.Hero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test!!!");
		
		System.out.println();
		Hero hero1 = new Hero ("Ucup", 100);
		hero1.display();
		
		System.out.println();
		Hero hero2 = new Hero ("Otong", 20);
		hero2.display();
		
		System.out.println();
		hero1.attack(hero2);
	}
}