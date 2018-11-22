package model;

import controler.Exeptions.CantFoundElemByExeption;
import controler.Exeptions.EmptyRangeExeption;
import controler.Exeptions.WrongRangeExeption;
import view.OutConsole;

import java.util.ArrayList;
import java.util.Random;

public class Task3 {
    public Patient[] task;
  private  final Random random = new Random();
    OutConsole Console=new OutConsole();
    String[] diagnosis={"Lupus","cancer","Flu","Pertussis"};
    String[] name={"Іван","Валерій","Йосип","Аккакій ","Света ","Лена","Вика ","Вероника"};
    String[] patronimic={"Олександрович/дрівна","Іванович/івна","Андрійович/ївна","Йосипович/івна"};
    String[] surname ={"Жуковський/а","Симоненко","Палій","Pertussis"};


    public Task3() {
        this.task=new Patient[1+random.nextInt(15)];
        createArray(this.task);

    }

    public Task3(int amount ) {
        this.task=new Patient[amount];
        createArray(this.task);
    }

    public Task3(Patient[] task) {
        this.task = task;
    }

    public Patient[] getPatientArray() {
        return this.task;
    }

    public void createArray(Patient[] array)
    {
        for (int i=0;i<array.length;i++) {
            array[i] =new Patient();
            array[i].setDiagnosis(new StringBuilder(this.diagnosis[random.nextInt(this.diagnosis.length)]));
            array[i].setName(new StringBuilder(this.name[random.nextInt(this.name.length)]));
            array[i].setSurname(new StringBuilder(this.surname[random.nextInt(this.surname.length)]));
            array[i].setPatronimic(new StringBuilder(this.patronimic[random.nextInt(this.patronimic.length)]));
        }
    }

    public Patient[] getTask() {
        return task;
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
