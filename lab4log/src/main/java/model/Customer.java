package model;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Customer extends Human{
    private static final Logger log= LogManager.getLogger(Customer.class);


    public Customer() {
        log.trace("was born age ");
    }

    public Customer(String name, int age) {
        super(name, age);
        log.trace(name+ "was born age "+age);
    }

    public  SW createSW(int x, int y, double area, double cost ){
        log.trace("createSW"+" "+x+" "+y+" "+area+" "+cost);
        return new SW(x,y,area,cost);

    }

}
