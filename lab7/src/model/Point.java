package model;

public class Point {
    private  int x ;
    private  int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (int ax, int ay){

        return Math.sqrt(Math.pow(ax-this.x,2)+Math.pow(ay-this.y,2));

    }

    @Override
    public String toString() {
        return x +" "+this.y ;
    }

    @Override
    public int hashCode() {

        return x+y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Point other = (Point) obj;
        if (this.x != other.getX())
            return false;
        if (this.y != other.getY())
            return false;
        return true;
    }

}
