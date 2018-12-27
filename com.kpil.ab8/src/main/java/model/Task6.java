package model;

import controler.Exeptions.CantFoundElemByExeption;
import controler.Exeptions.EmptyRangeExeption;
import controler.Exeptions.WrongRangeExeption;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import view.OutConsole;

import java.util.ArrayList;
import java.util.Random;

public class Task6 {
    private static final Logger log= LogManager.getLogger(Task6.class);
    public ArrayList<Patient> task;
  private  final Random random = new Random();
    OutConsole Console=new OutConsole();
    String[] diagnosis={"Lupus","cancer","Flu","Pertussis"};
    String[] name={"Іван","Валерій","Йосип","Аккакій ","Света ","Лена","Вика ","Вероника"};
    String[] patronimic={"Олександрович/дрівна","Іванович/івна","Андрійович/ївна","Йосипович/івна"};
    String[] surname ={"Жуковський/а","Симоненко","Палій","Pertussis"};


    public Task6() {
        this.task=new ArrayList<Patient>();
        createArray(this.task);
        log.debug("create"+this.getClass());
    }



    public Task6(ArrayList<Patient> task) {
        this.task = task;
        log.debug("create"+this.getClass());
    }

    public ArrayList<Patient> getPatientArray() {
        System.out.println("Task6.getPatientArray");
        System.out.println("task = " + task);
        return this.task;
    }

    public void createArray(ArrayList<Patient> array)
    {
        for (int i=0;i<5 + random.nextInt(5);i++) {
            Patient temp =new Patient();
           temp.setDiagnosis(new StringBuilder(this.diagnosis[random.nextInt(this.diagnosis.length)]));
            temp.setName(new StringBuilder(this.name[random.nextInt(this.name.length)]));
            temp.setSurname(new StringBuilder(this.surname[random.nextInt(this.surname.length)]));
            temp.setPatronimic(new StringBuilder(this.patronimic[random.nextInt(this.patronimic.length)]));
            array.add(temp);

        }
        log.info("create"+array);
    }

    public ArrayList<Patient> getTask() {
        System.out.println("Task6.getTask");
        System.out.println(task.toString());
        return this.task;
    }

    public ArrayList<Patient>   searchDiagnosis() throws CantFoundElemByExeption {
        ArrayList<Patient> result=new ArrayList<Patient>();

        int temp;
        boolean empty=true;
        Console.out(diagnosis);

            System.out.println("enter a num of diagnosis:");
            temp = Console.inputInRange(0,4);



      for (Patient human:
           this.task) {
          if(human.getDiagnosis().toString().equals(this.diagnosis[temp-1])){
                empty=false;
              result.add( human);

          }
      }
        if(result.size()==0) {
            throw new CantFoundElemByExeption(this.diagnosis[temp-1]) ;
        }

    return result;
  }

    public ArrayList<Patient >searchMedCard() throws EmptyRangeExeption,WrongRangeExeption {
        ArrayList<Patient> result=new ArrayList<Patient>();
      int begin,end;
      boolean empty=true;

      System.out.println("range of Med Car id ");

        System.out.println("first numb");
        begin =Console.inputInt();
        System.out.println("Begin in "+begin);

        System.out.println("second numb");
        end =Console.inputInt();
        System.out.println("End in "+end);



        if(begin>end) throw new WrongRangeExeption(begin,end);
        for (Patient human:
                this.task) {
            if( human.getMedicalCard()>= begin && human.getMedicalCard()<= end){
                empty=false;
                result.add(human);
            }
        }

        if(result.size()==0) {
            throw new  EmptyRangeExeption (begin,end);
        }



        return result;
  }

}
