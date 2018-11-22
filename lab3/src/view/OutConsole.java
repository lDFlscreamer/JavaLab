package view;



import model.Patient;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OutConsole  {

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
        }catch (NullPointerException e ){};
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

    public  void begin(){
        System.out.println("-------------------");
        System.out.println("lab3 ");
        System.out.println("Tverdokhlib Is-62");
        System.out.println("-------------------");

    }

    private void hat(){

        System.out.println(String.format("%1$-10s\t\t%2$-30s\t%3$-30s\t%4$-30s\t%5$-30s\t\t%6$-30s","ID","|Name","|Patronimic","|Surname","|Med.card","|Diagnosis"));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
