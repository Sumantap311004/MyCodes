package Session26_AbstractClass_Hero;


//Abtract Class
public abstract class Hero {
	private String name;
	
	public Hero(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Aku adalah hero " + this.name);
	}
	
}
