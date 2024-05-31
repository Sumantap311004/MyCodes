package FokemonT;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	// Scanner General
	Scanner sc = new Scanner(System.in);
	//Random Grobal
	Random rand = new Random();
	//Array List
	ArrayList<String> nameList = new ArrayList<String>();
	ArrayList<String> idList = new ArrayList<String>();
	ArrayList<String> typeList = new ArrayList<String>();
	ArrayList<String> abilityList = new ArrayList<String>();
	ArrayList<Integer> healthList = new ArrayList<Integer>();
	ArrayList<Integer> attackList = new ArrayList<Integer>();
	
	
	
	public Main() {
		// TODO Auto-generated constructor stub
		int input= 0;
		//Menu
		do {
			System.out.println("Sunib Festival");
			System.out.println("==============");
			System.out.println("1. Insert Fokemon");
			System.out.println("2. View All Fokemon Index");
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
	public boolean isAlpha(String str) {
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
				return false;
			}
		}
		return true;
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

	public void menu1(){
		//Input Fokemon Name
		String name = null;
		do {
			System.out.print("Input your Fokemon Name: ");
			name = sc.nextLine();
		} while (!(isAlpha(name) && unique(name)));
		
		//Input Fokemon Type
		String type = null;
		do {
			System.out.print("Input your Fokemon Type: ");
			type = sc.nextLine();
		} while (!(type.equals("Fire") || type.equals("Water") || type.equals("Grass")));
		
		//Input Fokemon Health
		int health = 0;
		do {
			System.out.print("Input your Fokemon HP: ");
			health = sc.nextInt();
			sc.nextLine();
		} while (!(health > 100 && health < 1000));
		
		//Input Fokemon Attack
		int att = 0;
		do {
			System.out.print("Input your Fokemon Attack: ");
			att = sc.nextInt();
			sc.nextLine();
		} while (!(att > 100 && att <= 200));
		
		//Input Fokemon Abilities
		String ability = null;
		do {
			System.out.print("Input your Fokemon Abilities: ");
			ability = sc.nextLine();
			checkSpace(ability);
		} while (!(count >= 1));
		
		
		//Generate Fokemon ID
		String fokemonName = name;
		String id1 = "PI";
			// Random Characters From Name
		char c1 = fokemonName.charAt(rand.nextInt(fokemonName.length()));
		char c2 = fokemonName.charAt(rand.nextInt(fokemonName.length()));
			// Random Number from 000 - 999
		int n1 = rand.nextInt(1000);
			// String Formating
		String ID = String.format("%s%c%c%03d", id1, c1, c2, n1);
		
		//Output Screen
		System.out.println("Fokemon Information");
		System.out.println("Fokemon ID: " + ID);
		System.out.println("Fokemon name: " + name);
		System.out.println("Fokemon Type: " + type);
		System.out.println("Fokemon HP: " + health);
		System.out.println("Fokemon Attack: " + att);
		System.out.println("Fokemon Abilities: " + ability);
		
		//Adding List
		nameList.add(name);
		idList.add(ID);
		typeList.add(type);
		healthList.add(health);
		attackList.add(att);
		abilityList.add(ability);
		
	}
	
	public void menu2() {
		if (nameList.isEmpty()) {
			System.out.println("There is no History for Fokemon!!!");
			System.out.println("Press Enter to Continue....");
			sc.nextLine();
		}
		else {
			System.out.println("No. Pokemon ID - Fokemon Name - Fokemon Type - Fokemon Health - Fokemon Attack - Fokemon Abilty");
			for (int i = 0; i < nameList.size(); i++) {
				System.out.printf("%d. %s - %s - %s -  %d - %d - %s", (i+1),idList.get(i), nameList.get(i), typeList.get(i), healthList.get(i), attackList.get(i),abilityList.get(i));
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
