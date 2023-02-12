package pack;

public class Crossbowman extends Unit {

    protected int crush = 60;

    public Crossbowman(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    /**
     * @param target // target for destroing armor of enemy
     */
    public void BrokeTheArmor(Unit target) {
        target.def = target.def - this.crush;
    }

}
