package Session24_Final_Public_PrivateKeyword;

public class Hero {
	public String name;
	private double health;
	
	Hero(String name, double health){
		this.name = name;
		this.health =  health;
	}
	
	//Getter
	public double getHealth() {
		return this.health;
	}
	
	//Setter
	final void setHealth(double newHealth) {
		this.health = newHealth;
	}
	
	//OverLoading
		//Bisa di ekspos oleh Subclass
	void setHealth(String mode) {
		if(mode.equals("reset")) {
			this.health = 100;
		}
	}
	
	public void display() {
		System.out.println(this.name + " mempunyai " + this.health);
	}

}
