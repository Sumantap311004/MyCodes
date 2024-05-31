package GoFot;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main_Belajar {
	
	ArrayList<String> nameList = new ArrayList<String>(); //ArrayList Name
	ArrayList<String> frenchiseList = new ArrayList<String>();// Array List Frenchise
	ArrayList<String> foodNameList = new ArrayList<String>(); // ArrayList FoodName
	ArrayList<Integer> qtyList = new ArrayList<Integer>(); // ArrayList Qty
	ArrayList<String> noteList = new ArrayList<String>(); // ArrayList Note
	ArrayList<String> idList = new ArrayList<String>(); // ArrayList ID
	ArrayList<Double> totalPriceList = new ArrayList<Double>(); //Array List Total Price
	Scanner sc = new Scanner (System.in);
	Random rand = new Random();
	
	//Variable Grobal
	String frenchise = null; //Agar bisa diakses Generator
	
	public Main_Belajar() {
		int input = 0;
		
		//Menu
		do {
			System.out.println("GoFot");
			System.out.println("=======");
			System.out.println("1. Order GoFot");
			System.out.println("2. View All Order History");
			System.out.println("3. Exit");
			System.out.print(">> ");
			input = sc.nextInt();
			sc.nextLine();
			
			if (input == 1) {
				menu1();
			} 
			else if (input == 2) {
				menu2();
			}
			
		} while (input != 3);
		
		System.out.println("Thank You for Using Our Apps!!!");
		
	}
	
	public void menu1() {
		
		//Input Nama
		String name = null;
		do {
			System.out.print("Input Customer: ");
			name = sc.nextLine();
		} while (!(name.length()>=7 && name.length()<=15) && 
				 !(name.startsWith("Mrs.") || name.startsWith("Mr.")));
		
		//Input Francise
		frenchise = null;
		do {
			System.out.print("Input Frenchise Name: ");
			frenchise = sc.nextLine();
		} while (!(frenchise.equals("Fkc") || frenchise.equals("Cmd")));
		
		//Input FoodName
		String foodName = null;
		do {
			System.out.print("Input Food Name: ");
			foodName = sc.nextLine();
		} while (!(foodName.equals("Burger") || foodName.equals("Fried Chiken") || foodName.equals("French Fries")));
		
		//Rumus food-Price
		Integer foodPrice = 0;
		if (foodName.equals("Burger")) {
			foodPrice = 17000;
		} else if (foodName.equals("Fried Chiken")) {
			foodPrice = 22000;
		} else if (foodName.equals("French Fries")) {
			foodPrice = 12000;
		}
		
		//Input Quantity
		int qty = 0;
		do {
			System.out.print("Input Quantity: ");
			qty = sc.nextInt(); 
			sc.nextLine();
		} while (!(qty > 0));
		
		//Order Note
		String notes = null;
		do {
			 System.out.print("Input Notes: ");
			 notes = sc.nextLine();
		} while (!(notes.contains("Thank You")));
		
		//Generate ID Generator
		String frenchiseName = frenchise;
		String id1 = "RI";
			// Random Character From
		char c1 = frenchiseName.charAt(rand.nextInt(frenchiseName.length()));
		char c2 = frenchiseName.charAt(rand.nextInt(frenchiseName.length()));
			// Random Number from 000 - 999
		int n1 = rand.nextInt(1000);
		
		String ID = String.format("%s%c%c%03d", id1, c1, c2, n1);
		
		
		
		//Calculate tax
		double tax = 0;
		tax = (double) ((foodPrice * qty) * 10 / 100);
		
		
		//Calculate Total Price
		double totalPrice = 0;
		totalPrice = (foodPrice * qty) + tax;
		
		
		//Output Screen
		System.out.println("Order Information");
		System.out.println("Order ID: " + ID);
		System.out.println("Customer name: " + name);
		System.out.println("Food Name: " + foodName);
		System.out.println("Food Price: " + foodPrice);
		System.out.println("Quality: " + qty);
		System.out.println("Order Note: " + notes);
		System.out.println("Franchise Name: " + frenchise);
		System.out.println("Tax : " + tax);
		System.out.println("Total Price: " + totalPrice);
		
		//Validate order Confirmation
		String confirm = null;
		do {
			System.out.println("Confirm Order [ y | n ] : ");
			confirm = sc.nextLine();
			
			if(confirm.equals("y")) {
				System.out.println("Success Input Order!");
				nameList.add(name);
				frenchiseList.add(frenchise);
				qtyList.add(qty);
				noteList.add(notes);
				idList.add(ID);
				totalPriceList.add(totalPrice);
				foodNameList.add(foodName);
			} 
			else if (confirm.equals("n")){
				break;
			}
		} while (!(confirm.equals("y") || confirm.equals("n")));
	}
	
	public void menu2 () {
		if (nameList.isEmpty()) {
			System.out.println("There is no History for Order!!!");
			System.out.println("Press Enter to Continue....");
			sc.nextLine();
		}
		else {
			for (int i = 0; i < nameList.size(); i++) {
				System.out.printf("%d. %s %s %s %s %d %s %f", (i+1),idList.get(i), nameList.get(i), frenchiseList.get(i), foodNameList.get(i), qtyList.get(i),noteList.get(i), totalPriceList.get(i));
				System.out.println("");
			}
			System.out.println("Press Enter To Continue...");
			sc.nextLine();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		new Main_Belajar();
	}

}



