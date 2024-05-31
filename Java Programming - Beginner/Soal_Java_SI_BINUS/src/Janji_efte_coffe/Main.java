package Janji_efte_coffe;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	// Scanner General
	Scanner sc = new Scanner(System.in);
	//Random Grobal
	Random rand = new Random();
	//Array List
	ArrayList<String> idList = new ArrayList<String>();
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<String> coffeeList = new ArrayList<String>();
	ArrayList<String> cupList = new ArrayList<String>();
	ArrayList<Integer> qtyList = new ArrayList<Integer>();
	ArrayList<Double> totalList = new ArrayList<Double>();
	
	public Main() {
		// TODO Auto-generated constructor stub
		int input= 0;
		//Menu
		do {
			System.out.println("Sunib Hackaton");
			System.out.println("==============");
			System.out.println("1. Register Binus Hackaton");
			System.out.println("2. View All Registrant");
			System.out.println("3. Exit");
			System.out.print(">> ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch(input){
				case 1:{
					menu1();	
					break;
				}
				case 2:{
					menu2();
					break;
				}
			}
		} while (input != 3);

		System.out.println("Thank You for Using Our Apps!!!");
		System.out.println("Embrace the code, conquer the challange, let algorithms define excellence");
	}
	
	//Checking Space Character 
	int count;
	public int checkSpace(String str) {
	    count = 0;
		int word = str.length();
		for (int i = 0; i < word ; i++) {
			if (str.charAt(i) == ' ') 
				count++;
		}
		return count;
	}
	
	//Checking Alphabetical
	String Alphabet = null;
	public boolean isAlphanum(String str) {
		int word = str.length();
		for (int i = 0; i < word; i++) {
			if (str.charAt(i) == '0' || 
					str.charAt(i) == '1' ||
					str.charAt(i) == '2' ||
					str.charAt(i) == '3' ||
					str.charAt(i) == '4' ||
					str.charAt(i) == '5' ||
					str.charAt(i) == '6' || 
					str.charAt(i) == '7' || 
					str.charAt(i) == '8' ||
					str.charAt(i) == '9') {
				return true;
			}
		}
		return false;
	}
	
	//Checking Unique
	public boolean unique(String str) {
		int word = str.length();
		str = str.toLowerCase();
		for (int i = 1; i < word; i++) {
			for (int j= 0; j < i; j++) { 
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public void menu1() {
		//Input Name
		String custName = null;
		do {
			System.out.print("Group name : ");
			custName = sc.nextLine();
		} while (!(isAlphanum(custName)));
		
		//Input Coffee Name
		String coffeeName =  null;
		do {
			System.out.println("Input Coffee: ");
			coffeeName = sc.nextLine();
		} while (!(coffeeName.equals("Caffe Latte") || coffeeName.equals("Caramel Macchiato") || coffeeName.equals("Espresso")));
		
		//Input Cup Size
		String cupSize = null;
		do {
			System.out.println("Input Cup Size : ");
			cupSize = sc.nextLine();
		} while (!(cupSize.equals("Small") || cupSize.equals("Medium")));
		
		//Input Quantity
		int qty = 0;
		do {
			System.out.println("Input Quantity : ");
			qty = sc.nextInt();
			sc.nextLine();
		} while (!(qty > 0));
		
		//Generate Random ID
		String ID = null;
		String id1 = "OI";
		int  n1 = rand.nextInt(1000);
			//Formating
		ID = String.format("%s%03d", id1, n1);
		
		//Prize from Coffee Name
		int namePrice = 0;
		if (coffeeName.equals("Caffe Latte")) namePrice = 30000;
		else if (coffeeName.equals("Caramel Macchiato")) namePrice = 35000;
		else if (coffeeName.equals("Espresso")) namePrice = 40000;
		
		
		//Prize from Coffee Size
		int sizePrice = 0;
		if (cupSize.equals("Small")) sizePrice = 3000;
		else if (cupSize.equals("Medium")) sizePrice = 5000;
		
		//Calculate Tax
		double tax = ((qty * namePrice) + sizePrice) * (10/100);
		
		//Calculate Total Price
		double total = (qty * namePrice) + sizePrice + tax;
		
		
		//Screen Out
		System.out.println("========================");
		System.out.println("Order Detail");
		System.out.println("========================");
		System.out.println("Order ID \t: " + ID);
		System.out.println("Customer name \t: " + custName);
		System.out.println("Coffee name \t: " + coffeeName);
		System.out.println("Cup Size \t: " + cupSize);
		System.out.println("Quantity \t: " + qty);
		System.out.println("Total Price \t: " + total);
		
		//Input Money
		double money = 0;
		do {
			System.out.print("Input Your Money: ");
			money = sc.nextDouble();
		} while (!(money >= total));
		
		//Calculate Charge
		double charge = money - total;
		System.out.println("Charge: " + charge);
		
		System.out.println("");
		System.out.println("Thank You for Your Purchase");
		System.out.println("");
		
		//Adding Array List
		idList.add(ID);
		nameList.add(custName);
		coffeeList.add(coffeeName);
		cupList.add(cupSize);
		qtyList.add(qty);
		totalList.add(total);
		
	}
	
	public void menu2() {
		if (nameList.isEmpty()) {
			System.out.println("There is no History for Order!!!");
			System.out.println("Press Enter to Continue....");
			sc.nextLine();
		}
		else {
			System.out.println("No. Order ID - Customer Name - Coffee Name - Size Cup - Quantity - Total Price ");
			for (int i = 0; i < nameList.size(); i++) {
				System.out.printf("%d. %s - %s - %s - %s - %d - %f ", (i+1),idList.get(i), nameList.get(i), coffeeList.get(i), qtyList.get(i), totalList.get(i));
				System.out.println("");
			}
			System.out.println("Press Enter To Continue...");
			sc.nextLine();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
		new Main();
	}

}
