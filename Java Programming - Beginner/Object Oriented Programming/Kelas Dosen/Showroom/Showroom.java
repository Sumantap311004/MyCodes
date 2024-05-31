
import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {
	
	static ArrayList<Jeep> JeepList = new ArrayList<Jeep>();
	static ArrayList<SUV> SUVList = new ArrayList<SUV>();
	static ArrayList<Sedan> SedanList = new ArrayList<Sedan>();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to The Showroom");
		
		Scanner scan = new Scanner(System.in);
		int opt;
		do {
			System.out.println("Please choose an option");
			System.out.println("1. Buy");
			System.out.println("2. Show");
			System.out.println("3. Exit");
			System.out.print("Input: ");
			
			opt = scan.nextInt();

			switch(opt) {
			case 1: {
				buy();
				break;
			}
			case 2: {
				show();
				break;			
			}
			case 3: {
				exit();
				break;
			}
			default: {
				System.out.println("Incorrect Input");
				break;
			}
			}			
		}while(opt != 3);

//		scan.close();
		
	}
	
	public static void buy() {
		
		Scanner scan = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		int opt;
		do {
			System.out.println("Please choose an option");
			System.out.println("1. Jeep");
			System.out.println("2. SUV");
			System.out.println("3. Sedan");
			System.out.print("Input: ");
			
			opt = scan.nextInt();
			
			switch(opt) {
			case 1: {
				System.out.print("Car's name: ");
				String name = scanStr.nextLine();
				Jeep newJeep = new Jeep(name);
				JeepList.add(newJeep);
				break;
			}
			case 2: {
				System.out.print("Car's name: ");
				String name = scanStr.nextLine();
				SUV newSUV = new SUV(name);
				SUVList.add(newSUV);
				break;
			}
			case 3: {
				System.out.print("Car's name: ");
				String name = scanStr.nextLine();
				Sedan newSedan = new Sedan(name);
				SedanList.add(newSedan);
				break;
			}
			default: {
				System.out.println("Incorrect Input");
				break;
			}
			}
		}while(opt > 3 || opt < 1);
		
//		scan.close();
//		scanStr.close();
	}
	
	public static void show() {
		System.out.println("List Car");
		System.out.println("========");
		System.out.println("Jeep");
		System.out.println("========");
		for(Jeep temp : JeepList) {
			System.out.println(temp.getName());
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("========");
		System.out.println("SUV");
		System.out.println("========");
		for(SUV temp : SUVList) {
			System.out.println(temp.getName());
		}
		System.out.println("");
		System.out.println("");
		
		System.out.println("========");
		System.out.println("Sedan");
		System.out.println("========");
		for(Sedan temp : SedanList) {
			System.out.println(temp.getName());
		}
		System.out.println("");
		System.out.println("");
	}
	
	public static void exit() {
		System.out.println("Thankyou for using this program!");
	}

}
