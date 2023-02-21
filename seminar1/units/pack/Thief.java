package pack;

import java.util.Random;

public class Thief extends Unit {
    Random r = new Random();

    public Thief(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Thief(String name) {
        super();
        super.name = name;
        super.hp = 10;
        super.def = 3;
        super.max_damage = 4;
        super.min_damage = 2;
        super.speed = 6;
        super.attack = 8;
    }

    /**
     * @param person // ability with added def for Thief person
     */
    public void Dexterity(Thief person) {
        person.def = person.def + r.nextInt(60);
    }

    @Override
    public String GetInfo() {
        return "I'm a Thief : " + name;
    }

    @Override
    public void Step() {

    }

}
