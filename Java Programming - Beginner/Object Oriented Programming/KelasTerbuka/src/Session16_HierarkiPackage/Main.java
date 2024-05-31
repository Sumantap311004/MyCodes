package Session16_HierarkiPackage;

	// Ini akan mengimport Class Console
import Session16_HirarkiPackageTambahan.Console;
//import Session16_HirarkiPackageTambahan.Terminal;

	// Mengimport Static Method dari Console
import static Session16_HirarkiPackageTambahan.Console.log;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new Player ("Otong");
		player1.show();
		System.out.println("");
		
		Console.log("Menampilkan data dengan Console.log");
		Console.log(player1.getName());
		System.out.println("");
//		Terminal.log(player1.getName());
		
		log("Menampilkan data dengan log");
		log(player1.getName());
		
	}
}


// Ini tidak bisa digunakan, Penggunaan Private tidak diperkenankan.
/*
private class Test{
	
}
*/