package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void add(Employee employee) {
        subordinates.add(employee);
    };
    public void remove(Employee employee) {
        subordinates.remove(employee);
    };
    public void removeAll() {
        subordinates.clear();
    };


    @Override
    public double getSalary() {
        double total = this.salary;
        for (Employee e : subordinates) {
            total += e.getSalary();
        }
        return total;
    }

    @Override
    public void getInfo() {
        System.out.println("Manager: " + name + ", Salary: " + salary);
        for (Employee employee : subordinates) {
            employee.getInfo();
        }
    }
}
