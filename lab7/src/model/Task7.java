package model;

import model.Point;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Task7 {

   private HashSet<Point> hash;

    private HashMap<Point,Double> distance ;
    private Point minDistancePoint;

    public Task7() {
        this.distance=new HashMap<Point, Double>();
    }

    public Task7(HashSet<Point> hash) {
        this();
        this.hash = hash;
        this.fillDistance();

    }


    public HashMap<Point, Double> getDistance() {
        return distance;
    }

    public double  getMinPointDistance( )
    {

        return this.distance.get(this.minDistancePoint);


    }

    public void  pointDistance(Point p)
    {
        double minDistance =999999999;
        double sum=0;
        sum=0;

        if (this.minDistancePoint!=null && this.distance.get(minDistancePoint)!=null )
        {

           minDistance=this.distance.get(this.minDistancePoint) ;

        }

        for (Point ps:
                this.hash) {
            if(!ps.equals(p)) {
               // System.out.println("<sum = " + sum);
                sum +=p.distance(ps.getX(), ps.getY());
            //    System.out.println("ps+p = " + ps+"\\"+p);
            //    System.out.println("sum = " + sum+">");
            }

        }
        this.distance.put(p,sum);
        if(sum<=minDistance)
        {
           // System.out.println("minDistance and sum = " + minDistance +"|"+sum);
            this.minDistancePoint=(Point)p;
            minDistance=sum;
         //   System.out.println("minDistance = " + minDistance);


        }

    }

    public void addPoint(Point p){

        this.hash.add(p);
        if(hash.contains(p)){
            pointDistance(p);
        }


    }

    public void fillDistance(){


            for (Point p:
                    this.hash) {
                pointDistance(p);

            }



        }

    public Point getMinDistancePoint() {
        return minDistancePoint;
    }

    public Set<Point> getHash() {
        return hash;
    }
}
