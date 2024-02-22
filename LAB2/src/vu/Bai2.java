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
		//nhập a, b và c
		System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
		
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
		//Xét a
        if (a == 0) {
            //giải pt bậc nhất
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                double x = -c / b; 
                // Giải PT bậc 2
                System.out.printf("Nghiệm của phương trình: x = %.2f\n", x);
            }
        } else {
        	double delta = Math.pow(b, 2) - 4 * a * c;
        	if (delta < 0) {
                System.out.println("Phương trình vô nghiệm.");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Nghiệm kép của phương trình: x = %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Nghiệm phân biệt của phương trình: x1 = %.2f, x2 = %.2f\n", x1, x2);
        }
     }
        scanner.close();

	}

}
