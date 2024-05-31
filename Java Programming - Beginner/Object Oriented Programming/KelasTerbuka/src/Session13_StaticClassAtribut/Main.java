package Session13_StaticClassAtribut;


class Display{
	static String type = "Display";
	private String name;
	
	Display(String name){
		this.name = name;
	}
	
	void setType(String typeInput) {
		// type = typeInput; //Alternative 1
		// this.type = typeInput; //Alternative 2
		Display.type = typeInput; //Alternative 3
	}
	
	void show() {
		System.out.println("Display name = " + this.name);
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display1 = new Display("Monitor");
		display1.show();
		Display display2 = new Display("Smartphone");
		display2.show();
		
		System.out.println("");
		
		//Tampilkan Static Variable atau Class Variable
		System.out.println("Menampilkan Static atau Class Variable");
		System.out.println(display1.type);
		System.out.println(display2.type);
		System.out.println(Display.type);
		
		System.out.println("");
		
		//Kita coba mengganti Variable Staticnya
//		Display.type = "Spanduk";
		display1.setType("Tampilan");
		System.out.println("Menampilkan Static atau Class Variable");
		System.out.println(display1.type);
		System.out.println(display2.type);
		System.out.println(Display.type);
	}
}
