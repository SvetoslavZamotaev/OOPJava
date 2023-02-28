package pack;

import java.util.ArrayList;

public class Spearman extends Unit {
    protected int ignoringDef = 20;

    public Spearman(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Spearman(String name, int x, int y) {
        super();
        super.name = name;
        super.hp = 10;
        super.maxhp = 10;
        super.def = 5;
        super.max_damage = 3;
        super.min_damage = 1;
        super.speed = 4;
        super.attack = 4;
        super.coords = new PointField(x, y);
        super.whoAm = "Spearman";
        super.state = "Stand";
    }

    @Override
    public String GetInfo() {
        return "i'm a Spearman : " + name + " " + super.coords.GetCoords() + " " + "team"
                + Integer.toString(super.teamID) + " " + "HP:" + Integer.toString(super.hp) + " " + super.state;
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {

    }

}
