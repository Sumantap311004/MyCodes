package Session36_LatihanInterface;

import Session36_LatihanInterface_Hero.Hero;
import Session36_LatihanInterface_Hero.HeroAgility;
import Session36_LatihanInterface_Hero.AttackMelee;
import Session36_LatihanInterface_Hero.AttackRange;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing!!!");
		
		System.out.println();
		HeroAgility hero1 = new HeroAgility("Ucup", 100);
		hero1.setAttackSkill(new AttackMelee(100));
		hero1.display();
		
		System.out.println();
		HeroAgility hero2 = new HeroAgility("Otong", 20);
		hero2.setAttackSkill(new AttackRange(100, 10));
		hero2.display();
		
		System.out.println();
		hero1.attack(hero2);
		
		System.out.println();
		hero2.attack(hero1);
		
		
		
		
	}

}
