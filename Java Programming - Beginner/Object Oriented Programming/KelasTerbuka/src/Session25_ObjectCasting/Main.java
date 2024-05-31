package Session25_ObjectCasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		/*
		//Casting Sederhana
		double angka = 5.4;
		int angka_int = (int)angka;
		System.out.println(angka_int);
		*/
		
		//Object dengan Class HeroIntel
		HeroIntel hero1 =  new HeroIntel("Ucup", 100);
		hero1.display();
		hero1.castMagic();
		
		//Up Casting to SuperClass
		Hero heroUp = (Hero) hero1;
		heroUp.display();
		
		/*
			// Ada field dan Method yang hilang
			System.out.println(heroUp.type);
			heroUp.castMagic();
		*/
		
		//Object dengan Class Regular
		Hero heroReg = new Hero ("Otong", 100);
		heroReg.display();
		
		/*
		//Down Casting to SubClass
		HeroAgility heroDown = (HeroAgility) heroReg;
		heroDown.display();
		//Tidak bisa dilakukan dari SuperClass ke SubClass
		*/
		
		//Mengembalikan UpCasting ke semula
			//Berhasil di DownCasting dengan syarat bentuk awalnya adalah sama.
		HeroIntel hero2 = (HeroIntel) heroUp;
		hero2.display();
		System.out.println(hero2.type);
		hero2.castMagic();
	}

}