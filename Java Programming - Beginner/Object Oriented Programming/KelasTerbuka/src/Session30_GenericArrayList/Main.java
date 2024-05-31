package Session30_GenericArrayList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test!!!");
		System.out.println("");
		
		Hero hero1 = new Hero("Ucup", 100);
		Hero hero2 = new Hero("Otong", 20);
		AgilityHero agilityHero = new AgilityHero("Johny", 500);
		IntelHero intelHero  = new IntelHero("Smith", 5);
		
		//Array Sederhana
		Hero[] kumpulanHero = new Hero[3];
		//Masukan Anggota
		kumpulanHero[0] = hero1;
		kumpulanHero[1] = hero2;
		kumpulanHero[2] = agilityHero;
		// kumpulanHero[3] = intelHero; //Tidak bisa karena Array Fiks
		System.out.println("");
		System.out.println("Static Array");
		System.out.println("===============");
		for(Hero hero:kumpulanHero) {
			hero.display();
		}
		
		//Array List
		ArrayList<Hero> listHero = new ArrayList<>();
		//Menambahkan member
		listHero.add(hero1);
		listHero.add(hero2);
		listHero.add(agilityHero);
		listHero.add(intelHero);
		System.out.println("");
		System.out.println("Array List");
		System.out.println("================");
		for(Hero hero:listHero) {
			hero.display();
		}
		
		//Reference
		agilityHero.setName("Dudung");
		
		System.out.println("");
		System.out.println("Setelah Berubah");
		System.out.println("Static Array");
		System.out.println("===============");
		for(Hero hero:kumpulanHero) {
			hero.display();
		}
		
		System.out.println("");
		System.out.println("Setelah Berubah");
		System.out.println("Array List");
		System.out.println("================");
		for(Hero hero:listHero) {
			hero.display();
		}
		
		
	}
}
