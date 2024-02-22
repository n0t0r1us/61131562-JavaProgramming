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
		Scanner scanner = new Scanner(System.in);
		//Nhập từ bàn phím 2 cạnh của hcn
		System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double rong = scanner.nextDouble();
        //Tính chu vi
        double chuVi = (dai + rong) * 2;
        //Tính diện tích
        double dienTich = dai * rong;
        //Tính cạnh nhỏ nhất
        double canhNhoNhat = Math.min(dai, rong);
        //In kết quả
        System.out.printf("Chu vi: %.2f\n", chuVi);
        System.out.printf("Diện tích: %.2f\n", dienTich);
        System.out.printf("Cạnh nhỏ nhất: %.2f\n", canhNhoNhat);
        scanner.close();
		// TODO Auto-generated method stub

	}

}
