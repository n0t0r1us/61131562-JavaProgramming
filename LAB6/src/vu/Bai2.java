package vu;

import java.util.ArrayList;
import java.util.Scanner;

class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public void xuat() {
        System.out.println("Tên sản phẩm: " + tenSp);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Hãng: " + hang);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        this.tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = scanner.nextDouble();
        scanner.nextLine(); // Clear input buffer
        System.out.print("Nhập hãng: ");
        this.hang = scanner.nextLine();
    }
}

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SanPham> danhSachSanPham = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho 5 sản phẩm
        for (int i = 0; i < 5; i++) {
            System.out.println("Nhập thông tin cho sản phẩm thứ " + (i + 1) + ":");
            SanPham sp = new SanPham("", 0, "");
            sp.nhap();
            danhSachSanPham.add(sp);
        }

        // Xuất thông tin các sản phẩm của hãng Nokia
        System.out.println("\nThông tin các sản phẩm của hãng Nokia:");
        for (SanPham sp : danhSachSanPham) {
            if (sp.hang.equalsIgnoreCase("Nokia")) {
                sp.xuat();
                System.out.println(); // In một dòng trống để phân tách giữa các sản phẩm
            }
        }
    }
}
