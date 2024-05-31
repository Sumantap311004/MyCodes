package Session27_AbstractMethod_Hero;

//Inheritence dari Abstract Hero
public class HeroAgility extends Hero{
	public HeroAgility (String name) {
		super(name);
	}
	
	public void levelUp() {
		this.setLevel(1);
	}
}
