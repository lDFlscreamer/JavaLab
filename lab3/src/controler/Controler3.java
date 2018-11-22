package controler;

import model.Patient;
import model.Task3;
import view.OutConsole;


import java.util.Random;

public class Controler3  {
    private Task3 task;
   private OutConsole Console=new OutConsole();

    public Controler3(Task3 task) {
        this.task = task;

    }

    public Controler3() {
        this.task = new Task3();

    }

    public Task3 getTask() {
        return task;
    }
    public void menu()  {
        int key = 1;

        while (true) {
            System.out.println("\n\n\n\n");
            Console.begin();
            Console.out("1.Output  patient ");
            Console.out("2.search by diagnosisi");
            Console.out("3.filter by Medical Card");
            Console.out("4.exit");


            do {
                System.out.println("what to do?");
                key = Console.inputInt();
            } while (key <= 1 && key >= 4);

            if (key == 4) break;
            switch (key) {
                case 1:
                    Console.out(this.getTask().getPatientArray());
                    break;
                case 2:
                    Console.out(this.getTask().getPatientArray());
                    Console.out(this.task.searchDiagnosis());

                    break;

                case 3:
                    Console.out(this.getTask().getPatientArray());
                    Console.out( this.task.searchMedCard());
                    break;


            }



        }
    }


}


