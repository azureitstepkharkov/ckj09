package Model;

import java.util.Date;
import java.util.Vector;

public class DbHelper {

    public Vector<Employee> getEmployee() {

        Employee emp1 = new Employee(-1, new Date(), "IvANOV", "Ivan", 1000, "IT", "Petrov", "Developer");
        Employee emp2 = new Employee(-1, new Date(), "IvANOV", "Ivan", 1000, "IT", "Petrov", "Developer");
        Vector<Employee> v = new Vector<Employee>();
        v.add(emp1);
        v.add(emp2);
        return v;
    }

}
