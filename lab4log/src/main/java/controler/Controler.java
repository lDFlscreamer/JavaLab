package controler;


import model.*;
import view.Console;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


public class Controler {

    private static final Logger log= LogManager.getLogger(Controler.class);
    private Console view ;
    private Customer client;
    private SW tempolary;
    private Manager man;
    private Designer dev;
    private Buildings result;

    public Controler() {

        view =new Console();
        this.client =new Customer("Bred",21);
        this.man = new Manager("Sid",35);
        this.dev = new Designer("Fread");
    }

    public Controler(Customer client, Manager man, Designer dev) {
        this.client = client;
        this.man = man;
        this.dev = dev;
        view =new Console();
    }

  public   void start(){
        view.out("Customer visit and give SW");
        log.trace("Customer visit and give SW");
        this.tempolary=client.createSW(view.getRandomInt(10),view.getRandomInt(10),10.0f,24.5f);
        log.info("SW from customer "+this.tempolary);

        view.out("manager apply SW" );
        man.apply(this.tempolary);
      result=  this.dev.createDepartament(this.tempolary);
        log.warn("work was done \n \t\t Build"+result);



    }
}
