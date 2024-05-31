package Session27_AbstractMethod_Hero;

//Abtract Class
public abstract class Hero {
	private String name;
	private int level;
	
	public Hero(String name) {
		this.name = name;
		this.level = 1;
	}
	
	public void display() {
		System.out.println("Aku adalah hero " + this.name);
		System.out.println("Level : " + this.level);
	}
	
	//Abstract Method
	public abstract void levelUp();
	
	//Setter
	public void setLevel(int deltaLevel) {
		this.level += deltaLevel;
	}
}
