
public class Class_Diagram {
	
	class Mamalia {
	    private String nama;
	    private String jenisKelamin;
	    private int usia;

	    public Mamalia(String nama, String jenisKelamin, int usia) {
	        this.nama = nama;
	        this.jenisKelamin = jenisKelamin;
	        this.usia = usia;
	    }

	    public void makan() {
	        System.out.println("Mamalia sedang makan.");
	    }

	    public void tidur() {
	        System.out.println("Mamalia sedang tidur.");
	    }

	    public void bernafas() {
	        System.out.println("Mamalia sedang bernafas.");
	    }

	    public void bergerak() {
	        System.out.println("Mamalia sedang bergerak.");
	    }

	    public String getNama() {
	        return nama;
	    }

	    public void setNama(String nama) {
	        this.nama = nama;
	    }

	    public int getUsia() {
	        return usia;
	    }

	    public void setUsia(int usia) {
	        this.usia = usia;
	    }
	}

	class Kerbau extends Mamalia {
	    private double berat;
	    private int jumlahTanduk;
	    private String warnaBulu;
	    private int umur;
	    private double panjangEkor;
	    private String jenisKerbau;

	    public Kerbau(String nama, String jenisKelamin, int usia) {
	        super(nama, jenisKelamin, usia);
	    }

	    public void suara() {
	        System.out.println("Kerbau mengeluarkan suara.");
	    }

	    public double getBerat() {
	        return berat;
	    }

	    public void setBerat(double berat) {
	        this.berat = berat;
	    }

	    public int getJumlahTanduk() {
	        return jumlahTanduk;
	    }

	    public void setJumlahTanduk(int jumlahTanduk) {
	        this.jumlahTanduk = jumlahTanduk;
	    }

	    public double getPanjangEkor() {
	        return panjangEkor;
	    }

	    public void setPanjangEkor(double panjangEkor) {
	        this.panjangEkor = panjangEkor;
	    }

	    public String getJenisKerbau() {
	        return jenisKerbau;
	    }

	    public String getWarnaBulu() {
	        return warnaBulu;
	    }
	}

	class Gajah extends Mamalia {
	    private double berat;
	    private int jumlahGading;
	    private String warnaBulu;
	    private int umur;
	    private double panjangEkor;
	    private double panjangBelalai;
	    private String jenisGajah;

	    public Gajah(String nama, String jenisKelamin, int usia) {
	        super(nama, jenisKelamin, usia);
	    }

	    public void suara() {
	        System.out.println("Gajah mengeluarkan suara.");
	    }

	    public double getBerat() {
	        return berat;
	    }

	    public void setBerat(double berat) {
	        this.berat = berat;
	    }

	    public int getJumlahGading() {
	        return jumlahGading;
	    }

	    public void setJumlahGading(int jumlahGading) {
	        this.jumlahGading = jumlahGading;
	    }

	    public double getPanjangEkor() {
	        return panjangEkor;
	    }

	    public void setPanjangEkor(double panjangEkor) {
	        this.panjangEkor = panjangEkor;
	    }

	    public double getPanjangBelalai() {
	        return panjangBelalai;
	    }

	    public void setPanjangBelalai(double panjangBelalai) {
	        this.panjangBelalai = panjangBelalai;
	    }

	    public String getJenisGajah() {
	        return jenisGajah;
	    }

	    public String getWarnaBulu() {
	        return warnaBulu;
	    }
	}

	class Harimau extends Mamalia {
	    private double berat;
	    private int jumlahTaring;
	    private String warnaBulu;
	    private int umur;
	    private double panjangEkor;
	    private int jumlahStrip;
	    private String jenisHarimau;

	    private Kerbau mangsaKerbau;
	    private Gajah mangsaGajah;

	    public Harimau(String nama, String jenisKelamin, int usia) {
	        super(nama, jenisKelamin, usia);
	    }

	    public void suara() {
	        System.out.println("Harimau mengeluarkan suara.");
	    }

	    public double getBerat() {
	        return berat;
	    }

	    public void setBerat(double berat) {
	        this.berat = berat;
	    }

	    public int getJumlahTaring() {
	        return jumlahTaring;
	    }

	    public void setJumlahTaring(int jumlahTaring) {
	        this.jumlahTaring = jumlahTaring;
	    }

	    public int getJumlahStrip() {
	        return jumlahStrip;
	    }

	    public void setJumlahStrip(int jumlahStrip) {
	        this.jumlahStrip = jumlahStrip;
	    }

	    public double getPanjangEkor() {
	        return panjangEkor;
	    }

	    public void setPanjangEkor(double panjangEkor) {
	        this.panjangEkor = panjangEkor;
	    }

	    public String getJenisHarimau() {
	        return jenisHarimau;
	    }

	    public String getWarnaBulu() {
	        return warnaBulu;
	    }

	    public void berburu() {
	        System.out.println("Harimau sedang berburu.");
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Compile Sukses");
	}
	
}
