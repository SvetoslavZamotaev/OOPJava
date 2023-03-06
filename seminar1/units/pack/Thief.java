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
