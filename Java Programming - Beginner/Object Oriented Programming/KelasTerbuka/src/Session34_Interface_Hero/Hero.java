package Session34_Interface_Hero;

public class Hero implements I_Attack {
	private String name;
	private double health;
	
	public Hero(String name, double health) {
		this.name =  name;
		this.health = health;
	}
	
	//Memaksakan kelas ini untuk mengimplementasikan Method Attack
	public void attack(Hero enemy) {
		System.out.println(this.name + " Attacking "  + enemy.name);
	}
	
	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Health : " + this.health);
	}

}
