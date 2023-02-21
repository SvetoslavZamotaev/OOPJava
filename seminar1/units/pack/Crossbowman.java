package pack;

public class Crossbowman extends Unit {
    protected int shots;
    protected int crush = 60;

    public Crossbowman(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Crossbowman(String name) {
        super();
        super.name = name;
        super.hp = 10;
        super.def = 3;
        super.max_damage = 3;
        this.shots = 16;
        super.attack = 6;
        super.min_damage = 2;
        super.speed = 4;
    }

    /**
     * @param target // target for destroing armor of enemy
     */
    public void BrokeTheArmor(Unit target) {
        target.def = target.def - this.crush;
    }

    @Override
    public String GetInfo() {
        return "I'm a Crossbowman : " + name;
    }

    @Override
    public void Step() {

    }

}
