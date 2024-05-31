package Session35_Interface_Vs_Abstract_Hero;

public class HeroAgility extends Hero implements I_AttackSkill{
	
	public HeroAgility(String name, double health) {
		super(name, health);
	}
	
	public void attack(Hero enemy) {
		System.out.println(this.getName() + " Menyerang " + enemy.getName());
	}
	
}
