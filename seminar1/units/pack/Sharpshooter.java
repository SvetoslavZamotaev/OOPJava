package pack;

import java.util.ArrayList;
import java.util.Random;

public class Sharpshooter extends Unit {
    protected int shots;

    public Sharpshooter(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Sharpshooter(String name, int x, int y) {
        super();
        super.name = name;
        super.hp = 15;
        super.maxhp = 15;
        super.def = 10;
        super.max_damage = 10;
        super.min_damage = 8;
        super.speed = 9;
        super.attack = 12;
        this.shots = 32;
        super.coords = new PointField(x, y);
        super.whoAm = "Sharpshooter";
        super.state = "Stand";
    }

    @Override
    public String GetInfo() {
        return "i'm a Sharpshooter : " + name + " " + super.coords.GetCoords() + " " + "team"
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
