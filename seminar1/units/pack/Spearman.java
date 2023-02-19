package pack;

public class Spearman extends Unit {
    protected int ignoringDef = 20;

    public Spearman(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Spearman(String name) {
        super();
        super.name = name;
        super.hp = 120;
        super.def = 25;
        super.damage = 55;
    }

    @Override
    public void Attack(Unit attacker, Unit defender) {
        defender.def = defender.def - this.ignoringDef;
        super.Attack(attacker, defender);
    }

    @Override
    public String GetInfo() {
        return "i'm a Spearman : " + name;
    }

    @Override
    public void Step() {

    }

}
