
package jdbcoracleconnectiontest;


public class SalaryRule2 implements ISalaryCalc
{
    double precent;
    double base;
    @Override
    public double calcSalary() 
    {
        return base + base * precent;
    }
    public  SalaryRule2(double base, double precent)
    {
        this.base = base;
        this.precent = precent;
    }
    
}
