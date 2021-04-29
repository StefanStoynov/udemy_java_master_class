package section_6.point;

public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public double distance() {
        int xA = this.x;
        int yA = this.y;
        int xB = 0;

        return Math.sqrt((xB - xA) * (xB - xA) + (xB - yA) * (xB - yA));
    }

    public double distance(int xB, int yB) {
        int xA = this.x;
        int yA = this.y;

        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }

    public double distance(Point point) {
        int xA = this.x;
        int yA = this.y;
        int xB = point.getX();
        int yB = point.getY();

        return Math.sqrt((xB - xA) * (xB - xA) + (yB - yA) * (yB - yA));
    }
}
