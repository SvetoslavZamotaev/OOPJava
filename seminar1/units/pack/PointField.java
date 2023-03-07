package pack;

public class PointField {
    protected int x;
    protected int y;

    public PointField(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double CalculateDist(PointField enemy) {
        return Math.sqrt(Math.pow((this.x - enemy.x), 2) + Math.pow((this.y - enemy.y), 2));
    }

    public String GetCoords() {
        return String.format("[x:%s;y:%s]", this.x, this.y);
    }

    protected PointField chooseWay(PointField opponent) {

        return new PointField(x - opponent.x, y - opponent.y);
    }

}
