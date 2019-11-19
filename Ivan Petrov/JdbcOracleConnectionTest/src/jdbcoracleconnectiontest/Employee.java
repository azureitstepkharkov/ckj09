package jdbcoracleconnectiontest;


class Employee {
     //
    int id;
    String fname;
    String lname;
    float sal;
    String jobName;
    String depName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    //
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
