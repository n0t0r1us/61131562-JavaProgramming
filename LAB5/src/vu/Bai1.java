package vu;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("Nhập các số thực (nhập 'N' để kết thúc):");
        while (true) {
            Double x = scanner.nextDouble();
            list.add(x);
            System.out.print("Nhập thêm (Y/N)? ");
            scanner.nextLine(); // Đọc dòng trống sau khi nhập số
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        // Xuất danh sách vừa nhập
        System.out.println("Danh sách các số thực: ");
        for (Double number : list) {
            System.out.println(number);
        }
        // Tính tổng của danh sách
        double sum = 0;
        for (Double number : list) {
            sum += number;
        }
        System.out.println("Tổng của danh sách: " + sum);
	}
}
