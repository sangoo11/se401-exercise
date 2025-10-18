package composite;

public class Staff extends Employee {

    public Staff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }

    @Override
    public void showInfo() {
        System.out.println("- " + name + " : " + getSalary());
    }
}
