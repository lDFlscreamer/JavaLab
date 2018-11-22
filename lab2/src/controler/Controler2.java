package controler;

import model.Worker2;
import view.IOConsole;

public class Controler2 {

  private Worker2 exercise2;
  private IOConsole out =new IOConsole();

    public Controler2() {
    }

    public void start(){
        System.out.println("enter a text:");
        exercise2=new Worker2(out.inputString());
        System.out.println("enter a character :");
        exercise2.edit(out.inputString().substring(0,1));
        out.out(exercise2.getText());
        }
}
