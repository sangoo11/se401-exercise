import composite.*;
import decorator.*;
import builder.*;

public class Main {
    public static void main(String[] args) {
        // 1. Dùng BUILDER để tạo cấu trúc công ty
        CompanyBuilder builder = new CompanyBuilder("CEO", 10000);

        Manager ceo = builder
            .addDepartment("VDr Marketing", 5000,
                new Staff("NV Quảng Cáo", 2000),
                new Staff("NV PR", 2200)
            )
            .addDepartment("VDr Sản Xuất", 6000,
                new Staff("NV Kế Toán", 2500),
                new Staff("NV Vận Chuyển", 2300)
            )
            .build();

        // 2. COMPOSITE: hiển thị cấu trúc công ty
        System.out.println("=== Cấu trúc công ty ===");
        ceo.showInfo();

        // 3. Tính tổng lương công ty (chưa thưởng)
        System.out.println("\nTổng lương công ty (chưa thưởng): " + ceo.getSalary());

        // 4. DECORATOR: áp dụng thưởng
        System.out.println("\n=== Áp dụng thưởng cho CEO ===");
        Employee ceoWithBonus = new BonusDecorator(ceo, 2000);
        ceoWithBonus.showInfo();
        System.out.println("Tổng lương công ty (có thưởng): " + ceoWithBonus.getSalary());
    }
}
