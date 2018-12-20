package controler;

import model.Point;
import model.Task7;
import view.View;

import java.util.HashSet;

public class Menu {

    View view ;
    Task7 task;

    public Menu() {
        HashSet<Point> set =new HashSet<Point>();

        new Point(3,0);

        set.add(new Point(3,0));
        set.add(new Point(6,0));
        set.add( new Point(0,0));



        view=new View();
        task = new Task7(set);


    }




    public void startMenu(){

            int key = 1;

            while (true) {
                System.out.println("\n\n\n\n");

                view.out("1.Output  point ");
                view.out("2.add point");
                view.out("3.out min distance ");
                view.out("4.all distance ");


              view.out("5.exit");


                do {
                    System.out.println("what to do?");
                    key = view.inputInt();
                } while (key <= 1 && key >= 5);

                if (key == 5) System.exit(1);



                    switch (key) {
                        case 1:
                            view.out((HashSet<Point>) task.getHash());

                            break;
                        case 2:
                            task.addPoint(creatPoit());


                            break;
                        case 3:
                            view.out("min Distance Point ");
                            view.out(task.getMinDistancePoint());
                            view.out("hist sum of distance  ");
                            view.out(task.getMinPointDistance());


                            break;
                        case 4:
                            view.out("all sum distance ");
                            view.out(task.getDistance());



                            break;




                    }


        }
    }

    public Point  creatPoit(){
    int x ;
    int y;
        view.out("input first x");
       x= view.inputInt();
        view.out("input first y");
        y= view.inputInt();


return new Point(x,y);
    }
}
