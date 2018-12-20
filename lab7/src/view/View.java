package view;

import model.Point;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View {


    Scanner scanner=new Scanner(System.in);

    public void Out(String data){

        System.out.println("data = " + data);
    }

    public   String inputString(){


            return scanner.nextLine();

        }
    public   int inputInt(){
        boolean  correct=true;
        int answ=0;
        do {
            try {
                answ= scanner.nextInt();
                correct =true;

            } catch (InputMismatchException e) {
                correct =false;
                scanner.next();
                System.err.println("\t\t Enter correct value");
            }

        }while(!correct);
        return answ;
    }
    public void  out(HashSet<Point> hash){
        for (Point p:
             hash) {
            System.out.println(p.getClass().getCanonicalName());
            System.out.println("x  "+p.getX());
            System.out.println("Y  "+p.getY());


        }
    }
    public void  out(HashMap<Point,Double > hash){
        System.out.println("hash = " + hash);
    }
    public void  out(Point p){

        System.out.println(p.getClass().getCanonicalName());
        System.out.println("x  "+p.getX());
        System.out.println("Y  "+p.getY());



    }

    public void  out(double data){
        System.out.println("data = " + data);



    }

    public void  out(String data){
        System.out.println(data );
    }
}
