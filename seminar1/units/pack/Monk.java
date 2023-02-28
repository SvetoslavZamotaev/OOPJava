package pack;

import java.util.ArrayList;

public class Monk extends Unit {
    public Monk(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Monk(String name, int x, int y) {
        super();
        super.name = name;
        super.hp = 30;
        super.maxhp = 30;
        super.def = 7;
        super.max_damage = -4;
        super.min_damage = -4;
        super.speed = 5;
        super.attack = 12;
        super.coords = new PointField(x, y);
        super.whoAm = "Monk";
        super.state = "Stand";
    }

    @Override
    public String GetInfo() {
        return "I'm a Monk : " + name + " " + super.coords.GetCoords() + " " + "team" + Integer.toString(super.teamID)
                + " " + "HP:" + Integer.toString(super.hp) + " " + super.state;
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {

    }

    protected Unit findVeryLow(ArrayList<Unit> team) {
        int index = 0;
        int min = 150;
        for (int i = 0; i < team.size(); i++) {
            if (min > team.get(i).maxhp - team.get(i).hp) {
                index = i;
                min = team.get(i).maxhp - team.get(i).hp;
            }
        }
        return team.get(index);
    }
}
