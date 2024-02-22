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
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Nhập số điện
		System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
        int giaDuoi50 = 1000;
        int giaTren50 = 1200;
        int gioiHan50 = 50;
        int tien;
        //tính tiền
        if (soDien <= gioiHan50) {
            tien = soDien * giaDuoi50;
        } 
        else {
            tien = gioiHan50 * giaDuoi50 + (soDien - gioiHan50) * giaTren50;
        }
        System.out.printf("Tiền điện phải thanh toán: %d VND\n", tien);
        scanner.close();
	}

}
