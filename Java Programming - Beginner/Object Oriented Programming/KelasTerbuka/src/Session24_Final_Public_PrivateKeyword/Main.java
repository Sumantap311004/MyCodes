package Session24_Final_Public_PrivateKeyword;

/*
// Visibility
1. Public: Jika method atau Atrribute dalam public secara explisit, maka Subclass tidak boleh mengurangi Visibility
2. Provate: Jika method atau Atrribute dalam private secara explisit, maka subclass pun tidak dapat mengakses
3. Final : Method atau Attribute dengan Final KeyWord akan diWariskan, tetapi tidak bisa diOverride(Gabisa di timpa) namun dalam Class yang sama dapat di OverLoading
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		Hero hero1 = new Hero("Ucup", 100);
		IntelHero hero2 = new IntelHero("Otong", 50);
		
		hero1.display();
		hero2.display();
		System.out.println("");
		
		hero1.setHealth(120);
		hero2.setHealth(80);
		
		System.out.println(hero1.getHealth());
		System.out.println(hero2.getHealth());
		System.out.println("");
		
		hero1.display();
		hero2.display();
		System.out.println("");
		
		//Overloading Method
		hero1.setHealth("reset");
		hero2.setHealth("reset");
		
		hero1.display();
		hero2.display();
		System.out.println("");
	}
}
