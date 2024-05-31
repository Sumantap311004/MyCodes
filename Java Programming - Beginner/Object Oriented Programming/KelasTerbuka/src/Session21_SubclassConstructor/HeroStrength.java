package Session21_SubclassConstructor;

//Subclas
class HeroStrength extends Hero {

	//Constructor
	HeroStrength(String name, double defencePower){
		super(name, defencePower);
	}
	
	HeroStrength (String name){
		super(name);
	}
}
