package Session33_ReflectionMethodAndConstructor_Hero;

public class HeroAgility extends Hero{
	private String heroType = "Agility";
	private String nickname;
	
	public HeroAgility(String name, double health) {
		super(name, health);
	}
	
	public void displayAll() {
		this.display();
		System.out.println("Hero Type : " + this.heroType);
		System.out.println("Nickname  : " + this.nickname);
	}
	
	private void setHeroType(String heroType) {
		this.heroType = heroType;
	}
	
	private void setNickname(String nickname) {
		this.nickname = nickname;
	}
}
