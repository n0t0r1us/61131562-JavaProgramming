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
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = scanner.nextInt();
        
        boolean ok = true;
        
        if (n <= 1) {
            ok = false; // Số 1 và số âm không phải là số nguyên tố
        } 
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    ok = false;
                    break;
                }
            }
        }
        
        if (ok) {
            System.out.println(n + " là số nguyên tố");
        } 
        else {
            System.out.println(n + " không phải số nguyên tố");
        }
        scanner.close();
	}

}
