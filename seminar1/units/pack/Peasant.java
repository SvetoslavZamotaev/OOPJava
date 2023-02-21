package pack;

public class Peasant extends Unit {
    protected int bottleOfAnger = 20; // + damage from bottle of fire water

    public Peasant(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Peasant(String name) {
        super();
        super.name = name;
        super.hp = 1;
        super.def = 1;
        super.max_damage = 1;
        super.min_damage = 1;
        super.speed = 3;
        super.attack = 1;
    }

    public void Bottle() {
        super.max_damage = super.max_damage + this.bottleOfAnger;
    }

    @Override
    public String GetInfo() {
        return "I'm a Peasant : " + name;
    }

    @Override
    public void Step() {

    }

}
