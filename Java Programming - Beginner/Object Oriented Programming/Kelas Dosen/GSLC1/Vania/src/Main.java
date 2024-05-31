
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int ans = 0;
		
		String[] name = new String[1005];
		String[] type = new String[1005];
		int[] price = new int[1005];
		int[] quantity = new int[1005];
		int total = 0;
		
		
		do {
			System.out.println("+=============================+");
			System.out.println("|             MENU            |");
			System.out.println("+=============================+");
			System.out.println("| 1. Insert Product           |");
			System.out.println("| 2. Buy Product              |");
			System.out.println("| 3. Exit                     |");
			System.out.println("+=============================+");
			
			System.out.print(">> ");
			ans = input.nextInt();
			input.nextLine();
			
			if (ans == 1) {
				int anss = 0;
				
				do {
					System.out.print("Input product name [ 6 - 20 characters ] : ");
					name[total] = input.nextLine(); 
					
					int a = name[total].length();
					
					if(a >= 6 && a <= 20) {
						anss = 1;
					}else {
						anss = 0;
					}
					
					
				} while (anss == 0);
				
				anss = 0;
				
				do {
					System.out.print("Input product type [ Currency | Item | Account ] : ");
					type[total] = input.nextLine();
					
					String currency = "Currency";
					String item = "Item";
					String account = "Account";
				
					Boolean cektype = type[total].compareTo(currency) == 0; 
					Boolean cektype2 = type[total].compareTo(item) == 0; 
					Boolean cektype3 = type[total].compareTo(account) == 0; 
					
					if(cektype) {
						anss = 1;
					}else if(cektype2){
						anss = 2;
					}else if(cektype3) {
						anss = 3;
					}else {
						anss = 0;
					}
				} while (anss == 0);
				
				anss = 0;
				
				do {
					System.out.print("Input product price [ 10000 - 1000000 ] : ");
					price[total] = input.nextInt();
					input.nextLine();
					
					if(price[total] >= 10000 && price[total] <= 1000000) {
						anss = 1;
					}else {
						anss = 0;
					}
				} while (anss == 0);
				
				anss = 0;
				
				do {
					System.out.print("Input product quantity [ 1 - 50 ] : ");
					quantity[total] = input.nextInt();
					input.nextLine();
					
					if(quantity[total] >= 1 && quantity[total] <= 50) {
						anss = 1;
					}else {
						anss = 0;
					}
				} while (anss == 0);
				
				total++;
				
				System.out.println("Product added !! Press enter to continue..");
				System.out.println();
			}else if(ans == 2) {
				if(total == 0) {
					System.out.println("There's no product..");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("Press enter to continue..");
					System.out.println();
				}else {
					String buyy = new String();
					int[] subtotal = new int[1005];
					
					System.out.println("+====+======================+===========+==========+=============+");
					System.out.println("| NO | Name                 | Price     | Quantity | Sub Total   |");
					System.out.println("+====+======================+===========+==========+=============+");
					
					for(int i=0; i < total; i++) {						
						subtotal[i] = price[i] * quantity[i];
						System.out.printf("| %-2d | %-20s | %-9d | %-8d | %-11d |\n", (i+1), name[i], price[i], quantity[i], subtotal[i]);
//						System.out.println("| " + (i+1) + " | " + name[i] + " | " + price[i] + " | " + quantity[i] + " | " +(price[i]*quantity[i]+" |"));
					}
					
					System.out.println("+====+======================+===========+==========+=============+");
					
					System.out.printf("Buy All ? [ Y / N ] : ");
					buyy = input.nextLine();
					
					String yes = "Y";
					String no = "N";
					
					Boolean cekbuy = buyy.compareTo(yes) == 0;
					Boolean cekbuy2 = buyy.compareTo(no) == 0;
					
					if(cekbuy) {
						int totallg = 0;
						double diskon = 0;
						double tax = 0;
						double grandtotal;
						
						for(int i=0; i<total; i++) {
							totallg += subtotal[i];
						}
						
						diskon = totallg * 0.1;
						tax = totallg * 0.05;
						grandtotal = totallg-diskon+tax;
						
						System.out.println("+================================+");
						System.out.println("|            Receipt             |");
						System.out.println("+================================+");
						System.out.printf("| Total            : %-11d |\n", totallg );
						System.out.printf("| Discount [ 10%% ] : %-11.0f |\n", diskon);
						System.out.printf("| Tax [ 5%% ]       : %-11.0f |\n", tax);
						System.out.printf("| Grand Total      : %-11.0f |\n", grandtotal);
						System.out.println("+================================+");
						System.out.println("| Thank You for purchasing !!    |");
						System.out.println("+================================+");
						System.out.println("press enter to continue..");
						System.out.println();
						
						total = 0;
					}else if (cekbuy2){
						continue;
					}else {
						System.out.println("Please answer by typing Y / N");
					}
					
					System.out.println();
				}
			}
			
		} while (ans != 3);
	
	}

}
