package controler.Exeptions;

public class InputRangeExeption extends Exception {
    private   int begin;
    private int end;

    public InputRangeExeption() {
    }

    public InputRangeExeption(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {

        return " Wrong Input not included in range  "+this.begin +" and "+this.end;


    }



}
