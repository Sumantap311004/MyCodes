package Bakmi_eFeTe;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	// Scanner General
	Scanner sc = new Scanner(System.in);
	//Random Grobal
	Random rand = new Random();
	//Array List
	ArrayList<String> idList = new ArrayList<String>();
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<String> foodList = new ArrayList<String>();
	ArrayList<Integer> qtyList = new ArrayList<Integer>();
	ArrayList<String> methodList = new ArrayList<String>();
	ArrayList<Double> totalPriceList = new ArrayList<Double>();

	public Main() {
		// TODO Auto-generated constructor stub
		int input= 0;
		//Menu
		do {
			System.out.println("Bakmi Efete");
			System.out.println("==============");
			System.out.println("1. Order Menu");
			System.out.println("2. View Order History");
			System.out.println("3. Exit");
			System.out.print(">> ");
			input = sc.nextInt();
			sc.nextLine();
			
			switch (input){
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
	}
	
	public void menu1() {
		//Input Name
		String name = null;
		do {
			System.out.print("Input name: ");
			name = sc.nextLine();
		} while (!(name.length() > 5));
		
		//Input Food Name
		String food = null;
		do {
			System.out.print("Input Food name: ");
			food = sc.nextLine();
		} while (!(food.equals("Bakmi Keriting") || food.equals("Bakmi Lebar")));
		
		//Input Food Price
		int price = 0;
		do {
			System.out.print("Input Food Price: ");
			price = sc.nextInt();
			sc.nextLine();
		} while (!(price > 10000));
		
		//Input Quantity
		int qty = 0;
		do {
			System.out.print("Input Quantity: ");
			qty = sc.nextInt();
			sc.nextLine();
		} while (!(qty > 0));
		
		//Input Payment Method
		String paymentMethod = null;
		do {
			System.out.print("Input Payment Method: ");
			paymentMethod = sc.nextLine();
		} while (!(paymentMethod.equals("Transfer") || paymentMethod.equals("QRIS") || paymentMethod.equals("Cash")));
		
		//Payment Point
		int paymentPoint = 0;
		if (paymentMethod.equals("Cash")) {
			paymentPoint = 0;
		}
		else if (paymentMethod.equals("Transfer")) {
			paymentPoint = 5;
		}
		else if (paymentMethod.equals("QRIS")) {
			paymentPoint = 10;
		}
		
		//Calculate total Discount
		int totalDiscount = name.length() + paymentPoint;
		
		//Calculate TotalPrice
		double totalPrice = (price*qty) - ((price*qty)*(totalDiscount/100));
		
		//Generate ID
		String generateID = null;
		String id1 = "BI";
		int  n1 = rand.nextInt(1000);
			//Formating
		generateID = String.format("%s%03d", id1, n1);
		
		
		//Print OutScreen
		System.out.println("");
		System.out.println("========================");
		System.out.println("Bill");
		System.out.println("========================");
		System.out.println("Bill ID \t: " + generateID);
		System.out.println("Customer Name \t: " + name);
		System.out.println("Food Name \t: " + food);
		System.out.println("Food Price \t: " + price);
		System.out.println("Quantity \t: " + qty);
		System.out.println("Total Discount \t: " + (double)totalDiscount + "%");
		System.out.println("Total Price \t: " + totalPrice);
		System.out.println("Payment Method \t: " + paymentMethod);
		System.out.println("========================");
		
		//Input Money
		double money = 0;
		do {
			System.out.print("Input Your Money: ");
			money = sc.nextDouble();
		} while (!(money >= totalPrice));
		
		//Calculate Charge
		double charge = money - totalPrice;
		System.out.println("Charge: " + charge);
		
		System.out.println("");
		System.out.println("Thank You for Your Purchase");
		System.out.println("");
		
		//Adding Array List
		idList.add(generateID);
		nameList.add(name);
		foodList.add(food);
		qtyList.add(qty);
		methodList.add(paymentMethod);
		totalPriceList.add(totalPrice);
	}
	
	public void menu2() {
		if (nameList.isEmpty()) {
			System.out.println("There is no History for Food!!!");
			System.out.println("Press Enter to Continue....");
			sc.nextLine();
		}
		else {
			System.out.println("No. Order ID - Customer Name - Food Name - Quantity - Payment Method - Total Price ");
			for (int i = 0; i < nameList.size(); i++) {
				System.out.printf("%d. %s - %s - %s - %d - %s - %d ", (i+1),idList.get(i), nameList.get(i), foodList.get(i), qtyList.get(i), methodList.get(i), totalPriceList.get(i));
				System.out.println("");
			}
			System.out.println("Press Enter To Continue...");
			sc.nextLine();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		new Main();

	}
}
