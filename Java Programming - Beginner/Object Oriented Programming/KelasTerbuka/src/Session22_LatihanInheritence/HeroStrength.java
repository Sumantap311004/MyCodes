package Session22_LatihanInheritence;

public class HeroStrength extends Hero{
	String type = "Strength";
	
	//SubClass Constructor
	HeroStrength(String nameInput, double attackInput, double healthInput){
		super(nameInput, attackInput, healthInput);
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("Type: " + this.type);
		//Menambahkan isi display
	}
	
	@Override
	void takeDamage(double damage) {
		System.out.println(this.name + " recieve half damage " + damage + " -> " + 0.5*damage);
		this.health = this.health - 0.5*damage;
	}
	
}
