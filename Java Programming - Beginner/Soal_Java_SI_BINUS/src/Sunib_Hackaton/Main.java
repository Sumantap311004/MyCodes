package Sunib_Hackaton;

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
	ArrayList<String> emailList = new ArrayList<String>();
	ArrayList<String> gitList = new ArrayList<String>();
	ArrayList<String> webList = new ArrayList<String>();
	
	
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
		String groupName = null;
		do {
			System.out.print("Group name : ");
			groupName = sc.nextLine();
		} while (!(unique(groupName) && isAlphanum(groupName)));
		
		//Input email
		String email = null;
		do {
			System.out.print("Input email : ");
			email = sc.nextLine();
		} while (!(email.endsWith("@gmail.com") || email.endsWith("@sunib.ac.id")));
		
		//Input Github
		String github = null;
		do {
			System.out.print("Input Github : ");
			github = sc.nextLine();
		} while (!(github.startsWith("github.com/")));
		
		//Input Website
		String website = null;
		do { 
			System.out.print("Input website : ");
			website = sc.nextLine();
		} while (!(website.endsWith(".com") || website.startsWith("www.")));
		
		//Generate ID Generator
		String idGrup = groupName;
		String id1 = "T";
			// Random Character From
		char c1 = groupName.charAt(rand.nextInt(groupName.length()));
		char c2 = groupName.charAt(rand.nextInt(groupName.length()));
			// Random Number from 000 - 999
		int n1 = rand.nextInt(1000);
		//Formating
		String ID = String.format("%s%c%c%03d", id1, c1, c2, n1);
				
		//Discount Random
		int disc = rand.nextInt(21) + 10;
		//Regist Fee
		double regist = 150000 - (15000*(disc/100));
		
		//Validate order Confirmation
		String confirm = null;
		do {
			System.out.println("Confirm Order [ Y | N ] : ");
			confirm = sc.nextLine();
			
			if(confirm.equals("Y")) {
				//Print Output
				System.out.println("Success Input Order!");
				System.out.println("========================");
				System.out.println("Registration Info");
				System.out.println("========================");
				System.out.println("Team ID \t: " + ID);
				System.out.println("Team Name \t: " + groupName);
				System.out.println("Email \t: " + email);
				System.out.println("Github link \t: " + website);
				System.out.println("Total Discounr \t: " + (double)disc +"%");
				System.out.println("Regsitration Fee \t: " + regist);
				System.out.println("=========================");
				
				double money = 0;
				do {
					System.out.print("Input Your Money: ");
					money = sc.nextDouble();
				} while (!(money >= regist));
				
				//Calculate Charge
				double charge = money - regist;
				System.out.println("Charge: " + charge);
				
				System.out.println("");
				System.out.println("Thank You for Your Purchase");
				System.out.println("Success for your Competition");
				System.out.println("");
				
				idList.add(ID);
				nameList.add(groupName);
				emailList.add(email);
				gitList.add(github);
				webList.add(website);
			} 
			else if (confirm.equals("N")){
				break;
			}
		} while (!(confirm.equals("Y") || confirm.equals("N")));
	}
	
	public void menu2() {
		if (nameList.isEmpty()) {
			System.out.println("There is no History for Registant!!!");
			System.out.println("Press Enter to Continue....");
			sc.nextLine();
		}
		else {
			System.out.println("No. Team ID - Team Name - Email - Github - Website ");
			for (int i = 0; i < nameList.size(); i++) {
				System.out.printf("%d. %s - %s - %s - %s - %s ", (i+1), idList.get(i), nameList.get(i), emailList.get(i), gitList.get(i), webList.get(i));
				System.out.println("");
			}
			System.out.println("Press Enter To Continue...");
			sc.nextLine();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
