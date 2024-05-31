package Session23_Polymorphism;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero1 = new Hero ("Ucup");
		HeroStrength hero2 = new HeroStrength("Otong");
		hero1.display();
		hero2.display();
		
		// Polymorphic
		Hero hero3 = new HeroAgility("Maria");
		hero3.display();
		
		HeroAgility hero4 = new HeroAgility("Mahmud");
		hero4.display();
		hero4.showoff();
		
		/*
		HeroIntel hero4 = new Hero("Mahmud");
		hero4.display();
		*/
		// Tidak bisa terjadi karena ada proses Inheritence
		
		
		//Array List
		Hero[] kumpulanHero = new Hero[4];
		kumpulanHero[0] = hero1;
		kumpulanHero[1] = hero2;
		kumpulanHero[2] = hero3;
		kumpulanHero[3] = hero4;
		
		kumpulanHero[0].display();
		kumpulanHero[1].display();
		kumpulanHero[2].display();
		
		// Method Calls //
		// kumpulanHero[3].showoff();
			//Tidak bisa karena Array dianggap Class bukan Class Agility
		hero4.showoff();
		
		// Aplikasi Polymorph
		hero1.attack(hero2);
		hero1.attack(hero3);
		hero1.attack(hero4);
	}

}
