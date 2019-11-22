package jdbcoracleconnectiontest;

public class SalaryRule2 implements ISalaryCalc {
    double base;
    double percent;
    @Override
    public double calcSalary() {
        return base + base * percent;
    }
    public SalaryRule2(double base, double percent)
    {
        this.base = base;
        this.percent = percent;
    }
}
