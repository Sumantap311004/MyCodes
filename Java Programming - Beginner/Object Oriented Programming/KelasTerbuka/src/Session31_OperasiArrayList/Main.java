package Session31_OperasiArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test!!!");
		
		Hero hero1 = new Hero("Ucup", 100);
		Hero hero2 = new Hero("Otong", 100);
		AgilityHero heroAgility = new AgilityHero ("Dudung", 50);
		IntelHero heroIntel = new IntelHero("Johny", 20);
		
		ArrayList<Hero> listHero = new ArrayList<>();
		
		//Operasi 1 - Menambahkan member dengan Add
		System.out.println("Operasi 1 - Add");
		listHero.add(hero1);
		listHero.add(hero2);
		listHero.add(heroAgility);
		System.out.println(listHero);
		System.out.println();
		
		//Operasi 2 - Merubah member dengan Set
		System.out.println("Operasi 2 - Set");
		listHero.set(1, heroIntel);
		// listHero.set(2, heroAgility);
		System.out.println(listHero);
		System.out.println();
		
		//Operasi 3 - Menghapus member
		System.out.println("Operasi 3 - Remove");
		listHero.remove(1);
		System.out.println(listHero);
		System.out.println();
		
		//Operasi 4- Mengakses member (Get)
		System.out.println("Operasi 4 - Mengkases Member using Get");
		System.out.println(listHero);
		Hero heroAmbil = listHero.get(0);
		System.out.println(listHero);
		heroAmbil.display();
		System.out.println();
		
		//Method - Method Array List
		System.out.println("Method-Method");
		System.out.println("1. Size()\t: " 	   + listHero.size());
		System.out.println("2. isEmpty()\t: "  + listHero.isEmpty());
		System.out.println("3. contains()\t: " + listHero.contains(hero2));
		System.out.println("   contains()\t: " + listHero.contains(heroIntel));
		System.out.println("4. IndexOf()\t: "  + listHero.indexOf(hero1));
		System.out.println("   IndexOf()\t: "  + listHero.indexOf(heroAgility));
	}

}
