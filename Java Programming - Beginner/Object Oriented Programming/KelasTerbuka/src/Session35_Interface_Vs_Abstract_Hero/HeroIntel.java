package Session35_Interface_Vs_Abstract_Hero;

public class HeroIntel extends Hero implements I_AttackSkill, I_SpellSkill{
	public HeroIntel (String name, double health) {
		super(name, health);
	}
	
	public void attack(Hero enemy) {
		System.out.println(this.getName() + " Menyerang " + enemy.getName());
	}
	
	public void spell(Hero enemy) {
		System.out.println(this.getName() + " Memagic " + enemy.getName());
	}
	
}
