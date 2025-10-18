package composite;

public class Staff extends Employee {
    public Staff(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public void getInfo() {
        System.out.println("Staff: " + this.name + ", Salary: " + this.salary);
    }
}
