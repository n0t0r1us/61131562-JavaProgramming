package vu;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class SinhVien {
    String hoTen;
    String email;
    String soDienThoai;
    String cmnd;

    public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.cmnd = cmnd;
    }

    public void xuat() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("CMND: " + cmnd);
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPhone(String phone) {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static boolean isValidCMND(String cmnd) {
        String regex = "^\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cmnd);
        return matcher.matches();
    }
}

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        // Nhập thông tin cho 5 sinh viên
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Nhập thông tin cho sinh viên thứ " + (i + 1) + ":");
	            SinhVien sv = nhapThongTinSinhVien(scanner);
	            danhSachSinhVien.add(sv);
	        }

	        // Xuất thông tin các sinh viên
	        System.out.println("\nThông tin các sinh viên:");
	        for (SinhVien sv : danhSachSinhVien) {
	            sv.xuat();
	            System.out.println();
	        }
	    }

	    public static SinhVien nhapThongTinSinhVien(Scanner scanner) {
	        SinhVien sv = null;
	        boolean isValidEmail = false;
	        boolean isValidPhone = false;
	        boolean isValidCMND = false;

	        do {
	            System.out.print("Nhập họ tên: ");
	            String hoTen = scanner.nextLine();

	            System.out.print("Nhập email: ");
	            String email = scanner.nextLine();
	            isValidEmail = SinhVien.isValidEmail(email);
	            if (!isValidEmail) {
	                System.out.println("Email không hợp lệ. Vui lòng nhập lại.");
	                continue;
	            }

	            System.out.print("Nhập số điện thoại: ");
	            String soDienThoai = scanner.nextLine();
	            isValidPhone = SinhVien.isValidPhone(soDienThoai);
	            if (!isValidPhone) {
	                System.out.println("Số điện thoại không hợp lệ. Vui lòng nhập lại.");
	                continue;
	            }

	            System.out.print("Nhập số CMND: ");
	            String cmnd = scanner.nextLine();
	            isValidCMND = SinhVien.isValidCMND(cmnd);
	            if (!isValidCMND) {
	                System.out.println("Số CMND không hợp lệ. Vui lòng nhập lại.");
	                continue;
	            }

	            sv = new SinhVien(hoTen, email, soDienThoai, cmnd);

	        } while (!isValidEmail || !isValidPhone || !isValidCMND);

	        return sv;
	    }
	}
