
package jdbcoracleconnectiontest;


class Employee {
    
            int id;
            String fname;
            String lname; 
            float sal;
            String jobName; 
            String depName;

    Employee(int id, 
            String fname, 
            String lname, 
            float sal, 
            String jobName, 
            String depName) 
    {
        this.depName = depName;
        this.fname = fname;
        this.id = id;
        this.jobName = jobName;
        this.sal = sal;
    }
    
}
