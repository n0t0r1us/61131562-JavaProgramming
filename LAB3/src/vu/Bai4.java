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
        System.out.print("Nhập số lượng SV: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String[] names = new String[n];
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin SV  " + (i + 1) + ":");
            System.out.print("Họ & Tên: ");
            names[i] = scanner.nextLine();
            System.out.print("Điểm: ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        System.out.println("\nThông tin SV & học lực:");
        for (int i = 0; i < n; i++) {
            System.out.println("SV " + (i + 1) + ":");
            System.out.println("Họ & Tên: " + names[i]);
            System.out.println("Điểm: " + scores[i]);
            System.out.println("Học lực: " + getGrade(scores[i]));
            System.out.println();
        }
        sortStudents(names, scores);
        System.out.println("\nDSSV sau khi sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.println("Họ & Tên: " + names[i] + ", Điểm " + scores[i]);
        }
        
        scanner.close();
    }
    public static String getGrade(double score) {
        if (score < 5) {
            return "Yếu";
        } else if (score < 6.5) {
            return "Trung bình";
        } else if (score < 7.5) {
            return "Khá";
        } else if (score < 9) {
            return "Giỏi";
        } else {
            return "Xuất sắc";
        }
    }
    public static void sortStudents(String[] names, double[] scores) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (scores[i] > scores[j]) {
                    double tempScore = scores[i];
                    scores[i] = scores[j];
                    scores[j] = tempScore;
                    
                    String tempName = names[i];
                    names[i] = names[j];
                    names[j] = tempName;
                }
            }
        }

	}

}
