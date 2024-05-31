import java.util.Scanner;

public class WithOutArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anak = 0;
		
		do {
			System.out.print("Masukan banyak Mahasiswa [Minimal 3]:");
			Scanner input = new Scanner(System.in);
			anak = input.nextInt();
		} while (anak < 3);
		
		double nilai_masuk = 0;
		double nilai = 0;
		double nilai_tertinggi = 0;
		double nilai_terendah =  4;
				
		for (int i = 0; i < anak; i++) {
			System.out.print("Masukan IPK Mahasiwa ke-"+(i+1)+" : ");
			Scanner scan = new Scanner(System.in);
			nilai_masuk = scan.nextDouble();
			
			//Mencari Total Nilai
			nilai += nilai_masuk;
			//Mencari IPK Tertinggi
			if (nilai_tertinggi < nilai_masuk) nilai_tertinggi=nilai_masuk;
			//Mencari IPK Terendah
			if (nilai_terendah > nilai_masuk) nilai_terendah = nilai_masuk;
		}
		
		//Untuk menghitung rata-rata
		double nilai_rata = (double) ((nilai)/anak);
		System.out.println("IPK Rata-Rata Mahasiswa: "+nilai_rata);
		System.out.println("IPK Terendah Mahasiswa: "+nilai_terendah);
		System.out.println("IPK Tertinggi Mahasiswa: "+nilai_tertinggi);
		
		
	}
}
