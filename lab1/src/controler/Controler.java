package controler;

import model.Worker;
import view.OutConsole;

public class Controler{

  private Worker exercise=new Worker(6);
  private   OutConsole out =new OutConsole();

    public Controler() {
    }

    public void start(){

        out.out(exercise.getMatrix());
        System.out.println("Sum="+String.format("%(.2f",exercise.count()));


    }
}
