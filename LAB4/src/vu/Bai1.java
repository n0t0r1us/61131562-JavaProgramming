/**
 * 
 */
package vu;

import java.util.Scanner;

/**
 * 
 */
public class Bai1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        SanPham sp = new SanPham("Tên", 0.0, 0.0);
	        sp.nhap();
	        sp.xuat();
	    }
	}
	class SanPham {
		    private String tenSp;
		    private double donGia;
		    private double giamGia;
		    public SanPham(String tenSp, double donGia, double giamGia) {
		        this.tenSp = tenSp;
		        this.donGia = donGia;
		        this.giamGia = giamGia;
		    }
		    public double getThueNhapKhau() {
		        return 0.1 * donGia;
		    }
		    public void xuat() {
		        System.out.println("Thông tin SP:");
		        System.out.println("Tên SP: " + tenSp);
		        System.out.println("Đơn giá: " + donGia);
		        System.out.println("Giảm giá: " + giamGia);
		        System.out.println("Thuế nhập khẩu: " + getThueNhapKhau());
		    }
		    public void nhap() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Nhập tên SP: ");
		        tenSp = scanner.nextLine();
		        System.out.print("Nhập đơn giá: ");
		        donGia = scanner.nextDouble();
		        System.out.print("Nhập giảm giá: ");
		        giamGia = scanner.nextDouble();
		        scanner.close();
		    }
		    public String getTenSp() {
		        return tenSp;
		    }

		    public void setTenSp(String tenSp) {
		        this.tenSp = tenSp;
		    }

		    public double getDonGia() {
		        return donGia;
		    }

		    public void setDonGia(double donGia) {
		        this.donGia = donGia;
		    }

		    public double getGiamGia() {
		        return giamGia;
		    }

		    public void setGiamGia(double giamGia) {
		        this.giamGia = giamGia;

	}

}
