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
        super.def = 3;
        super.max_damage = 3;
        this.shots = 16;
        super.attack = 6;
        super.min_damage = 2;
        super.speed = 4;
        super.coords = new PointField(x, y);
        super.whoAm = "Crossbowman";
    }

    /**
     * @param target // target for destroing armor of enemy
     */

    @Override
    public String GetInfo() {
        return "I'm a Crossbowman : " + name + " " + super.coords.GetCoords() + " " + "team"
                + Integer.toString(super.teamID);
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {

    }

}
