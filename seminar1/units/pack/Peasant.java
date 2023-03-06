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
        super.maxhp = 1;
        super.def = 1;
        super.max_damage = 1;
        super.min_damage = 1;
        super.speed = 3;
        super.attack = 1;
        super.coords = new PointField(x, y);
        super.whoAm = "Peasant";
        super.state = "Stand";
    }

    @Override
    public String GetInfo() {
        return "I'm a Peasant : " + name + " " + super.coords.GetCoords() + " " + "team"
                + Integer.toString(super.teamID) + " " + "HP:" + Integer.toString(super.hp) + " " + super.state;
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (!state.equals("Die"))
            state = "Stand";
    }

    @Override
    public StringBuilder ggetInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Фермер: \t").append(Peasant.super.name)
                .append("\t| ATK:\t").append(Peasant.super.attack)
                .append("\t| HP:\t").append(Peasant.super.hp)
                .append(" \t| Arrows: ").append("ShotsP")
                .append("\t|").append("\t| (X.Y) : ").append(Peasant.super.coords.x).append(".")
                .append(Peasant.super.coords.y);
    }
}
