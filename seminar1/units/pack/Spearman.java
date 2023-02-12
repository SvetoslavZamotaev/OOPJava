package pack;

public class Spearman extends Unit {
    protected int ignoringDef = 20;

    public Spearman(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    @Override
    public void Attack(Unit attacker, Unit defender) {
        defender.def = defender.def - this.ignoringDef;
        super.Attack(attacker, defender);
    }

}
