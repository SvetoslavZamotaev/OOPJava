package pack;

public class Peasant extends Unit {
    protected int bottleOfAnger = 20; // + damage from bottle of fire water

    public Peasant(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public void Bottle() {
        super.damage = super.damage + this.bottleOfAnger;
    }

}
