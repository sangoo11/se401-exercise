package decorator;

import composite.Employee;

public abstract class EmployeeDecorator extends Employee {
    protected Employee decoratedEmployee;

    public EmployeeDecorator(Employee decoratedEmployee) {
        super(decoratedEmployee.getName(), decoratedEmployee.getBaseSalary());
        this.decoratedEmployee = decoratedEmployee;
    }

    @Override
    public double getSalary() {
        return decoratedEmployee.getSalary();
    }

    @Override
    public void showInfo() {
        decoratedEmployee.showInfo();
    }
}
