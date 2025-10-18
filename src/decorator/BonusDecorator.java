package decorator;

import composite.Employee;

public class BonusDecorator extends EmployeeDecorator {
    private double bonus;

    public BonusDecorator(Employee decoratedEmployee, double bonus) {
        super(decoratedEmployee);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return decoratedEmployee.getSalary() + bonus;
    }

    @Override
    public void showInfo() {
        System.out.println("🏅 Bonus applied to " + name + ": +" + bonus);
        System.out.println("→ Total salary (with bonus): " + getSalary());
    }
}
