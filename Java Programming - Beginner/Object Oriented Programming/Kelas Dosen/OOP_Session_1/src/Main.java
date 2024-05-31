import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Print Output
		System.out.println("Hello World");
		
		
		//STRING PRINTING//
/*
		String StudentName = "Louis Oktovianus";
		System.out.println(StudentName);
*/
		
		
		//ASCII PRINTING//
/*
		System.out.println("ASCII 65 = " + (char)65);
		System.out.println("ASCII 108 = " + (char)108);
*/
		
		
		//INPUT IN JAVA//
/*
		Scanner tc = new Scanner(System.in);
		System.out.print("Masukkan Angka Hokky: ");
		int number;
		number = tc.nextInt();
		System.out.println("Angka hokky anda: "+number);
		
		Scanner input = new Scanner(System.in); 
		System.out.print("Masukkan Nama: ");
		String nama;
		nama = input.next();
		System.out.println("Nama anda: "+nama);
*/	
		
		
		//Character Data Type
/*
		char letter = 'A';
		System.out.println(++letter);
*/
		
		
		//String Types
/*
		String word = "Hello World!";
		word  = word + " Welcome" + " to" + " Java Tutorial" + 1;
		System.out.println(word);
*/
		
		
		//Input String
/*
		Scanner input = new Scanner(System.in); 
		System.out.print("Masukkan Nama: ");
		String nama;
		nama = input.nextLine();
		System.out.println("Nama anda: "+nama);
*/
		
		
		//Simple Input/Output Code
/*
		int intVal;
		double doubleVal;
		String stringVal;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input an integer value : ");
		intVal = input.nextInt();
		System.out.println("Integer Value = " + intVal);
		
		System.out.println("Input a double value : ");
		doubleVal = input.nextDouble();
		System.out.println("Double Value = " + doubleVal);
		
		System.out.println("Input a String value without space : ");
		stringVal = input.next();
		System.out.println("String Value = " + stringVal);
*/	
		
		
		// Selection (Two Way If Statement)
/*
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
*/

		
		//Nested If
/*
		float score= 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Input Score[0..100]: ");
		score = input.nextFloat();
		char grade = 0;
		
		
			//Method 1
//		if (score >= 90)
//			grade = 'A';
//		else
//			if (score >= 80)
//				grade = 'B';
//			else
//				if (score >= 70)
//					grade = 'C';
//				else 
//					if (score >= 60)
//						grade = 'D';
//					else
//						grade = 'F';
		
		
		
			//Method 2
		if (score >= 90)
			grade = 'A';
		else if (score >= 80)
			grade = 'B';
		else if (score >= 70)
			grade = 'C';
		else if (score >= 60)
			grade = 'D';
		else
			grade = 'F';
		
		
		System.out.println("Your Score is "+grade);
*/
		
		//Switch Case
/*
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a value: ");
		number = input.nextInt();
		switch(number%2){
			case 0:
				System.out.println(number+" is an even number");
				break;
			case 1:
				System.out.println(number+" is an add number");
				break;
		}
*/
		
		
		//Tenary Operations
/*
		int x = 1;
		int y;
		y = (x > 0) ? 1 : -1;
		System.out.println(y); //Validasi benar atau salah.
*/
		
	
		//While vs Do-While
/*
		int i=-1;
		
			//While
		System.out.print("Isi While: ");
		while(i>0)
		{
			System.out.println("Welcome to Java!");
			i--;
		}
		
		System.out.println("");
		System.out.print("Isi Do While: ");
		do 
		{
			System.out.println("Welcome to Java!");
			i--;
		} while (i > 0);
*/
		
		
		//Nested Loops
/*
		int number;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Triangel Maker");
		System.out.println("================");
		System.out.print("Input number : ");
		number = input.nextInt();
		System.out.println();
		
		for (int i=1; i<=number; i++){
			for (int j=1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
*/
		
		
		//Break Operation
/*
		int sum = 0;
		int number = 0;
		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;
		}
		System.out.println("The number is "+number);
		System.out.println("The sum is "+sum);
*/
		
		
		//Continue Operation
/*
		int sum = 0;
		int number = 0;
		while (number < 20) {
			number++;
			if (number == 10 || number == 11)
				continue;
			sum += number;
		}
		System.out.println("The sum is "+sum);
*/
		
	}
}