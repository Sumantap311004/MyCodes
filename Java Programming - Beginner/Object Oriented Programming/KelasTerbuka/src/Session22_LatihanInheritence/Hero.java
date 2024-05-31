package Session22_LatihanInheritence;

public class Hero {
	//Atribute
	String name;
	double attackPower, health;
	
	//Contructor
	Hero(String nameInput, double attackInput, double healthInput){
		this.name = nameInput;
		this.attackPower = attackInput;
		this.health = healthInput;
	}
	
	//Method Attack
	void attack(Hero enemy) {
		System.out.println("");
		System.out.println(this.name + " attack " + enemy.name);
		enemy.takeDamage(this.attackPower);
	}
	
	void takeDamage(double damage) {
		System.out.println(this.name + " recieve damage " + damage);
		this.health = this.health - damage;
	}
	
	void display() {
		System.out.println("");
		System.out.println("Name: " + this.name);
		System.out.println("Health: " + this.health);
		System.out.println("Power: " + this.attackPower);
	}
}

