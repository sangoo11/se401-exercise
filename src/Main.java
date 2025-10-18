import composite.Employee;
import composite.Manager;
import composite.Staff;

class Main {
    public static void main(String[] args) {
        Manager ceo = new Manager("Ceo", 10000);

        Manager marketing = new Manager("VDr Marketing", 5000);
        Manager sanxuat = new Manager("VDr San Xuat", 6000);

        Staff qc = new Staff("NV Quang Cao", 2000);
        Staff kt = new Staff("NV Ke Toan", 2500);
        Staff vc = new Staff("NV Van Chuyen", 2300);

        marketing.add(qc);

        sanxuat.add(kt);
        sanxuat.add(vc);

        ceo.add(marketing);
        ceo.add(sanxuat);

        System.out.println("Total Salary: " + ceo.getSalary());

        System.out.println("###############################");

        ceo.getInfo();
    }
}