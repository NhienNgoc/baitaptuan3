public class bai5 {
    private double a;
    private double b;
    private double c;

    // Phương thức khởi tạo
    public bai5(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Phương thức kiểm tra tính hợp lệ của tam giác
    public boolean isValid () {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        if (isValid()) {
            return a + b + c;
        } else {
            System.out.println("Đây không phải là một tam giác hợp lệ.");
            return 0;
        }
    }

    // Phương thức tính diện tích sử dụng công thức Heron
    public double tinhDienTich() {
        if (isValid()) {
            double p = tinhChuVi() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            System.out.println("Đây không phải là một tam giác hợp lệ.");
            return 0;
        }
    }

    // Phương thức xác định loại tam giác
    public String loaiTamGiac() {
        if (!isValid()) {
            return "Không phải là tam giác";
        }
        if (a == b && b == c) {
            return "Tam giác đều";
        } else if (a == b || b == c || a == c) {
            return kiemTraTamGiacVuong() ? "Tam giác vuông cân" : "Tam giác cân";
        } else if (kiemTraTamGiacVuong()) {
            return "Tam giác vuông";
        } else {
            return "Tam giác thường";
        }
    }

    // Phương thức kiểm tra tam giác vuông
    private boolean kiemTraTamGiacVuong() {
        double a2 = a * a, b2 = b * b, c2 = c * c;
        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }
}
