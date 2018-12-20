package controler.Exeptions;

public class EmptyRangeExeption extends Exception {

  private   int begin;
  private int end;

    public EmptyRangeExeption() {

    }

    public EmptyRangeExeption( int begin, int end) {

        this.begin = begin;
        this.end = end;
    }



    @Override
    public String toString() {

            return " Dont exist elements  between "+this.begin +" and "+this.end;


    }
}
