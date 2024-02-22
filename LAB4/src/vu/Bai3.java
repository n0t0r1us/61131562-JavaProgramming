/**
 * 
 */
package vu;

import java.util.Scanner;

/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin SP1:");
        SanPham sp1 = nhapSanPham(scanner);

        System.out.println("\nNhập thông tin SP2:");
        SanPham sp2 = nhapSanPham(scanner);

        System.out.println("\nThông tin SP1:");
        sp1.xuat();

        System.out.println("\nThông tin SP2:");
        sp2.xuat();
        
        scanner.close();
    }
    public static SanPham nhapSanPham(Scanner scanner) {
        System.out.print("Nhập tên SP: ");
        String tenSp = scanner.nextLine();
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();
        System.out.print("Nhập giảm giá: ");
        double giamGia = scanner.nextDouble();
        scanner.nextLine();
        return new SanPham(tenSp, donGia, giamGia);
		// TODO Auto-generated method stub

	}

}
