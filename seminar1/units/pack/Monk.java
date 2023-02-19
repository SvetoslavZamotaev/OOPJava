package pack;

public class Monk extends Unit {
    protected int spirit = 50;

    public Monk(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Monk(String name) {
        super();
        super.name = name;
        super.hp = 100;
        super.def = 15;
        super.damage = 50;
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
