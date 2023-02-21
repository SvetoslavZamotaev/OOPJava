package pack;

import java.util.Random;

public class Sharpshooter extends Unit {
    protected Random rand = new Random(); // var for modificate crit 2x 50% chance
    protected int shots;

    public Sharpshooter(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Sharpshooter(String name) {
        super();
        super.name = name;
        super.hp = 15;
        super.def = 10;
        super.max_damage = 10;
        super.min_damage = 8;
        super.speed = 9;
        super.attack = 12;
        this.shots = 32;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pack.Unit#Attack(pack.Unit, pack.Unit)
     * chance to hit extra 2x damage
     */
    @Override
    public void Attack(Unit attacker, Unit defender) {
        attacker.max_damage = attacker.max_damage + attacker.max_damage * rand.nextInt(2);
        super.Attack(attacker, defender);
    }

    @Override
    public String GetInfo() {
        return "i'm a Sharpshooter : " + name;
    }

    @Override
    public void Step() {

    }

}
