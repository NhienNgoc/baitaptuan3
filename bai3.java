public class bai3 {
    private float x;
    private float y;

    // 1. Khởi tạo không tham số (tọa độ mặc định là 0, 0)
    public bai3() {
        this.x = 0;
        this.y = 0;
    }

    // 2. Khởi tạo có tham số (gán giá trị x, y)
    public bai3(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // 3. Phương thức tính tổng hai điểm
    public bai3 add(bai3 other) {
        float newX = this.x + other.x;
        float newY = this.y + other.y;
        return new bai3(newX, newY);
    }

    // 4. Phương thức tạo điểm đối xứng qua trục hoành
    public bai3 symmetricAcrossXAxis() {
        return new bai3(this.x, -this.y);
    }

    // 5. Phương thức in tọa độ
    public void print() {
        System.out.println("Tọa độ: (" + x + ", " + y + ")");
    }

    // Hàm main để kiểm tra chương trình
    public static void main(String[] args) {
        bai3 p1 = new bai3(3, 4);
        bai3 p2 = new bai3(1, 2);

        // In tọa độ của p1 và p2
        p1.print();
        p2.print();

        // Tính tổng hai điểm
        bai3 sum = p1.add(p2);
        System.out.print("Tổng của p1 và p2: ");
        sum.print();

        // Tính điểm đối xứng của p1 qua trục hoành
        bai3bai3 symmetricP1 = p1.symmetricAcrossXAxis();
        System.out.print("Điểm đối xứng của p1 qua trục hoành: ");
        symmetricP1.print();
    }
    
}

