package model;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


public class Buildings extends SW{
        protected String adress;

    private static final Logger log= LogManager.getLogger(Buildings.class);


    public Buildings() {
        log.trace("build created"+this.toString());
    }

    public Buildings(int x, int y) {
        super(x,y);
        log.trace("build created"+this.toString());
            }

    public Buildings(int x, int y, double area, double cost) {
        super(x, y, area, cost);
        log.trace("build created"+this.toString());
    }


    public Buildings(String adress) {
        this.adress = adress;
        log.trace("build created"+this.toString());
    }

    public Buildings(int x, int y, double area, double cost, String adress) {
        super(x, y, area, cost);
        this.adress = adress;
        log.info("build created"+this.toString());
    }

    public Buildings(SW obj, String adress) {
        super(obj.getX(), obj.getY(), obj.getArea(), obj.getCost());
        this.adress = adress;
        log.info("build created"+this.toString());
    }


    @Override
    public String toString() {
        return super.toString()+this.x +":"+this.y +  "area "+this.area+ "adress"+this.adress+"sost"+this.cost;
    }
}
