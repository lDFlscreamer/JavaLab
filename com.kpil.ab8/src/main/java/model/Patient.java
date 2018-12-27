package model;

import java.io.*;
import java.util.List;

public class Patient implements Serializable {
         private StringBuilder
                name,surname ,patronimic,diagnosis;
         private static int increment;
         private int id,medicalCard ;


    public Patient() {

       this("Іван","Іванов","Іванович");
    }

    public Patient(String name, String surname, String patronimic) {

        this.name = new StringBuilder(name);
        this.surname = new StringBuilder(surname);
        this.patronimic = new StringBuilder(patronimic);
        this.id=increment;
        this.medicalCard=this.id;
        increment++;

    }

    public Patient(String name, String surname, String patronimic,String Diagnosis) {

        this.name = new StringBuilder(name);
        this.surname = new StringBuilder(surname);
        this.patronimic = new StringBuilder(patronimic);
        this.diagnosis =new StringBuilder(Diagnosis);
        this.id=increment;
        this.medicalCard=this.id;
        increment++;

    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        this.name = name;
    }

    public StringBuilder getSurname() {
        return surname;
    }

    public void setSurname(StringBuilder surname) {
        this.surname = surname;
    }

    public StringBuilder getPatronimic() {
        return patronimic;
    }

    public void setPatronimic(StringBuilder patronimic) {
        this.patronimic = patronimic;
    }

    public int getId() {
        return id;
    }

    public void setDiagnosis(StringBuilder diagnosis) {
        this.diagnosis = diagnosis;
    }

    public StringBuilder getDiagnosis() {
        return diagnosis;
    }

    public int getMedicalCard() {
        return medicalCard;

    }

    @Override
    public String toString() {
        return String.format("%1$-10s\t\t%2$-30s\t%3$-30s\t%4$-30s\t%5$-30s\t\t%6$-30s",this.id,this.name,this.patronimic,this.surname,this.medicalCard,this.diagnosis);
    }

//    @Override
//   public void writeExternal(ObjectOutput out) throws IOException{
//        out.writeObject(this.name);
//        out.writeObject(this.surname);
//        out.writeObject(this.patronimic);
//        out.writeObject(this.diagnosis);
//
//    }

//    @Override
//     public  void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//        name = new StringBuilder(in.readObject().toString());
//        surname = new StringBuilder(in.readObject().toString());
//        patronimic = new StringBuilder(in.readObject().toString());
//        diagnosis =new StringBuilder(in.readObject().toString());
//
//    }
}

