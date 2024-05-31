package Session36_LatihanInterface_Hero;


public class AttackMelee implements I_AttackSkill {
	
	private double power;
	
	public AttackMelee(double power) {
		this.power = power;
	}
	
	public void attack(Hero enemy) {
		System.out.println("Attack "+ enemy.getName() + " With Meele " + this.power);
	}
	
}
