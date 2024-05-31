package Session36_LatihanInterface_Hero;

public class AttackRange implements I_AttackSkill{
	private double power;
	private double range;
	
	public AttackRange(double power, double range) {
		this.power = power;
		this.range = range;
	}
	
	public void attack(Hero enemy) {
		System.out.println("Attack " + enemy.getName() + " With Power " + this.power + " at Range " + this.range);
	}
	
}
