package Session21_SubclassConstructor;

public class Hero {
	//Atrribute
	String name;
	double defencePower;
	
	//Consructor
	Hero(String name, double defencePower){
		this.name = name;
		this.defencePower = defencePower;
	}
	
	Hero(String name){
		this.name = name;
	}
	
	//Method
	void display() {
		System.out.println("Name = " + this.name);
	}
}
