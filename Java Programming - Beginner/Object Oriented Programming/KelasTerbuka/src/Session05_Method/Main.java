package Session05_Method;

class Mahasiswa {
	//Data member
	String nama;
	String NIM;
	
	//Consructor
	Mahasiswa(String Nama, String NIM){
		this.nama = Nama;
		this.NIM = NIM;
		// Main.Test();
	}
	
	//Method tanpa Return dan tanpa Parameter
	void show() {
		System.out.println("Nama : " + this.nama);
		System.out.println("NIM  : " + this.NIM);
		
	}
	
	//Method tanpa Return dan dengan Parameter
	void setNama(String nama) {
		this.nama = nama;
	}
	
	//Method dengan Return tapi tidak ada Parameter
		//Setter and Getter
	String getNama(){
		return this.nama;
	}
	
	String getNIM() {
		return this.NIM;
	}
	
	
	//Method dengan Return dan dengan Parameter
	String sayHi(String message) {
		return message + " juga, Nama saya adalah " + this.nama;
	}
}

class Dosen{
	String nama;
	
	Dosen(String nama){
		this.nama = nama;
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "2602078884");
		System.out.println(mahasiswa1.nama);
		
		// Test();
		
		//Method
		mahasiswa1.show();
		mahasiswa1.setNama("Tutung");
		mahasiswa1.show();
		
		
		System.out.println(mahasiswa1.getNama());
		System.out.println(mahasiswa1.getNIM());
		
		String data = mahasiswa1.sayHi("Ganteng");
		System.out.println(data);
		
		Dosen dosen1 = new Dosen("Otong");
	}
	
	/*
	static void Test() {
		System.out.println("Ini adalah Method Test");
	}
	*/
}
