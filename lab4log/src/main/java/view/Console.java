package view;

import java.util.Random;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Console implements In,Out{
    private static final Logger log= LogManager.getLogger(Console.class);
    private  final Random random = new Random();
    Scanner scanner=new Scanner(System.in);



    public void out(String obj) {
        System.out.println(obj);
    }

    public int getRandomInt(int range){


        return random.nextInt(range);
    }


    public   String inputString(){


        return scanner.nextLine();

    }

    public int inputInRange(int begin,int end){
        boolean  correct=true;
        int answ=0;
        do {
            try {
                answ= this.inputInt();
                correct =true;
                if(answ < begin || answ > end) throw new Exception("wrong Range");
            } catch ( Exception e) {
                correct =false;
               log.error(e.toString());
            }

        }while(!correct  );

        return answ;

    }
    public   int inputInt(){
        boolean  correct=true;
        int answ=0;
        do {
            try {
                answ= scanner.nextInt();
                correct =true;
            } catch (Exception e) {
                correct =false;
                scanner.next();
                log.error("\t\t Enter correct value",e);
            }

        }while(!correct);
        return answ;
    }

    public  void begin(){
        System.out.println("-------------------");
        System.out.println("lab 4  ");
        System.out.println("Tverdokhlib Is-62");
        System.out.println("-------------------");

    }


}


