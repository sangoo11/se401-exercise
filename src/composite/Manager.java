package composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Employee> subordinates = new ArrayList<>();

    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    @Override
    public double getSalary() {
        double total = baseSalary;
        for (Employee e : subordinates) {
            total += e.getSalary();
        }
        return total;
    }

    @Override
    public void showInfo() {
        System.out.println("+ " + name + " : " + baseSalary);
        for (Employee e : subordinates) {
            e.showInfo();
        }
    }
}
