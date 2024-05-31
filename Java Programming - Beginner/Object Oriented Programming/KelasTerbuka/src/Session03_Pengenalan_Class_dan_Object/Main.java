package Session03_Pengenalan_Class_dan_Object;


//Membuat Class sebagai Template
class Mahasiswa{
	String nama;
	String NIM;
	String Jurusan;
	double IPK;
	int Umur;
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello WOrld!!!");
		
		//Instantiasi = membuat object
		Mahasiswa mahasiswa1 = new Mahasiswa();
		
		//Asssign Nilai
		mahasiswa1.nama = "Ucup";
		mahasiswa1.NIM = "2602078884";
		mahasiswa1.Jurusan = "Teknologi Informasi";
		mahasiswa1.IPK = 4.0;
		mahasiswa1.Umur = 17;
		
		//Memanggil dan menampilkan hasil
		System.out.println(mahasiswa1.nama);
		System.out.println(mahasiswa1.NIM);
		System.out.println(mahasiswa1.Jurusan);
		System.out.println(mahasiswa1.IPK);
		System.out.println(mahasiswa1.Umur);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		Mahasiswa mahasiswa2 = new Mahasiswa();
		mahasiswa1.nama = "Banana";
		mahasiswa1.NIM = "2602077774";
		mahasiswa1.Jurusan = "Teknologi Informasi";
		mahasiswa1.IPK = 2.9;
		mahasiswa1.Umur = 18;
		System.out.println(mahasiswa1.nama);
		System.out.println(mahasiswa1.NIM);
		System.out.println(mahasiswa1.Jurusan);
		System.out.println(mahasiswa1.IPK);
		System.out.println(mahasiswa1.Umur);
	}

}
