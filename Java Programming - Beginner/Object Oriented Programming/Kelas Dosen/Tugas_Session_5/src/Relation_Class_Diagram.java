
public class Relation_Class_Diagram {
	
	class Spion {
		private String warnaSpion;
		private int ukuran;
		
		public Spion(String warnaSpion, int ukuran) {
			this.warnaSpion = warnaSpion;
			this.ukuran = ukuran;
		}
		
		public String getWarnaSpion() {
	        return warnaSpion;
	    }
		
		public int getUkuran() {
			return ukuran;
		}
	}
	
	class Mesin {
		private String noMesin;
		private int cc;
		
		public Mesin(String noMesin, int cc) {
			this.noMesin = noMesin;
			this.cc = cc;
		}
		
		public String getNoMesin() {
	        return noMesin;
	    }
		
		public int getCC() {
	        return cc;
	    }
		
		public void off() {
			 System.out.println("Mesin sedang dalam kondisi Off");
		}
		
		public void on() {
			 System.out.println("Mesin sedang dalam kondisi On");
		}
	}
	
	class Bensin {
		private int oktan;
		
		public Bensin (int oktan) {
			this.oktan = oktan;
		}
		
		public int getOktan() {
			return oktan;
		}
		
		public void fill() {
			System.out.println("Bensin sedang dalam Proses Pengisian");
		}
	}
	
	class BPKB {
		private Mobil mobil;
		private int noBPKB;
		
		public BPKB (int noBPKB) {
			this.noBPKB = noBPKB;
		}
		
		public int getNoBPKB(){
			return noBPKB;
		}
		
		public void show() {
			System.out.println("Sedang Memperlihatkan No BPKB");
		}
	}
	
	// Induk Class
	class Mobil {
		
		//Aggrgation
		private Spion spion;
		//Composition
		private Mesin mesin;
		
		//Depedency
		private Bensin bensin;
		public void MobilBensin(){
			this.bensin = new Bensin(0); //Dependecy
		}
		public void useBensin() {
	        bensin.fill();
	    }
		
		//Association
		private BPKB bpkb;
		
		private String noPlat;
		private String warna;
		public Mobil (String noPlat, String warna){
			this.noPlat = noPlat;
			this.warna = warna;
		}
		
		public void drive() {
	        System.out.println("Mobil sedang dalam kondisi Drive");
	    }

	    public void stop() {
	        System.out.println("Mobil sedang dalam kondisi Stop");
	    }
	}
	
	//Is A (In Heritence)
	class truk extends Mobil {
		private String jenisTruk;
		
		 public truk(String noPlat, String warna) {
		        super(noPlat, warna);
		    }
		 
		 public String getJenisTruk() {
		        return jenisTruk;
		    }
		 
		 public void park() {
			 System.out.println("Truk sedang dalam kondisi Park");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Compile Sukses");
	}

}
