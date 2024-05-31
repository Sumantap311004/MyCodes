package Package_3;

class Daging
{
	int berat;
	void setBerat(int b)
	{
		berat = b;
	}
	
	int getBerat()
	{
		return berat;
	}
}

interface Harga
{
	public static final int hargaPerKg = 10000;
	public abstract double getTotalHarga();
}

class DagingSapi extends Daging implements Harga
{
	public double getTotalHarga()
	{
		return hargaPerKg*getBerat()*1.5;
	}
}

class DagingAyam extends Daging implements Harga
{
	public double getTotalHarga()
	{
		return hargaPerKg*getBerat()*1.2;
	}
}

public class BelanjaDaging
{
	public static void main(String[]args) 
	{
		DagingSapi ds = new DagingSapi();
		DagingAyam da = new DagingAyam();
		
		ds.setBerat(10);
		da.setBerat(10);
		System.out.println("Harga daging sapi dengan berat = "+ds.getBerat()+" adalah Rp. "+ds.getTotalHarga());
		System.out.println("Harga daging ayam dengan berat = "+da.getBerat()+" adalah Rp. "+da.getTotalHarga());
		System.out.println("Do = "+ds.toString());
	}
}