package Session36_LatihanInterface_Hero;

public abstract class Hero {
	
	private String name;
	private double health;
	private I_AttackSkill attackSkill;
	
	public Hero(String name, double health) {
		this.name = name;
		this.health = health;
	}
	
	public void setAttackSkill(I_AttackSkill attackSkill) {
		this.attackSkill= attackSkill;
	}
	
	public void attack(Hero enemy) {
		System.out.println(this.name + " is Attacking");
		this.attackSkill.attack(enemy);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void display() {
		System.out.println("Name   : " + this.name);
		System.out.println("Health : " + this.health);
	}
}
