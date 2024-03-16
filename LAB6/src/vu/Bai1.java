package vu;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ và tên: ");
        String hoTen = scanner.nextLine();

        // Tìm vị trí của ký tự trắng đầu tiên và cuối cùng
        int dauTien = hoTen.indexOf(" ");
        int cuoiCung = hoTen.lastIndexOf(" ");

        // Lấy họ, tên đệm và tên từ chuỗi
        String ho = hoTen.substring(0, dauTien).toUpperCase();
        String tenDem = hoTen.substring(dauTien + 1, cuoiCung).toLowerCase();
        String ten = hoTen.substring(cuoiCung + 1).toUpperCase();

        // In ra màn hình
        System.out.println("Họ: " + ho);
        System.out.println("Tên đệm: " + tenDem);
        System.out.println("Tên: " + ten);
    }
}
