package pack;

public abstract class Unit implements IngameInterface {
    protected String name;
    protected int hp;
    protected int def;
    protected int damage;
    protected boolean isAlive = true;

    public Unit(String name, int hp, int def, int damage) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.damage = damage;
    }

    public Unit() {

    }

    /**
     * Getting info about stats of character.
     */
    public void getInfo() {
        System.out.printf("[name:%s] [hp:%d] [def:%d] [damage:%d] [isAlive?:%b].", this.name, this.hp, this.def,
                this.damage, this.isAlive);
        System.out.println();
    }

    /**
     * @param attacker guy who attack!
     * @param defender guy who takes damage!
     */
    public void Attack(Unit attacker, Unit defender) {
        if (defender.isAlive) {
            defender.hp = (defender.hp + defender.def) - attacker.damage;
            if (defender.hp <= 0) {
                defender.isAlive = false;
                System.out.println(attacker.name + " kill " + defender.name);
            }
        } else {
            System.out.printf(" %s is already dead, %s cant hit him \n", defender.name, attacker.name);
        }

    }
}
