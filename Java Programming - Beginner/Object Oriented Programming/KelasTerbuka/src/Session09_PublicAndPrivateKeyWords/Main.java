package Session09_PublicAndPrivateKeyWords;

class Player{
	String name; //Defult, dia akan bisa dibaca dan ditulis dari luar class
	public int exp; //Public, dia akan bisa dibaca dan ditulis dari luar class
	private int health; //Private, hanya akan bisa dibaca dan ditulis di dalam class saja
	
	Player(String name, int exp, int health){
		this.name = name;
		this.exp = exp;
		this.health = health;
	}
	
	//Default modifier access
	void display() {
		tambahExp(); //Contoh Mengakses si Private Methods
		System.out.println("\nName\t: " + this.name);
		System.out.println("Exp\t: " + this.exp);
		System.out.println("Health\t: " + this.health); //Membaca di dalam Class
	}
	
	//Public
	public void ubahName(String nameBaru) {
		this.name = nameBaru;
	}
	
	//Private
	private void tambahExp() {
		this.exp += 100;
	}
}

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player("Marni", 0, 100);
		
		//Default
		System.out.println(player1.name); //Membaca data
		player1.name = "Surti"; //Menulis data
		System.out.println(player1.name); //Rewrite
		
		//Public
		System.out.println(player1.exp); //Membaca data
		player1.exp = 100; //Menulis data
		System.out.println(player1.exp); //Rewrite
		
		/*
		//Private ---> Eror terjadi (Tidak bisa di akses
		System.out.println(player1.health); //Membaca data
		player1.health = 200; //Menulis data 
		System.out.println(player1.health); //
		*/
		
			// Method //
		//Default
		player1.display();
		
		//Public
		player1.ubahName("Tejo");
		player1.display();
		
		/*
		//Private
		player1.tambahExp(); //Tidak Bisa di akses
		*/
	}
}
