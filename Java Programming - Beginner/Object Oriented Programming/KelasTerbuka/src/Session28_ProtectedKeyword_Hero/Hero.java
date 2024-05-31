package Session28_ProtectedKeyword_Hero;

public abstract class Hero {
	protected String name; //Hanya bisa diakses oleh Subclass dari Hero
	//Tidak disarankan di Attribute untuk Protected
	private int level;
	
	public Hero(String name) {
		this.name = name;
		this.level = 1;
	}
	
	public abstract void display();
	
	protected String getName() {
		String str = "Name : " + this.name + " --- " + this.level;
		return str;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
}
