package pack;

public class Peasant extends Unit {
    protected int bottleOfAnger = 20; // + damage from bottle of fire water

    public Peasant(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Peasant(String name) {
        super();
        super.name = name;
        super.hp = 100;
        super.def = 15;
        super.damage = 35;
    }

    public void Bottle() {
        super.damage = super.damage + this.bottleOfAnger;
    }

    @Override
    public String GetInfo() {
        return "I'm a Peasant : " + name;
    }

    @Override
    public void Step() {

    }

}
