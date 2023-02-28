package pack;

import java.util.ArrayList;

public class Magician extends Unit {

    public Magician(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Magician(String name, int x, int y) {
        super();
        super.name = name;
        super.hp = 30;
        super.def = 12;
        super.max_damage = -5;
        super.min_damage = -5;
        super.speed = 9;
        super.attack = 17;
        super.coords = new PointField(x, y);
        super.whoAm = "Magician";
    }

    @Override
    public String GetInfo() {
        return "i'm a Magician : " + name + " " + super.coords.GetCoords() + " " + "team"
                + Integer.toString(super.teamID);
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {

    }
}
