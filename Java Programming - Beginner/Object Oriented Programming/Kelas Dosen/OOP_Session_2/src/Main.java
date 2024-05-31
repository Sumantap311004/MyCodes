import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	/*
		// Wrapper Class Constants
		System.out.println("Nilai Max Integer = "+Integer.MAX_VALUE);
		System.out.println("Nilai Min Positive Float = "+Float.MIN_VALUE);
		System.out.println("Nilai Max Double = "+Double.MAX_VALUE);
	*/
		
	/*
		// Conversion Function
		Integer i = Integer.valueOf("12");
		Double d = Double.valueOf("12.4");
		
		Integer ii = new Integer("12");
		Double dd = new Double("12.4");
		
		Double ddd = Double.valueOf("12.4");
		Integer iiii = Integer.valueOf("12");
		
		Double dddd = Double.valueOf("12.4");
		Integer iiii = Integer.valueOf("12");
		
		Integer wow = Integer.parseInt("12.4");
		Double wow2 = Double.parseDouble("12");
		
		String kata = new String("12");
		kata = "" + 12;
		System.out.println(kont);
	*/
	
	/*
		// String
		String kata1 = "Welcome";
		String kata2 = "Halo Apa Kabar?";
		String kata3 = "Welcome#to#Java!";
		
		System.out.println("Panjang Kata1 = "+kata1.length());
		System.out.println("Huruf ke-3 dari kata2 = "+kata2.charAt(2));
		System.out.println("Kata 1 + Kata 2 = "+(kata1+kata2));
		System.out.println("Huruf ke 2-7 dari kata 3 = "+kata3.substring(3,7));
		System.out.println("Huruf besar dari kata 2 = "+kata2.toUpperCase());
		System.out.println("Mengganti '# menjadi ' ' dari kata ke 3 = "+ kata3.replace('#', ' '));
	*/
	
	/*
		//Math
		int sudut1 = 30, sudut2 = 45, sudut3 = 60, sudut4 = 90;
		
		//System.out.println("sin(30 deg) = "+Math.sin(sudut1*0.0174));
		//System.out.println("sin(45 deg) = "+Math.sin(sudut2*0.0174)); 
		//System.out.println("sin(60 deg) = "+Math.sin(sudut3*0.0174)); 
		//System.out.println("sin(90 deg) = "+Math.sin(sudut4*0.0174)); 
		
		System.out.println("sin(30 deg) = "+Math.sin(Math.toRadians(sudut1)));
		System.out.println("sin(45 deg) = "+Math.sin(Math.toRadians(sudut2))); 
		System.out.println("sin(60 deg) = "+Math.sin(Math.toRadians(sudut3)));
		System.out.println("sin(90 deg) = "+Math.sin(Math.toRadians(sudut4)));
	*/
		
	/*
		//Random Generator
			// angka 1-6
		Integer j = (int)(Math.random()*6)+1;
		System.out.println("Angka 1-6 = " + j);
				
			// genap 0-10
		Integer i = (int)(Math.random()*6)*2;
		System.out.println("angka genap = " +i);
				
			// angka -1,0,1
		Integer x = (int)(Math.random()*3)-1;
		System.out.println("Angka -1,0,1 = "+ x);
				
			// angka -1,1
		Integer y = (int) (Math.random()*2)*2-1;
		System.out.println("Angka -1,1 = "+y);
	*/	
		
		//	Exception Handling Overview
		float value = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input value[0..100]: ");
		try {
			value = input.nextFloat();
			if (value < 0 || value > 100)
				System.out.println("Wrong input");
			else
				System.out.println("Your input value: "+value);
		} catch (Exception e) {
			System.out.println("Input must be number");
		}
		
	}
}
