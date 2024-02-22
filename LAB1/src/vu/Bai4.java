/**
 * 
 */
package vu;

import java.util.Scanner;

/**
 * 
 */
public class Bai4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập hệ số a: ");
	    double a = scanner.nextDouble();

	    System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        //tính
        double delta = Math.pow(b, 2) - 4 * a * c;
        //kiểm tra
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } else {
        	double canDelta = Math.sqrt(delta);
        	System.out.printf("Căn của delta: %.2f\n", canDelta);
        }
        scanner.close();

	}

}
