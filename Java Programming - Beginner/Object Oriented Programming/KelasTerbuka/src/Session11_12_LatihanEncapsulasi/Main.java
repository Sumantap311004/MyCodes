package Session11_12_LatihanEncapsulasi;

class Player{
	private String name;
	private int baseHealth;
	private int baseAttack;
	private Weapon weapon;
	private Armor armor;
	private int level;
	private int incrementHealth;
	private int incrementAttack;
	
	public Player(String name){
		this.name = name;
		this.baseHealth = 100;
		this.baseAttack = 100;
		this.level = 1;
		this.incrementHealth = 20;
		this.incrementAttack = 20;
	}
	
	public void display() {
		System.out.println("=================================");
		System.out.println("Player\t\t: " + this.name);
		System.out.println("Level\t\t: "+ this.level);
		System.out.println("Max Health\t: " + this.maxHealth());
		System.out.println("Max Attack\t: " + this.getAttackPower());
		System.out.println("Base Health\t: " + this.baseHealth);
		System.out.println("Base Attack\t: " + this.baseAttack);
		System.out.println("=================================");
	}
	
	public void levelUp() {
		this.level++;
	}
	
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public int maxHealth(){
		return this.baseHealth + this.level*this.incrementHealth + this.armor.getAddHealth();
	}
	
	public int getAttackPower() {
		return this.baseAttack + this.level*this.incrementAttack + this.weapon.getAttack();
	}
}

class Weapon {
	private String name;
	private int attack;
	
	public Weapon (String name, int attack) {
		this.name = name;
		this.attack = attack;
	}
	
	public int getAttack() {
		return this.attack;
	}
}

class Armor{
	private String name;
	private int deffencePower;
	private int strength;
	private int health;
	
	public Armor(String name, int strength, int health) {
		this.name = name;
		this.strength = strength;
		this.health = health;
	}
	
	public int getAddHealth() {
		return this.strength*10 + this.health;
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		Player player1 =  new Player("Marni");
		Armor armor1 = new Armor("Baju Besi",5 ,100);
		Weapon weapon1 = new Weapon("Pedang", 10);
		player1.setArmor(armor1); //Menjadi Write Only
		player1.setWeapon(weapon1);
		player1.display();
		player1.levelUp();
		player1.display();
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Player player2 =  new Player("Issabela");
		Armor armor2 = new Armor("Gaun Pesta",1 ,40);
		Weapon weapon2 = new Weapon("Pecut", 40);
		player2.setArmor(armor2); //Menjadi Write Only
		player2.setWeapon(weapon2);//Menjadi Write Only
		player2.display();
		player2.levelUp();
		player2.display();
	}

}
