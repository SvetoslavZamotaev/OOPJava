package pack;

public class Magician extends Unit {
    protected int spellattack = 70; // additional spell damage

    public Magician(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Magician(String name) {
        super();
        super.name = name;
        super.hp = 80;
        super.def = 10;
        super.damage = 30;
    }

    @Override
    public String GetInfo() {
        return "i'm a Magician : " + name;
    }

    @Override
    public void Step() {

    }

    /**
     * @param target //target for additional magic attack
     */
    public void MagicAttack(Unit target) {
        target.hp = target.hp - this.spellattack;
    }
}
