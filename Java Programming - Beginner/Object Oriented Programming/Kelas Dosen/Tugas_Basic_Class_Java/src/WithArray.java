import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class WithArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anak = 0;
		
		do {
			System.out.print("Masukan banyak Mahasiswa [Minimal 3]:");
			Scanner input = new Scanner(System.in);
			anak = input.nextInt();
		} while (anak < 3);
		
		int isi_array = anak + 5;
		double [] mahasiswa = new double [isi_array];
		
		for (int i = 0; i < anak; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Masukan IPK Mahasiwa ke-"+(i+1)+" : ");
			mahasiswa[i] = scan.nextDouble();
		}
		
		double nilai = 0;
		double nilai_tertinggi = 0;
		double nilai_terendah =  4;
		
		for (int i = 0; i < anak; i++) {
			nilai += mahasiswa[i];
			if (nilai_tertinggi < mahasiswa[i]) nilai_tertinggi = mahasiswa[i];
			if (nilai_terendah > mahasiswa[i]) nilai_terendah = mahasiswa[i];
		}
		
		//Untuk menghitung rata-rata
		double nilai_rata = (double) ((nilai)/anak);
		
		//Proses Print
		System.out.printf("IPK Rata-Rata Mahasiswa: %.2f", nilai_rata);
		System.out.println("");
		System.out.println("IPK Terendah Mahasiswa: "+nilai_terendah);
		System.out.println("IPK Tertinggi Mahasiswa: "+nilai_tertinggi);
		for (int i = 0; i < anak; i++) {
			System.out.println("IPK Mahasiwa ke-"+(i+1)+" : "+mahasiswa[i]);	
		}
	}
}
