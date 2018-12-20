package controler.Exeptions;

public class WrongRangeExeption extends Exception {
    private   int begin;
    private int end;

    public WrongRangeExeption() {
    }

    public WrongRangeExeption(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {

        return " Wrong Range parameters "+this.begin +" and "+this.end;


    }

}
