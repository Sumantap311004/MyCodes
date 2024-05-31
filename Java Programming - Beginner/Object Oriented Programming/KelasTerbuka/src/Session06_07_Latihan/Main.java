package Session06_07_Latihan;

// Player
class Player {
	String name;
	double health;
	int level;
	
	//Object Member
	Weapon weapon;
	Armor armor;
	
	Player(String name, double health){
		this.name= name;
		this.health = health;
	}
	
	void attack (Player opponent) {
		double attackPower = this.weapon.attackPower;
		System.out.println(this.name + " attacking " + opponent.name + " with Power: " + attackPower);
		opponent.defence(attackPower);
	}
	
	void defence (double attackPower) {
		double damage;
		//Akan Mengambil Damagenya
		if (this.armor.defencePower < attackPower) {
			damage = attackPower - this.armor.defencePower;
		}
		else {
			damage = 0;
		}
		
		this.health -= damage;
		System.out.println(this.name + " gets damage: " + damage);
		
	}
	
	void equipWeapon (Weapon weapon) {
		this.weapon = weapon;
	}
	
	void equipArmor (Armor armor) {
		this.armor = armor;
	}
	
	void display() {
		System.out.println("Name\t: "+this.name);
		System.out.println("Health\t: "+this.health+" HP");
		this.weapon.display();
		this.armor.display();
		System.out.println("=========");
	}
}

// Senjata
class Weapon {
	double attackPower;
	String name;
	
	Weapon(String name, double attackPower){
		this.name = name;
		this.attackPower = attackPower;
	}
	
	void display() {
		System.out.println("Weapon\t: "+this.name+" , Power : "+this.attackPower);
	}
}

// Armor
class Armor {
	double defencePower;
	String name;

	Armor(String name, double defencePower){
		this.name = name;
		this.defencePower = defencePower;
	}
	
	void display() {
		System.out.println("Armor\t: "+this.name+" , Defence : "+this.defencePower);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Test");
		
		//Membuat Object Player
		Player player1 = new Player("Ucup", 100);
		Player player2 = new Player("Dadang", 100);
		
		//Membuat Object Weapon
		Weapon pedang = new Weapon("Pedang", 15);
		Weapon Ketapel = new Weapon("Ketapel", 5);
		
		//Membuat Object Armor
		Armor bajuBesi = new Armor("Baju Besi", 10);
		Armor kaosBiasa = new Armor("Kaos Biasa", 0);
		
		//Equip Senjata dan Armor
		player1.equipWeapon(pedang);
		player1.equipArmor(bajuBesi);
		player1.display();
		
		player2.equipWeapon(Ketapel);
		player2.equipArmor(kaosBiasa);
		player2.display();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("PERTEMPURAN");
		System.out.println("Episode 1");
		player1.attack(player2);
		player1.display();
		player2.display();
		System.out.println("Episode 2");
		player2.attack(player1);
		player1.display();
		player2.display();
	}

}
