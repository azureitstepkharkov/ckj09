package model;

import java.util.Date;
import java.util.Vector;

public class DbHelper {
    public Vector<Emploee> getEmploee(){
        Emploee emp1 = new Emploee(-1,new Date(),"Ivanov1", "Ivan1", 1000, "iT", "petrov", "developer");
        Emploee emp2 = new Emploee(-1,new Date(),"Ivanov2", "Ivan2", 1000, "iT", "petrov", "developer");
        Vector<Emploee> VE = new Vector<Emploee>();
        VE.add(emp1);
        VE.add(emp2);
        return VE;

    }
}
