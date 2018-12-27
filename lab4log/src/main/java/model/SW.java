package model;

public class SW {
   protected int x;
     protected int y;
     protected double area;
    protected  double cost;

    public SW() {
    }

    public SW(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public SW(int x, int y, double area, double cost) {
        this.x = x;
        this.y = y;
        this.area = area;
        this.cost = cost;
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

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    @Override
    public String toString() {
        return "SW{" +
                "x=" + x +
                ", y=" + y +
                ", area=" + area +
                ", cost=" + cost +
                '}';
    }
}
