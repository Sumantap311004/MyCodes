package session2;
//wrapper class

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//pool
		Integer umur = 18;
		Integer umur2 = new Integer(18);
		
		System.out.println("umur awal: " +umur);
		System.out.println("umur dua: " +umur2.toString());
		
		//ini tuh yg di cek object nya bukan value/nilai nya jd meski umurnya sama kedetek beda jd ya gausa dpake
		Boolean umurSama = umur == umur2;
		System.out.println("kalo pake sama dengan doang");
		if(umurSama) {
			System.out.println("ya umurnya sama");
		}else {
			System.out.println("ga umurnya ga sama");
		}
		
		
		//ini baru benar, bsa pake salah 1
		//kalo bandingin nilai atau value (string, int, dll) jangan pake == tapi pake equals
		Boolean cekUmur = umur.equals(umur2);
		Boolean cekUmurlg = umur.compareTo(umur2) == 0; //kek strcmp aj si
		
		System.out.println("kalo pake equals");
		if(cekUmur) {
			System.out.println("ya umurnya sama");
		}else {
			System.out.println("ga umurnya ga sama");
		}
		
		//parseInt -> static method dr integer
		//static method tu brarti kita bisa lgsg pake gt
		umur = Integer.parseInt("3000");
		System.out.println("umur: " +umur);
		int umur3 = Integer.parseInt("6000");
		System.out.println("max nilai integer: " +Integer.MAX_VALUE);
		System.out.println("min nilai integer: " +Integer.MIN_VALUE);
		
		int umur4 = umur;
		System.out.println("ini umur 4: " +umur4);
		
		System.out.println("");
		
		//dari string kr integer
		String umurString = umur.toString(); //cara 1
		String umurStringlg = umur + ""; //cara 2
		
		String kata = "halo kawan";
		String kata2 = "iya halo kawan";
		
		//bisa tapi kalo buat cek biasa doang
		//kalo misalnya stringnya diubah2 objectnya atau apa gt tar dia gasama jdinya
		if(kata == "halo kawan") {
			System.out.println("katanya halo kawan");
		}else {
			System.out.println("katanya bukan halo kawan");
		}
		
		//nah kalo pake equals tu bsa meski dganti ke new String gt
		if(kata.equals(new String("halo kawan"))) {
			System.out.println("katanya halo kawan");
		}else {
			System.out.println("katanya bukan halo kawan");
		}
		
		//cek karakter kesekian dri 1 string
		System.out.println("huruf ke-5 dari kata: " +kata.charAt(5)); //brarti karakter ke6
		//cek kata depan/blakang
		System.out.println("apakah kata depannya halo?");
		if(kata.startsWith("halo")) {
			System.out.println("yesyes betul");
		}else {
			System.out.println("nope nope");
		}
	
		String email = "duridam@gmail.com";
		if(email.endsWith("@gmail.com")) {
			System.out.println("emailny valid");
		}else {
			System.out.println("emailny ga valid");
		}
		
		if(email.contains("@")) {
			System.out.println("email ada @ny");
		}
		
		//buat nyari tau brapa panjang string
		System.out.println("panjang email: " +email.length());
		
		//ada trim buat ngilangin space sebelum kata dan/atau sesudah kata paling akhir
		System.out.println("   gini misalnya   ");
		System.out.println("   jadi gini   " .trim());
		
		//masih ada bnyak di ppt silahkan lihat
		
		System.out.println(Math.pow(5, 2)); //pangkat
		System.out.println(Math.sqrt(25)); //akar
		System.out.println("yg paling besar: " +Math.max(25, 5)); //max gt
		System.out.println("yg paling kecil: " +Math.min(25, 5)); //min
		System.out.println("PI: " +Math.PI); //pi
		
		//increment decrement jg ad
		
		//gatau ini apaan gphm
//		Scanner sc = new Scanner(System.in);
//		System.out.println("angka: ");
//		int angka;
//		try {
//			angka = sc.nextInt();
////			return;
//		}catch (Exception e) {
//			System.out.println("input tidak valid");
//			angka = -1;
//		}finally {
//			sc.nextLine();
//		}
//		sc.nextLine();
//		System.out.println("angka: "  +angka);
		
		//blok dl + alt + shift + z buat lgsg gt
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i <= j; i++) {
				System.out.print("+");
			} 
			System.out.println("");
		}
		
		
		
		
		
		
	}

}
