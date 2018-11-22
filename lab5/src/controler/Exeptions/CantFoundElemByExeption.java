package controler.Exeptions;

public class CantFoundElemByExeption extends Exception {
    private String Param;

    public CantFoundElemByExeption() {
    }

    public CantFoundElemByExeption(String param) {
        Param = param;
    }

    @Override
    public String toString() {

        return " Dont exist elements  by "+this.Param;


    }
}