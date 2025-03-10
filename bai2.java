import java.util.Scanner;

public class Bai2 {
    private int tu;
    private int mau;

    // Constructor không tham số
    public Bai2() {
        this.tu = 0;
        this.mau = 1;
    }

    // Constructor có tham số
    public Bai2(int tu, int mau) {
        if (mau == 0) {
            System.out.println("Mẫu số không thể bằng 0. Đặt mẫu số mặc định là 1.");
            this.mau = 1;
        } else {
            this.tu = tu;
            this.mau = mau;
        }
    }

    // Constructor sao chép
    public Bai2(Bai2 p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    // Getter & Setter
    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        if (mau != 0) {
            this.mau = mau;
        } else {
            System.out.println("Mẫu số không thể bằng 0.");
        }
    }

    // Nhập phân số
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        boolean hopLe = false;

        // Nhập tử số
        while (!hopLe) {
            try {
                System.out.print("Nhập tử số: ");
                this.tu = Integer.parseInt(sc.nextLine());
                hopLe = true;
            } catch (NumberFormatException e) {
                System.out.println("Giá trị nhập không hợp lệ. Vui lòng nhập một số nguyên.");
            }
        }

        // Nhập mẫu số
        hopLe = false;
        while (!hopLe) {
            try {
                System.out.print("Nhập mẫu số (khác 0): ");
                this.mau = Integer.parseInt(sc.nextLine());
                if (this.mau == 0) {
                    System.out.println("Mẫu số không thể bằng 0. Vui lòng nhập lại.");
                } else {
                    hopLe = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị nhập không hợp lệ. Vui lòng nhập một số nguyên.");
            }
        }
    }

    // Xuất phân số
    public void xuatPhanSo() {
        System.out.println(this.tu + "/" + this.mau);
    }

    // Tìm ước số chung lớn nhất 
    private int USCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    // Rút gọn phân số
    public void rutGon() {
        int uscln = USCLN(this.tu, this.mau);
        this.tu /= uscln;
        this.mau /= uscln;
    }

    // Cộng hai phân số
    public Bai2 cong(Bai2 p) {
        int tuMoi = this.tu * p.mau + p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        Bai2 kq = new Bai2(tuMoi, mauMoi);
        kq.rutGon();
        return kq;
    }

    // Trừ hai phân số
    public Bai2 tru(Bai2 p) {
int tuMoi = this.tu * p.mau - p.tu * this.mau;
        int mauMoi = this.mau * p.mau;
        Bai2 kq = new Bai2(tuMoi, mauMoi);
        kq.rutGon();
        return kq;
    }

    // Nhân hai phân số
    public Bai2 nhan(Bai2 p) {
        Bai2 kq = new Bai2(this.tu * p.tu, this.mau * p.mau);
        kq.rutGon();
        return kq;
    }

    // Chia hai phân số
    public Bai2 chia(Bai2 p) {
        Bai2 kq = new Bai2(this.tu * p.mau, this.mau * p.tu);
        kq.rutGon();
        return kq;
    }
}
