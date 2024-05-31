package Session35_Interface_Vs_Abstract_Hero;

public /*abstract*/ class Hero {
	private String name;
	private double health;
	
	public Hero(String name, double health){
		this.name = name;
		this.health = health;
	}
	
	// abstract void attack(Hero enemy);
	
	public String getName() {
		return this.name;
	}
	
	public double health() {
		return this.health;
	}
	
	public void display() {
		System.out.println("Name   : " + this.name);
		System.out.println("Health : " + this.health);
	}
}
