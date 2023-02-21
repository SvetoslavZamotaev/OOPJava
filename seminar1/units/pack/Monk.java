package pack;

public class Monk extends Unit {
    protected int spirit = 50;

    public Monk(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Monk(String name) {
        super();
        super.name = name;
        super.hp = 30;
        super.def = 7;
        super.max_damage = -4;
        super.min_damage = -4;
        super.speed = 5;
        super.attack = 12;
    }

    /**
     * @param person target for healing
     */
    public void Healing(Unit person) {
        person.hp = person.hp + this.spirit;
    }

    @Override
    public String GetInfo() {
        return "I'm a Monk : " + name;
    }

    @Override
    public void Step() {

    }

}
