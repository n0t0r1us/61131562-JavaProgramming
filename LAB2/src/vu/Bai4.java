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
        
        while (true) {
            menu();
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("End");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chỉ chọn số từ 1 đến 4!");
                    break;
            }
        }
    }
    
    public static void menu() {
    	System.out.println("+---------------------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+---------------------------------------------------+");
    }
    
    public static void giaiPTB1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải PT ax + b = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } 
            else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } 
        else {
            double x = -b / a;
            System.out.printf("Nghiệm của phương trình: x = %.2f\n", x);
        }
    }
    
    public static void giaiPTB2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải PT ax^2 + bx + c = 0");
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        
        double delta = b * b - 4 * a * c;
        
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm.");
        } 
        else 
        	if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Nghiệm kép của phương trình: x = %.2f\n", x);
        }
        else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Nghiệm phân biệt của phương trình: x1 = %.2f, x2 = %.2f\n", x1, x2);
        }
    }
    
    public static void tinhTienDien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính tiền điện");
        System.out.print("Nhập số điện sử dụng trong tháng: ");
        int soDien = scanner.nextInt();
  
        int giaDuoi50 = 1000;
        int giaVuot50 = 1200;
        int gioiHan50 = 50;
        
        int tien;
        
        if (soDien <= gioiHan50) {
            tien = soDien * giaDuoi50;
        } 
        else {
            tien = gioiHan50 * giaDuoi50 + (soDien - gioiHan50) * giaVuot50;
        }
        
        System.out.printf("Tiền điện phải tra: %d VND\n", tien);

	}

}
