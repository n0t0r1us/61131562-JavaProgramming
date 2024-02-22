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
            System.out.print("Chon so: ");
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
                    System.out.println("Vui long chon so tu 1 - 4.");
                    break;
            }
        }
    }
    
    public static void menu() {
        System.out.println("Chon 1. Pt bac 1");
        System.out.println("Chon 2. Pt bac 2");
        System.out.println("Chon 3. Tinh Tien dien");
        System.out.println("Chon 4. End");
        System.out.println("\n");

    
    

	}

}
