package builder;

import composite.*;

public class CompanyBuilder {
    private Manager ceo;

    public CompanyBuilder(String ceoName, double ceoSalary) {
        ceo = new Manager(ceoName, ceoSalary);
    }

    public CompanyBuilder addDepartment(String deptName, double salary, Employee... employees) {
        Manager dept = new Manager(deptName, salary);
        for (Employee e : employees) {
            dept.add(e);
        }
        ceo.add(dept);
        return this;
    }

    public Manager build() {
        return ceo;
    }
}
