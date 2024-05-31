package Session04_Constructor;

//Class tanpa Constructor = Class Polos
class Polos {
	String dataString;
	int dataInteger;
}

//Class dengan Constructor -> Dipanggil saat object pertama kali dibuat
class Mahasiswa {
	String nama;
	String NIM;
	String Jurusan;
	
	/*
	Mahasiswa(){
		System.out.println("Ini adalah Constructor");
	}
	*/
	
	//Constructor dengan Parameter
	Mahasiswa(String inputNama, String inputNIM, String inputJurusan ){
		nama = inputNama;
		NIM = inputNIM;
		Jurusan = inputJurusan;
	}
	
}

public class Main {
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*
		Polos objectPolos = new Polos();
		objectPolos.dataString = "polos";
		objectPolos.dataInteger = 0;
		System.out.println(objectPolos.dataString);
		System.out.println(objectPolos.dataInteger);
		*/
		
		Mahasiswa mahasiswa1 = new Mahasiswa("Ucup", "2602078884", "Teknologi Informasi");
		Mahasiswa mahasiswa2 = new Mahasiswa("Otong", "2602077774", "Teknologi Informasi");
		System.out.println(mahasiswa1.nama);
		System.out.println(mahasiswa1.NIM);
		System.out.println(mahasiswa1.Jurusan);
		System.out.println(mahasiswa2.nama);
		System.out.println(mahasiswa2.NIM);
		System.out.println(mahasiswa2.Jurusan);
		// new Mahasiswa();
		
	}

}
