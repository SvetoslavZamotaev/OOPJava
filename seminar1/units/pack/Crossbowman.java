package pack;

import java.util.ArrayList;

public class Crossbowman extends Unit {
    protected int shots;

    public Crossbowman(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Crossbowman(String name, int x, int y) {
        super();
        super.name = name;
        super.hp = 10;
        super.maxhp = 10;
        super.def = 3;
        super.max_damage = 3;
        this.shots = 16;
        super.attack = 6;
        super.min_damage = 2;
        super.speed = 4;
        super.coords = new PointField(x, y);
        super.whoAm = "Crossbowman";
        super.state = "Stand";
    }

    /**
     * @param target // target for destroing armor of enemy
     */

    @Override
    public String GetInfo() {
        return "I'm a Crossbowman : " + name + " " + super.coords.GetCoords() + " " + "team"
                + Integer.toString(super.teamID) + " " + "HP:" + Integer.toString(super.hp) + " " + super.state;
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (state.equals("Die") || shots == 0)
            return;
        Unit victim = team2.get(findNearest(team2));
        int damage = (victim.def - attack) > 0 ? min_damage
                : (victim.def - attack) < 0 ? max_damage : (max_damage + min_damage) / 2;
        victim.getDamage(damage);
        for (Unit unit : team1) {
            if (unit.whoAm == "Peasant") {
                unit.state = "Busy";
                return;
            }
        }
        shots--;
    }

}
