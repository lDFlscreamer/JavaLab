package model;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
import view.Console;

public class Manager extends Human{

    private static final Logger log= LogManager.getLogger(Manager.class);


    public Manager(String name, int age) {
        super(name, age);
        log.trace(name+ "was born age "+age);
    }

    public void apply(SW obj){


        log.info("Sw"+obj +"OK");
    }


}
