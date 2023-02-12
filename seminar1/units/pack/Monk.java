package pack;

public class Monk extends Unit {
    protected int spirit = 50;

    public Monk(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    /**
     * @param person target for healing
     */
    public void Healing(Unit person) {
        person.hp = person.hp + this.spirit;
    }

}
