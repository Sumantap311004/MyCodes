package session1;

import java.util.Scanner;

public class HelloWorld {
	
	//bsa ketik main trs teken ctrl + space bar
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ketik "syso" trs teken ctrl + space bar
		System.out.println("hello world!"); //campuran printf tp ada \n ny
		System.out.printf("hello world!"); //ya printf
		//pake System.out.print() bisa jg tp dia kek puts gt bsa kalimat doang(?)
		
		System.out.printf("\n");
		
		int angka = 19;
		System.out.println("angkanya: "+angka); //pake tanda +nya
		System.out.printf("%d\n", angka);
		
		char karakter = 'g';
		System.out.println("ini karakter: "+karakter);
		
		String nama = "duridam"; //String ya gabisa string
		System.out.println(nama);
		
		System.out.println("1 + 1 = "+(1 + 1)); 
		//klo +1+1 nnti 11 krna 1 ny jd string, mkanya hrs pake tnda kurung
		
		double desimal = 6.28;
		
		//normalnya pake double, klo mo pake float hrs diubah dl
		float desimal2 = (float) 3.14;
		
		System.out.println(desimal);
		System.out.println(desimal2);
		
		//ketik "scan" trs ctrl + space bar biar ada import-annya diatas
		Scanner sc = new Scanner(System.in);
		System.out.print("input nama pls-> ");
		String nama2 = sc.nextLine(); //Lnya harus kapital, dn initu buat enter gt
		System.out.println("nama yang diinput: "+nama2);
		
		System.out.print("input umur pls-> ");
		int umur = sc.nextInt();
		sc.nextLine(); //ini tu mungkin buat spasi gt
		System.out.println("umur km adalah = "+umur);
	
		String kata = umur > 30 ? "tua" : "muda"; //Tenary Operator
//		atau pake if biasa jg bsa
//		if(umur > 30) {
//			kata = "tua";
//		}else {
//			kata = "muda";
//		}
		
		System.out.println("berdasarkan umurmu, km itu "+kata);
	}

}
