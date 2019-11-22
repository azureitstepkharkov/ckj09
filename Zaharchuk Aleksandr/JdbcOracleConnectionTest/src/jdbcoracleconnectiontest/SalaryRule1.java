package jdbcoracleconnectiontest;


public class SalaryRule1 implements ISalaryCalc
{
    double salary;
    @Override
    public double calcSalary() 
    {
       return salary;
    }
    public SalaryRule1(double salary)
    {
        this.salary = salary;
    }
}
