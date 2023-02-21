package pack;

public class Spearman extends Unit {
    protected int ignoringDef = 20;

    public Spearman(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Spearman(String name) {
        super();
        super.name = name;
        super.hp = 10;
        super.def = 5;
        super.max_damage = 3;
        super.min_damage = 1;
        super.speed = 4;
        super.attack = 4;
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
