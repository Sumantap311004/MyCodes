package Session16_HirarkiPackageTambahan;

//Visibilitas untuk Semuanya
public class Console {
	public static void log(String message) {
		System.out.println(message);
	}
}


// Ini akan hanya bisa diakses dari Package ini saja.

class Terminal{
	public static void log(String message) {
		System.out.println(message);
	}
}

