import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static class Car {
        public String name;
        public int capacity;
        public int speed;

        public Car() {
            capacity = 0;
            speed = 0;
        }

        public Car(int startCap, int startSpeed) {
            capacity = startCap;
            speed = startSpeed;
        }

        public String getName() {
            return name;
        }
    }

    static class Jeep extends Car {
        public Jeep(String name) {
            super(30, 120);  // Use super to call the Car constructor
            this.name = name;
        }
    }

    static class Sedan extends Car {
        public Sedan(String name) {
            super(10, 120);  // Use super to call the Car constructor
            this.name = name;
        }
    }

    static class SUV extends Car {
        public SUV(String name) {
            super(15, 100);  // Use super to call the Car constructor
            this.name = name;
        }
    }

    static ArrayList<Jeep> JeepList = new ArrayList<Jeep>();
    static ArrayList<SUV> SUVList = new ArrayList<SUV>();
    static ArrayList<Sedan> SedanList = new ArrayList<Sedan>();

    public static void main(String[] args) {
        System.out.println("Showroom");
        System.out.println("=========");

        Scanner scan = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please choose an option");
            System.out.println("1. Buy");
            System.out.println("2. Show");
            System.out.println("3. Exit");
            System.out.print("Input: ");

            input = scan.nextInt();

            if (input == 1) {
                buy();
            } else if (input == 2) {
                show();
            } else if (input == 3) {
                exit();
                System.out.println("See You Later!!!");
            } else {
                System.out.println("Wrong Input Number!!!");
            }

        } while (input != 3);
    }

    public static void buy() {
        Scanner scan = new Scanner(System.in);
        Scanner scanCarName = new Scanner(System.in);
        int option;

        do {
            System.out.println("Please choose an option");
            System.out.println("1. Jeep");
            System.out.println("2. SUV");
            System.out.println("3. Sedan");
            System.out.print("Input: ");

            option = scan.nextInt();

            switch (option) {
                case 1: {
                    System.out.print("Car's name: ");
                    String name = scanCarName.nextLine();
                    Jeep newJeep = new Jeep(name);
                    JeepList.add(newJeep);
                    break;
                }
                case 2: {
                    System.out.print("Car's name: ");
                    String name = scanCarName.nextLine();
                    SUV newSUV = new SUV(name);
                    SUVList.add(newSUV);
                    break;
                }
                case 3: {
                    System.out.print("Car's name: ");
                    String name = scanCarName.nextLine();
                    Sedan newSedan = new Sedan(name);
                    SedanList.add(newSedan);
                    break;
                }
                default: {
                    System.out.println("Incorrect Input");
                    break;
                }
            }

        } while (option > 3 || option < 1);
    }

    public static void show() {
        System.out.println("List Car");
        System.out.println("========");
        System.out.println("Jeep");
        System.out.println("========");
        for (Jeep temp : JeepList) {
            System.out.println(temp.getName());
        }
        System.out.println("");
        System.out.println("");

        System.out.println("========");
        System.out.println("SUV");
        System.out.println("========");
        for (SUV temp : SUVList) {
            System.out.println(temp.getName());
        }
        System.out.println("");
        System.out.println("");

        System.out.println("========");
        System.out.println("Sedan");
        System.out.println("========");
        for (Sedan temp : SedanList) {
            System.out.println(temp.getName());
        }
        System.out.println("");
        System.out.println("");
    }

    public static void exit() {
        System.out.println("Thank you for using this program!");
    }
}
