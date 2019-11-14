package lspexample3;

public class LSPExample3 {

    public static void main(String[] args) {

    }

    private interface ISalaryCalc {

        double calcSalary();
    }

    //только оклад
    //правило применимо только для определенных
    //должностей
    private class Rule1 implements ISalaryCalc {

        @Override
        public double calcSalary() {
            return salary;
        }

        public Rule1(double salary) {
            this.salary = salary;
        }
        private double salary;
    }
    private class Rule2 implements ISalaryCalc {

        private double base;
        private double percent;

        public Rule2(double base, double percent) {
            this.base = base;
            this.percent = percent;
        }
        @Override
        public double calcSalary() {
            return this.base * this.percent;
        }

    }

    public class Calculator
    {
        private ISalaryCalc calc;
        public Calculator(Employee e)
        {
            if (e.positions.contains("president"))
            {
                calc = new Rule2(0, 0);
            }
            else
            {
                calc = new Rule1(0);
            }
        }
        public double calcSalary()
        {
            return this.calc.calcSalary();
        }
    }

}
