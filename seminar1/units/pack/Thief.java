package pack;

import java.util.ArrayList;
import java.util.Random;

public class Thief extends Unit {
    Random r = new Random();

    public Thief(String name, int hp, int def, int damage) {
        super(name, hp, def, damage);
    }

    public Thief(String name, int x, int y) {
        super();
        super.name = name;
        super.hp = 10;
        super.maxhp = 10;
        super.def = 3;
        super.max_damage = 4;
        super.min_damage = 2;
        super.speed = 6;
        super.attack = 8;
        super.coords = new PointField(x, y);
        super.whoAm = "Thief";
        super.state = "Stand";
    }

    /**
     * @param person // ability with added def for Thief person
     */
    public void Dexterity(Thief person) {
        person.def = person.def + r.nextInt(60);
    }

    @Override
    public String GetInfo() {
        return "I'm a Thief : " + name +
                " " + super.coords.GetCoords() +
                " " + "team" + Integer.toString(super.teamID)
                + " " + "HP:" + Integer.toString(super.hp) + " " + super.state;
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
            if (Math.abs(temp.x) > Math.abs(temp.y)) {
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
        return builder.append("Бандит: \t").append(Thief.super.name)
                .append("\t| ATK:\t").append(Thief.super.attack)
                .append("\t| HP:\t").append(Thief.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Thief.super.coords.x).append(".")
                .append(Thief.super.coords.y);
    }

}
