package Bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhập vào 1 chuỗi: ");
    	String s = sc.nextLine();
    	XPoly xp = new XPoly();
        System.out.println("Tổng: " + xp.sum(2.4, 5.0, 8.9));
        System.out.println("Min: " + xp.min(6.4, 5.0, 8.9));
        System.out.println("Max: " + xp.max(6.4, 5.0, 8.9));
        System.out.println("Tên: " + xp.toUpperFirstChar(s));
    }
}
