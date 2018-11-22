package view;
import java.util.Scanner;

public class IOConsole {
  private   String text ;



    public IOConsole() {


    }

    public String getText() {
        return text;
    }


 

    public String inputString(){
        Scanner in = new Scanner(System.in);
        this.text=in.nextLine();
        return this.text;
    }


    public void out(String text)
    {
        System.out.println(text);


    }
}
