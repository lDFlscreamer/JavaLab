package controler;

import model.Patient;
import model.Task6;
import view.FileInputTextView;
import view.FileJsonView;
import view.FileSerView;
import view.OutConsole;


import java.io.IOException;
import java.util.ArrayList;

public class Controler3  {

    private Task6 task;
   private OutConsole Console=new OutConsole();
   private FileSerView serializ ;
   private FileInputTextView txtF;
   private FileJsonView json;

    public Controler3(Task6 taskб) throws IOException {
        this.task = task;
        serializ = new FileSerView("D:\\temp","file.ser");
        txtF=new FileInputTextView("D:\\temp","patient.txt");
        json=new FileJsonView();

    }

    public Controler3() throws IOException{
        this.task = new Task6();
        serializ = new FileSerView("D:\\temp","file.ser");
        txtF=new FileInputTextView("D:\\temp","patient.txt");
        json=new FileJsonView();
    }

    public Task6 getTask() {
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
            Console.out("4.input from File");
            Console.out("5.out to File");
            Console.out("6.input from txtFile");
            Console.out("7.out to txtFile");
            Console.out("8.out to JsonFile");
            Console.out("9.input to JsonFile");
            Console.out("10.exit");


            do {
                System.out.println("what to do?");
                key = Console.inputInt();
            } while (key <= 1 && key >= 10);

            if (key == 10) System.exit(1);
            try {


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
                        Console.out(this.task.searchMedCard());
                        break;
                    case 4:
                            this.task=new Task6(colectFile());
                        Console.out("Input from File");
                        break;
                    case 5:
                        outFile(this.getTask().getPatientArray());
                        Console.out("out to File");
                        break;
                    case 6:
                        this.task=new Task6(colectTxt());
                        Console.out(this.getTask().getPatientArray());
                        Console.out("Input from txtFile");
                        break;
                    case 7:

                        outTxt(this.getTask().getPatientArray());
                        Console.out("out to txtFile");
                        break;
                    case 8:

                        outJson(this.getTask().getPatientArray().get(0));
                        Console.out("out to jsonFile");
                        break;
                    case 9:
                      //  Console.out(this.getTask().getTask());
                        System.out.println();
                       Console.out(this.colectJson());
                      // Console.out(this.getTask().getPatientArray());
                      //  Console.out(this.getTask().getTask());
                        Console.out("input to jsonFile");
                        break;
                }
            }
            catch (Exception e){
                System.err.println( e.toString());
            }



        }


    }

    private ArrayList<Patient> colectFile()throws ClassNotFoundException,IOException{
        Patient temp;
       ArrayList<Patient> result= new ArrayList<Patient>();
       try{
       while((temp=this.serializ.readNextPatient())!=null){

           result.add(temp);
       }}
       catch(Exception e){}
       finally {
           return result;
       }
    }

    private ArrayList<Patient> colectTxt()throws ClassNotFoundException,IOException{
        Patient temp;
        ArrayList<Patient> result= new ArrayList<Patient>();
        try{
            while((temp=this.txtF.readNextPatient())!=null){

                result.add(temp);

            }}
        catch(Exception e){
            return result;
        }
        return result;

    }

    private void outTxt (ArrayList<Patient> forOut) throws IOException
    {  this.txtF.startStreamToOutFile("");
        try {
            for (Patient p : forOut) {

                this.txtF.writeNextPatient(p);


            }
        }
        catch (NullPointerException e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }

    }
    private void outJson (ArrayList<Patient> forOut) throws IOException
    {
            for (Patient p : forOut) {

                this.json.addRecord(p);


            }
            this.json.writeJson("D:\\\\temp\\patient.json");


    }

    private void outJson (Patient exmpl) throws IOException
    {



        this.json.writeJson("D:\\\\temp\\patient.json", exmpl );


    }

    private Patient colectJson()throws ClassNotFoundException,IOException{

            return this.json.ReadJson("D:\\\\temp\\patient.json");



    }


    private void outFile (ArrayList<Patient> forOut) throws IOException
    {
        for(Patient p:forOut)
        {
            this.serializ.writeNextPatient(p);

        }

    }
}


