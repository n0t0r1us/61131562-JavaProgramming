package vu;
import java.util.Scanner;

// Lớp cơ sở
class ChuNhat {
    protected double dai;
    protected double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuVi() {
        return 2 * (dai + rong);
    }

    public double getDienTich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("Chiều dài: " + dai);
        System.out.println("Chiều rộng: " + rong);
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

// Lớp dẫn xuất
class Vuong extends ChuNhat {
    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("Cạnh: " + dai); // Vì vuông nên chiều dài và rộng bằng nhau
        System.out.println("Diện tích: " + getDienTich());
        System.out.println("Chu vi: " + getChuVi());
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin hình chữ nhật
        System.out.println("Nhập chiều dài và chiều rộng của hình chữ nhật:");
        double daiCN = scanner.nextDouble();
        double rongCN = scanner.nextDouble();

        // Nhập thông tin hình vuông
        System.out.println("Nhập cạnh của hình vuông:");
        double canhVuong = scanner.nextDouble();

        // Tạo đối tượng hình chữ nhật và hình vuông
        ChuNhat cn = new ChuNhat(daiCN, rongCN);
        ChuNhat vu = new Vuong(canhVuong);

        // Xuất thông tin
        System.out.println("Thông tin hình chữ nhật:");
        cn.xuat();
        System.out.println("Thông tin hình vuông:");
        vu.xuat();
    }
}
