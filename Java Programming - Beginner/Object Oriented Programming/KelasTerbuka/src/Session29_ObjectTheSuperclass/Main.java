package Session29_ObjectTheSuperclass;

public class Main {
	public static void main(String[] args) {
		System.out.println("Test!!!");
		
		Hero hero1 = new Hero("Ucup");
		hero1.display();
		
		//Kita sebut Class Object sebagai SuperClass
		Object hero2 = hero1;
		String hero2_str = hero2.toString();
		String hero1_str = hero1.toString(); //Polymorphism dari Object -> Hero
		System.out.println(hero2_str);
		System.out.println(hero1_str);
		
		//Salah satu Method Class Object adalah equals
		System.out.println(hero1.equals(hero2)); //True karena memiliki Reference yang sama
		
		//Contoh dari equals
		Hero hero3 = new Hero("Otong");
		Hero hero4 = new Hero("Tatang");
		Hero hero5 = new Hero("Tutung");
		System.out.println(hero3.equals(hero5));
		Jagoan hero6 = new Jagoan("Otong");
		
		//Override equals di Kelas Hero
		System.out.println(hero3.equals(hero4));
		System.out.println(hero3.equals(hero6));
	}
}
