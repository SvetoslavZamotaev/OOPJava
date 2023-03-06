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
        super.maxhp = 30;
        super.def = 12;
        super.max_damage = -5;
        super.min_damage = -5;
        super.speed = 9;
        super.attack = 17;
        super.coords = new PointField(x, y);
        super.whoAm = "Magician";
        super.state = "Stand";
    }

    @Override
    public String GetInfo() {
        return "i'm a Magician : " + name + " " + super.coords.GetCoords() + " " + "team"
                + Integer.toString(super.teamID) + " " + "HP:" + Integer.toString(super.hp) + " " + super.state;
    }

    @Override
    public void Step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (state.equals("die"))
            return;
        Unit victim = findVeryLow(team1);
        victim.getDamage(min_damage);
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

    @Override
    public StringBuilder ggetInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Колдун: \t").append(Magician.super.name)
                .append("\t| ATK:\t").append(Magician.super.attack)
                .append("\t| HP:\t").append(Magician.super.hp)
                .append(" \t| MP:\t").append("mana")
                .append("\t|").append("\t| (X.Y) : ").append(Magician.super.coords.x).append(".")
                .append(Magician.super.coords.y);
    }
}
