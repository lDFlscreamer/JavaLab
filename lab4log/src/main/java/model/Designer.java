package model;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class Designer extends Human{
    private static final Logger log= LogManager.getLogger(Designer.class);


    private DesignerDepartament depart;

    public Designer(String name) {
        super();
        this.name = name;
        log.trace(name+ "was born age ");
    }

    public  class DesignerDepartament{


     public DesignerDepartament() {
         log.info("Departament was created");
     }

     public void work(int val){

        for(int i=0;i<val;i++){

        log.info(i+"iter");

        }


     }

 }

 public Buildings createDepartament(SW obj){

        this.depart = new DesignerDepartament();
        this.depart.work((int)obj.getArea());
        log.info("departament worked");
        return new Buildings(obj,"styleLenth street");

    }

}
