import java.util.Scanner;

public class demobai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Tạo phân số p1 bằng constructor mặc định, xuất ra màn hình
        PhanSo p1 = new PhanSo();
        System.out.print("Phân số p1 ban đầu: ");
        p1.xuatPhanSo();

        // Nhập giá trị cho p1 từ bàn phím và xuất lại kết quả
        p1.nhapPhanSo();
        System.out.print("Phân số p1 sau khi nhập: ");
        p1.xuatPhanSo();

        // 2. Tạo phân số p2 = 4/16 bằng constructor có tham số, xuất ra màn hình
        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("Phân số p2: ");
        p2.xuatPhanSo();

        // 3. Nhập giá trị cho p3 từ bàn phím
        System.out.println("Nhập phân số p3:");
        int tu, mau;
        System.out.print("Nhập tử số: ");
        tu = scanner.nextInt();
        System.out.print("Nhập mẫu số: ");
        mau = scanner.nextInt();
        PhanSo p3 = new PhanSo(tu, mau);
        System.out.print("Phân số p3: ");
        p3.xuatPhanSo();

        // 4. Cộng p1 với p3, xuất ra màn hình
        PhanSo pKetQua = p1.cong(p3);
        System.out.print("Kết quả p1 + p3: ");
        pKetQua.xuatPhanSo();

        // 5. Tạo phân số p4 từ kết quả trên (sao chép)
        PhanSo p4 = new PhanSo(pKetQua);
        System.out.print("Phân số p4 (sao chép từ pKetQua): ");
        p4.xuatPhanSo();

        // 6. Nhân p4 với p2, xuất ra màn hình
        PhanSo pNhan = p4.nhan(p2);
        System.out.print("Kết quả p4 * p2: ");
        pNhan.xuatPhanSo();

        scanner.close();
    }
}
