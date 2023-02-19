package pack;

import java.util.Random;

public class Sharpshooter extends Unit {
    protected Random rand = new Random(); // var for modificate crit 2x 50% chance

    public Sharpshooter(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Sharpshooter(String name) {
        super();
        super.name = name;
        super.hp = 110;
        super.def = 20;
        super.damage = 90;
    }

    /*
     * (non-Javadoc)
     * 
     * @see pack.Unit#Attack(pack.Unit, pack.Unit)
     * chance to hit extra 2x damage
     */
    @Override
    public void Attack(Unit attacker, Unit defender) {
        attacker.damage = attacker.damage + attacker.damage * rand.nextInt(2);
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
