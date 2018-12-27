package view;



import controler.Exeptions.InputRangeExeption;
import model.Patient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class  OutConsole {

    private static final Logger log = LogManager.getLogger(OutConsole.class );
    Scanner scanner=new Scanner(System.in);


    public  void  out( String data){
        System.out.println(data);

    }

    public void  out(String[] data ){

            for (String string:
                data ) {
            System.out.println(string);
                    }


        }

    public  void  out(Object one){
        System.out.println(one.toString());

    }

    public void out (Object[] data){
        for (Object one :
             data) {
            out(one);
        }

    }

    public void out (Patient human){
        try {
            System.out.println(human.toString());
        }catch (NullPointerException e ){
            log.error(e.getStackTrace());

        };
    }

    public void out(Patient[] humanity){
        try {
            hat();

            for (Patient human :
                    humanity) {
                out(human);

            }
        }catch (NullPointerException e)
        {

        };
    }

    public void out( ArrayList<Patient> humanity){
        try {
            hat();

            for (int i=0;i<humanity.size();i++) {
                out(humanity.get(i));

            }
        }catch (NullPointerException e)
        {

        };
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
                if(answ < begin || answ > end) throw new InputRangeExeption(begin,end);
            } catch ( InputRangeExeption e) {
                correct =false;

                log.error(e.getMessage());
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
            } catch (InputMismatchException e) {
                correct =false;
                scanner.next();
               log.error("\t\t Enter correct value");
            }

        }while(!correct);
            return answ;
    }

    public  void begin(){
        System.out.println("-------------------");
        System.out.println("lab 6  ");
        System.out.println("Tverdokhlib Is-62");
        System.out.println("-------------------");

    }

    private void hat(){

        System.out.println(String.format("%1$-10s\t\t%2$-30s\t%3$-30s\t%4$-30s\t%5$-30s\t\t%6$-30s","ID","|Name","|Patronimic","|Surname","|Med.card","|Diagnosis"));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
