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

    @Override
    public StringBuilder ggetInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Копейщик:\t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.x).append(".")
                .append(Spearman.super.coords.y);
    }
}
