
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		
		String[] type = new String[1005];
		String[] plate = new String[1005];
		int[] number = new int[1005];
		String[] back= new String[1005];
		int[] min = new int[1005];
		int[] hin = new int[1005];
		int[] mout = new int[1005];
		int[] hout = new int[1005];
		
		do {
			System.out.println("		Binus safepArkIng\n");
			System.out.println("1. Login\n2. Exit");
			try {
				System.out.print(">> ");
				menu = scan.nextInt();
			}
			catch(Exception e) {
				System.out.println("Wrong data type!");
			}
			scan.nextLine();
			if(menu==1) {
				int tr=0;
				do {
					System.out.print("Username: ");
					String user = scan.nextLine();
					System.out.print("Password: ");
					String pw = scan.nextLine();
					if((!user.equalsIgnoreCase("admin")) || pw.compareTo("binusSafeParking") != 0){
						tr = 1;
						System.out.println("Wrong Username or Password!");
					}else {
						tr = 0;
					}
				}while(tr == 1);
					
					int opt = 0;
					
					do {
						System.out.println("Menu");
						System.out.println("1. View Parked Vehicle");
						System.out.println("2. Vehicle In");
						System.out.println("3. Vehicle Out");
						System.out.println("4. Back to Login Page");
						System.out.println("5. Exit");
						try {
							System.out.print(">> ");
							opt = scan.nextInt();
						}
						catch(Exception e) {
							System.out.println("Wrong data type!");
						}
						scan.nextLine();
						
						switch(opt) {
							case 1:
								System.out.println("Parked Vehicle List");
								System.out.println("===========================");
								if(total == 0) {
									System.out.println("\nThere is no Parked Vehicle!!!");
								}else {
									for(int i=0;i<total;i++) {
										System.out.println((1+total) + ". " + type[i] + ", " + plate[i].toUpperCase() + " " + number[i] + " " + back[i].toUpperCase() + ", ");
										System.out.print(" @ Time In : " + hin[i] + "." + min[i] + " | Time Out : ");
										if(hout[i] == 0 && mout[i] == 0) {
											System.out.println("-");
										}else {
											System.out.println(hout[i] + "." + mout[i]);
										}
									}
								}
								System.out.println("\n\nPress enter to continue!!");
								scan.nextLine();
								break;
							case 2:
								do {
									System.out.print("Input hour : ");
									hin[total] = scan.nextInt();
									scan.nextLine();
								}while(hin[total]>23 || hin[total]<0);
								do {
									System.out.print("Input minute : ");
									min[total] = scan.nextInt();
									scan.nextLine();
								}while(min[total]>59 || min[total]<0);
								do {
									System.out.print("Input the Vehicle Type [Motor | Mobil] : ");
									type[total] = scan.nextLine();
								}while(!type[total].equalsIgnoreCase("Motor") && !type[total].equalsIgnoreCase("Mobil"));
								do {
									System.out.print("Input the plate Number ex. [B 1234 BIN] : ");
									plate[total] = scan.next();
									number[total] = scan.nextInt();
									back[total] = scan.next();
									scan.nextLine();
								}while(plate[total] == null || number[total] == 0 || back[total] == null);
								hout[total] = 0;
								mout[total] = 0;
								total++;
								break;
							case 3:
								System.out.println("Parked Vehicle List");
								System.out.println("===========================");
								if(total == 0) {
									System.out.println("\nThere is no Parked Vehicle!!!");
								}else {
									for(int i=0;i<total;i++) {
										System.out.println((1+total) + ". " + type[i] + ", " + plate[i].toUpperCase() + " " + number[i] + " " + back[i].toUpperCase() + ", ");
										System.out.print(" @ Time In : " + hin[i] + "." + min[i] + " | Time Out : ");
										if(hout[i] == 0 && mout[i] == 0) {
											System.out.println("-");
										}else {
											System.out.println(hout[i] + "." + mout[i]);
										}
									}
								}
								System.out.println("\n\nPress enter to continue!!\n");
								scan.nextLine();
								
								System.out.println("Vehicle Out");
								int keluar=0;
								do{
									System.out.print("Choose vehicle : ");
									keluar = scan.nextInt();
									scan.nextLine();
								}while(keluar>total);
								keluar--;
								do {
									System.out.print("Input hour : ");
									hout[keluar] = scan.nextInt();
									scan.nextLine();
								}while(hout[keluar]>23 || hout[keluar]<0);
								do {
									System.out.print("Input minute : ");
									mout[keluar] = scan.nextInt();
									scan.nextLine();
								}while(mout[keluar]>59 || mout[keluar]<0);
								
								break;
							case 4:
								break;
							case 5:
								System.out.println("Thank you for using the program, have a great day :D");
								menu =2;
								break;
						}
					}while(opt != 4 && opt != 5);
			}
		} while(menu!=2);
	}

}
