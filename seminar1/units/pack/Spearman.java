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
        if (state.equals("Die"))
            return;
        Unit victim = team2.get(findNearest(team2));
        if (victim.coords.CalculateDist(coords) < 2) {
            int damage = (victim.def - attack) > 0 ? min_damage
                    : (victim.def - attack) < 0 ? max_damage : (max_damage + min_damage) / 2;
            victim.getDamage(damage);
        } else {
            PointField temp = coords.chooseWay(victim.coords);
            if (Math.abs(temp.x) < Math.abs(temp.y)) {
                if (coords.chooseWay(victim.coords).y > 0) {
                    coords.y--;
                } else {
                    coords.y++;
                }
            } else {
                if (coords.chooseWay(victim.coords).x > 0) {
                    coords.x--;
                } else {
                    coords.x++;
                }
            }
        }
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
