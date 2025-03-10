public class demobai5 {
    public static void main(String[] args) {
        // Tạo các đối tượng TamGiac
        TamGiac tg1 = new TamGiac(3, 4, 5);
        TamGiac tg2 = new TamGiac(2, 2, 2);
        TamGiac tg3 = new TamGiac(5, 5, 8);

        // Mảng chứa các tam giác
        TamGiac[] danhSachTamGiac = {tg1, tg2, tg3};

        // Duyệt qua từng tam giác và hiển thị thông tin
        for (int i = 0; i < danhSachTamGiac.length; i++) {
            TamGiac tg = danhSachTamGiac[i];
            System.out.println("Tam giác " + (i + 1) + ":");
            if (tg.isValid()) {
                System.out.println("Chu vi: " + tg.tinhChuVi());
                System.out.println("Diện tích: " + tg.tinhDienTich());
                System.out.println("Loại: " + tg.loaiTamGiac());
            } else {
                System.out.println("Không phải là tam giác hợp lệ.");
            }
            System.out.println();
        }
    }
    scanner.close();
}

