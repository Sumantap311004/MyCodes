package Session27_AbstractMethod_Hero;

//Inheritence dari Abstract Hero
public class HeroIntel extends Hero{
	public HeroIntel(String name) {
		super(name);
	}
	
	public void levelUp() {
		this.setLevel(2);
	}
}