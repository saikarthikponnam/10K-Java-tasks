package com.abstraction;

abstract class GameCharacter{
	String name;
	int level;
	int healthPoints;
	
	public GameCharacter(String name, int level, int healthPoints) {
		super();
		this.name = name;
		this.level = level;
		this.healthPoints = healthPoints;
	}
	public abstract void attack();
	public void chooseTarget() {
		System.out.println("Target selected.");
	}
	public void animateAttack() {
		System.out.println("Attack animation played.");
	}
}
class Warrior extends GameCharacter{
	String weaponType;

	public Warrior(String name, int level, int healthPoints, String weaponType) {
		super(name, level, healthPoints);
		this.weaponType = weaponType;
	}

	@Override
	public void attack() {
		System.out.println("Performing melee attack with Sword.");
	}
}
class Mage extends GameCharacter{
	String spellType;

	public Mage(String name, int level, int healthPoints, String spellType) {
		super(name, level, healthPoints);
		this.spellType = spellType;
	}

	@Override
	public void attack() {
		System.out.println("Casting spell: " + spellType);
	}
}
class Archer extends GameCharacter{
	String arrowType;

	public Archer(String name, int level, int healthPoints, String arrowType) {
		super(name, level, healthPoints);
		this.arrowType = arrowType;
	}

	@Override
	public void attack() {
		System.out.println("Shooting arrow: Elven Arrow.");
	}
}
public class Example6 {

	public static void main(String[] args) {
		GameCharacter obj1 = new Warrior("Conan", 5, 100, "Sword");
		obj1.attack();
		obj1.animateAttack();
		obj1.chooseTarget();
		System.out.println();
		
		GameCharacter obj2 = new Mage("Gandalf", 7, 120, "Fireball");
		obj2.attack();
		obj2.animateAttack();
		obj2.chooseTarget();
		System.out.println();	
		
		GameCharacter obj3 = new Archer("Legolas", 8, 110, "Elven Arrow");
		obj3.attack();
		obj3.animateAttack();
		obj3.chooseTarget();
		System.out.println();	
	}
}
