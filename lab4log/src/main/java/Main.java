import controler.Controler;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Main {

    public static void main(String[] args) {
        BasicConfigurator.configure();
        Controler start=new Controler();

    start.start();



    }
}
