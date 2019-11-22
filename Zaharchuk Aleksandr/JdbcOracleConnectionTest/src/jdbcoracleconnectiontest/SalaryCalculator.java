package jdbcoracleconnectiontest;


public class SalaryCalculator implements ISalaryCalc
{
    ISalaryCalc calc;
    @Override
    public double calcSalary() 
    {
        return calc.calcSalary();
    }
    SalaryCalculator(Employee e)
    {
        //Sales Manager Sales Representative
        if (e.getJobName().contains("Sales"))
        {
            calc = new SalaryRule2(e.getSal(), 20);
        }
        else 
        {
            calc = new SalaryRule1(e.getSal());
        }
    }
            
}
