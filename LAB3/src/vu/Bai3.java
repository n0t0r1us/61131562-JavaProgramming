/**
 * 
 */
package vu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public class Bai3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int min = array[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: " + min);
        int sum = 0;
        int count = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        double average = (double) sum / count;
        System.out.println("Trung bình cổng các phần tử chia hết cho 3: " + average);
        
        scanner.close();
		// TODO Auto-generated method stub

	}

}
