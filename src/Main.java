import builder.CompanyBuilder;
import composite.Manager;
import composite.Staff;

class Main {
    public static void main(String[] args) {
        Manager company = new CompanyBuilder("Ceo", 10000)
            .addDepartment("VDr Marketing", 5000, 
                new Staff("NV Quang Cao", 2000))
            .addDepartment("VDr San Xuat", 6000,
                new Staff("NV Ke Toan", 2500),
                new Staff("NV Van Chuyen", 2300))
            .build();

        System.out.println("Total Salary: " + company.getSalary());

        System.out.println("###############################");

        company.getInfo();
    }
}