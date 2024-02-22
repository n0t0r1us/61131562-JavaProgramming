/**
 * 
 */
package vu;

import java.util.Scanner;

/**
 * 
 */
public class Bai2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        SanPham sp1 = new SanPham();
        System.out.println("Nhập thông tin SP1:");
        sp1.nhap(scanner);

        SanPham sp2 = new SanPham();
        System.out.println("\nNhập thông tin SP2:");
        sp2.nhap(scanner);

        System.out.println("\nThông tin SP1:");
        sp1.xuat();

        System.out.println("\nThông tin SP2:");
        sp2.xuat();
        
        scanner.close();
    }

    static class SanPham {
        private String tenSp;
        private double donGia;
        private double giamGia;

        public void nhap(Scanner scanner) {
            System.out.print("Nhập tên SP: ");
            tenSp = scanner.nextLine();
            System.out.print("Nhập đơn giá: ");
            donGia = scanner.nextDouble();
            System.out.print("Nhập giảm giá: ");
            giamGia = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự thừa sau khi nhập giá trị số
        }

        public void xuat() {
            System.out.println("Tên SP: " + tenSp);
            System.out.println("Đơn giá: " + donGia);
            System.out.println("Giảm : " + giamGia);
        }

	}

}
