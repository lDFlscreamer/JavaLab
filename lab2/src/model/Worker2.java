package model;

public class Worker2 {
  private   StringBuilder text;

    public Worker2() {
        this.text = new StringBuilder( "Extremely we promotion remainder eagerness enjoyment an. Ham her demands removal brought minuter raising invited gay. Contented consisted continual curiosity contained get sex. Forth child dried in in aware do. You had met they song how feel lain evil near. Small she avoid six yet table china. And bed make say been then dine mrs. To household rapturous fulfilled attempted on so. ");

    }

    public Worker2(String text) {
        this.text = new StringBuilder( text);
    }


    public String getText() {
        return text.toString();
    }

    public void setText(String text) {
        this.text = new StringBuilder( text);
    }



    public void edit (String a ){
        int n = this.text.indexOf(a);
        while(n!=-1) {



            this.text.deleteCharAt(n);

            n = this.text.indexOf(a);
        };
    }

    public void edit (StringBuilder Text,String a ){
        int n = Text.indexOf(a);
        while(n!=-1) {



            Text.deleteCharAt(n);

            n = Text.indexOf(a);
        };
    }
}
