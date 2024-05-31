package SunibFestival;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	// Scanner General
	Scanner sc = new Scanner(System.in);
	//Random Grobal
	Random rand = new Random();
	//Array List
	ArrayList<String> groupNameList = new ArrayList<String>();
	ArrayList<String> ideaList = new ArrayList<String>();
	ArrayList<String> locationList = new ArrayList<String>();
	ArrayList<String> feedbackList = new ArrayList<String>();
	ArrayList<String> tableIDList = new ArrayList<String>();
	
	public Main() {
		// TODO Auto-generated constructor stub
		int input= 0;
		//Menu
		do {
			System.out.println("Sunib Festival");
			System.out.println("==============");
			System.out.println("1. Register Binus Festival");
			System.out.println("2. View All Exhibits");
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
	
	
	
	public void menu1() {
		//Input Group Name
		String groupName = null;
		do {
			System.out.print("Input yout Group Name: ");
			groupName = sc.nextLine();
		} while (!(isAlpha(groupName) && unique(groupName)));
		
		//Input Idea
		String idea = null;
		do {
			System.out.print("Input your Idea: ");
			idea = sc.nextLine();
			checkSpace(idea);
		} while (!(count >= 2));

		//Input Location
		String location = null;
		do {
			System.out.print("Input your Location: ");
			location = sc.nextLine();
		} while (!(location.endsWith("lt.1") || location.endsWith("lt.2") || location.endsWith("lt.3")));
		
		//Input Feedback
		String feedback = null;
		do {
			System.out.print("Input your Feedback: ");
			feedback  = sc.nextLine();
		} while (!(feedback.startsWith("forms.com/")));
		
		//Generate random number
		String generateID = null;
		String id1 = "TB";
		int  n1 = rand.nextInt(1000);
			//Formating
		generateID = String.format("%s%03d", id1, n1);
		
		//Making Array List
		groupNameList.add(groupName);
		ideaList.add(idea);
		locationList.add(location);
		feedbackList.add(feedback);
		tableIDList.add(generateID);
		
		//Output Screen
		System.out.println("");
		System.out.println("==========================");
		System.out.println("Input Information");
		System.out.println("==========================");
		System.out.println("Group name \t: " + groupName);
		System.out.println("Idea \t\t: " + idea);
		System.out.println("Location \t: " + location);
		System.out.println("Feedback \t: "+ feedback);
		System.out.println("Your ID \t: " + generateID);
		System.out.println("==========================");
		System.out.println("");
		
		System.out.println("Input Success");
		System.out.print("Press Enter to Countinue...");
		sc.nextLine();		
	}
	
	
	public void menu2() {
		if (groupNameList.isEmpty()) {
			System.out.println("There is no History for Exhibits!!!");
			System.out.println("Press Enter to Continue....");
			sc.nextLine();
		}
		else {
			System.out.println("No. Table ID - Group Name - Idea - Location - Feedback Link ");
			for (int i = 0; i < groupNameList.size(); i++) {
				System.out.printf("%d. %s - %s - %s - %s - %s ", (i+1),tableIDList.get(i), groupNameList.get(i), ideaList.get(i), locationList.get(i), feedbackList.get(i));
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
