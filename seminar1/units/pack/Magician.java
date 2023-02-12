package pack;

public class Magician extends Unit {
    protected int spellattack = 70; // additional spell damage

    public Magician(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    /**
     * @param target //target for additional magic attack
     */
    public void MagicAttack(Unit target) {
        target.hp = target.hp - this.spellattack;
    }
}
