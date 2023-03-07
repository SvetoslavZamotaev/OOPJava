package pack;

import java.util.ArrayList;

public abstract class Unit implements IngameInterface {
    protected String name;
    protected int hp;
    protected int maxhp;
    protected int def;
    protected int attack;
    protected int min_damage;
    protected int max_damage;
    protected int speed;
    protected String state;
    protected PointField coords;
    protected int teamID;
    protected String whoAm;

    public Unit(String name, int hp, int def, int damage) {
        this.name = name;
        this.hp = hp;
        this.def = def;
        this.max_damage = damage;
    }

    public Unit() {

    }

    @Override
    public StringBuilder ggetInfo() {
        return new StringBuilder("");
    }

    public int[] getCoords() {
        return new int[] { coords.x, coords.y };
    }

    public void getInfo() {
        System.out.printf("[name:%s] [hp:%d] [def:%d] [damage:%d] [isAlive?:%b].", this.name, this.hp, this.def,
                this.max_damage, this.state);
        System.out.println();
    }

    public int GetSpeed() {
        return this.speed;
    }

    public int GetHP() {
        return this.hp;
    }

    public int getTeamID() {
        return teamID;
    }

    public String getState() {
        return state;
    }

    public void SetTeam(int id) {
        this.teamID = id;
    }

    @Override
    public String toString() {
        return name +
                " H:" + hp +
                " D:" + coords.x +
                " A:" + coords.y +
                " Dmg:" + Math.abs((min_damage + max_damage) / 2) +
                " " + state;
    }

    protected int findNearest(ArrayList<Unit> team) {
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (min > coords.CalculateDist(team.get(i).coords) && !team.get(i).state.equals("Die")) {
                index = i;
                min = coords.CalculateDist(team.get(i).coords);
            }
        }
        return index;
    }

    public void getDamage(int damage) {
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            this.state = "Die";
        }
        if (hp > maxhp) {
            hp = maxhp;
        }
    }
}
