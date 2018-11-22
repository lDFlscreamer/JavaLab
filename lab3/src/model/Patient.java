package model;

import java.util.List;

public class Patient {
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
}

