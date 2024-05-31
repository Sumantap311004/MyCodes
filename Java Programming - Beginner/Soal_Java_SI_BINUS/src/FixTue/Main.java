package FixTue;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	// Scanner General
	Scanner sc = new Scanner(System.in);
	//Random Grobal
	Random rand = new Random();
	//Array List
	ArrayList<String> IDList = new ArrayList<String>();
	ArrayList<String> NameCustList = new ArrayList<String>();
	ArrayList<String> DrinkNameList = new ArrayList<String>();
	ArrayList<String> CupTypeList = new ArrayList<String>();
	ArrayList<String> PaymentMethodList = new ArrayList<String>();
	ArrayList<Integer> QuantityList = new ArrayList<Integer>();
	ArrayList<Double> TotalPaymentList = new ArrayList<Double>();
	
	public Main() {
		// TODO Auto-generated constructor stub
		int input = 0;
		
		//Menu
		do {
			System.out.println("FixTue");
			System.out.println("=======");
			System.out.println("1. Order Drink");
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
		// Name Input
		String nameCust = null;
		do {
			System.out.print("Input Customer name: ");
			nameCust = sc.nextLine();
		} while (!(nameCust.length()< 15 && nameCust.length() > 5));
		
		// DrinkName Input
		String nameDrink = null;
		do {
			System.out.print("Input Your Drink Name: ");
			nameDrink = sc.nextLine();
		} while (!(nameDrink.equals("Brown Sugar") || nameDrink.equals("Red Bean") || nameDrink.equals("Oats")));
		
		//Drink name price
		int drinknamePrice = 0;
		if (nameDrink.equals("Brown Sugar")){
			drinknamePrice = 20000;
		}
		else if (nameDrink.equals("Red Bean")) {
			drinknamePrice = 17000;
		}
		else if (nameDrink.equals("Oats")){
			drinknamePrice = 15000;
		}
		
		//Cup Type
		String cupType = null;
		do {
			System.out.print("Input your Cup Type: ");
			cupType = sc.nextLine();
		} while (!(cupType.equals("Small") || cupType.equals("Medium") || cupType.equals("Large")));
		
		//Cup Type Price
		int cupTypePrice = 0;
		if (cupType.equals("Small")){
			cupTypePrice = 0;
		}
		else if (cupType.equals("Medium")) {
			cupTypePrice = 2000;
		}
		else if (cupType.equals("Large")) {
			cupTypePrice = 5000;
		}
		
		//Quantity
		int qty = 0;
		do {
			System.out.print("Input your Quantity: ");
			qty = sc.nextInt();
			sc.nextLine();
		} while (!(qty > 0));
		
		//Input Payment Method
		String paymentMethod = null;
		do {
			System.out.print("Input your Payment Method: ");
			paymentMethod = sc.nextLine();
		} while (!(paymentMethod.equals("Transfer") || paymentMethod.equals("QRIS")));
		
		//Payment Point
		int paymentPoint = 0;
		if (paymentMethod.equals("Transfer")) {
			paymentPoint = 5;
		}
		else if (paymentMethod.equals("QRIS")) {
			paymentPoint = 10;
		}
		
		//Calculate Total Price
		int totalPrice = 0;
		totalPrice = (drinknamePrice + cupTypePrice)* qty;
		
		//Calculate Discount
		int totalDiscount =0;
		totalDiscount = nameCust.length() + paymentPoint;
		
		//Calculate Total Payment
		double totalPayment = 0;
		totalPayment = totalPrice - (totalPrice*(totalDiscount/100));
		
		//Generate Bill ID
		String ID = null;
		String id1 = "BL";
		int n1 = rand.nextInt(1000);
			//Formating
		ID = String.format("%S%03d", id1, n1);
		
		
		//Print the Output First
		System.out.println("");
		System.out.println("===============================");
		System.out.println("Bill ID \t: " + ID);
		System.out.println("Customer name \t: " + nameCust);
		System.out.println("Drink name  \t: " + nameDrink);
		System.out.println("Drink price \t"  + drinknamePrice);
		System.out.println("Cup Type \t: " + cupType);
		System.out.println("Cup Type Price \t: " + cupTypePrice);
		System.out.println("Quantity \t: " + qty);
		System.out.println("Payment Method \t: " + paymentMethod);
		System.out.println("Total Discount \t: " + (float)totalDiscount + "%" );
		System.out.println("Total Price \t: " + totalPayment);
		System.out.println("===============================");
		
		//Input Money
		double money = 0;
		do {
			System.out.print("Input Your money: ");
			money = sc.nextDouble();
		} while (!(money >= totalPayment));
		
		//Charge
		double charge = money - totalPayment;
		System.out.println("Charge : " + charge);
		
		System.out.println("");
		System.out.println("Thank You");
		
		//Adding Array List
		IDList.add(ID);
		NameCustList.add(nameCust);
		DrinkNameList.add(nameDrink);
		CupTypeList.add(cupType);
		QuantityList.add(qty);
		PaymentMethodList.add(paymentMethod);
		TotalPaymentList.add(totalPayment);
	}
	
	
	public void menu2() {
		if (NameCustList.isEmpty()) {
			System.out.println("There is no History for Drinks!!!");
			System.out.println("Press Enter to Continue....");
			sc.nextLine();
		}
		else {
			System.out.println("No. ID - Cust Name - Drink Name - Cup Type - Quantity - Payment Method - Total Price");
			for (int i = 0; i < NameCustList.size(); i++) {
				System.out.printf("%d. %s - %s - %s - %s - %d - %s - %f ", (i+1),IDList.get(i), NameCustList.get(i), DrinkNameList.get(i), CupTypeList.get(i), QuantityList.get(i), PaymentMethodList.get(i), TotalPaymentList.get(i));
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
