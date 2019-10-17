package Model;

import java.util.Date;
import java.util.Vector;


public class DbHelper 
{
    public Vector<Employee> getEmployees()
    {
        Employee emp1 = new Employee(-1, 
                new Date(), 
                "IvANOV",
                "iVAN",
                1000, 
                "iT", 
                "Petrov",
                "developer");
        Employee emp2 = new Employee(-1, 
                new Date(), 
                "Petrov",
                "Piter",
                1200, 
                "It", 
                "NONE",
                "manager");
        Vector<Employee> v = new Vector<Employee>();
        v.add(emp1);
        v.add(emp2);
        return v;
    }
    
}
