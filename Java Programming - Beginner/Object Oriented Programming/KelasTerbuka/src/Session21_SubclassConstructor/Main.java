package Session21_SubclassConstructor;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero hero1 = new Hero("Esmeralda", 10);
		hero1.display();
		
		HeroStrength hero2 = new HeroStrength("Ucup", 10);
		hero2.display();
		
		HeroStrength hero3 = new HeroStrength("Otong");
		hero3.display();
	}
}