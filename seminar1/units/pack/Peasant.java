package pack;

import java.util.ArrayList;

public class Peasant extends Unit {

    public Peasant(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Peasant(String name, int x, int y) {
        super();
        super.name = name;
        super.hp = 1;
        super.def = 1;
        super.max_damage = 1;
        super.min_damage = 1;
        super.speed = 3;
        super.attack = 1;
        super.coords = new PointField(x, y);
        super.whoAm = "Peasant";
    }

    @Override
    public String GetInfo() {
        return "I'm a Peasant : " + name + " " + super.coords.GetCoords() + " " + "team"
                + Integer.toString(super.teamID);
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {

    }

}
