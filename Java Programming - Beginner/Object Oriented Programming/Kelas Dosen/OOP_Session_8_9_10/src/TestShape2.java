import java.util.Scanner;

class Shape
{
	public double luas()
	{
		return 0;
	}
	
	public double keliling () 
	{
		return 0;
	}
}

class Circle extends Shape 
{
	public double luas() // Overriding Method
	{
		return 3.14*10*10;
	}
	
	public double luas (double r) //Overloading Method
	{
		return 3.14*r*r;
	}
}

class Rectangle extends Shape
{
	public double luas() 
	{
		return 10*10;
	}
	
	public double luas(double p, double l)
	{
		return p*l;
	}
}

class Triangle extends Shape
{
	public double luas()
	{
		return 0.5*10*10;
	}
	
	public double luas (double a, double t)
	{
		return 0.5*a*t;
	}
}

public class TestShape2 {
	public static void main(String[] args) {
		// Trivial Polymorphysm (Method Overloading)
		/*
		Triangle t = new Triangle();
		System.out.println("Luas  = "+t.luas());
		System.out.println("Luas  = "+t.luas(10,20));
		*/
		
		// Pure Polymorphysm  (Method Overriding)
		Shape s = null; // new Shape();
		int pilih;
		// pilih = 3; // Ganti menjadi inputan Scanner
		System.out.print("Pilih Angkamu: ");
		Scanner scanner = new Scanner(System.in);
		pilih = scanner.nextInt();
		
		
		if (pilih == 1)
		{
			s = new Circle ();
			System.out.println("Luas Lingkaran: ");
		}
		else 
		if (pilih == 2) 
		{
			s = new Rectangle();
			System.out.println("Luas Segiempat: ");
		}
		else
		if (pilih == 3)
		{
			s = new Triangle();
			System.out.println("Luas Segitiga: ");
		}
		
		System.out.println(s.luas());
		// s.luas();
	}

}
