package vu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> danhSach = new ArrayList<>();

        while (true) {
            int luaChon = menu(scanner);
            switch (luaChon) {
                case 1:
                    nhap(scanner, danhSach);
                    break;
                case 2:
                    xuat(danhSach);
                    break;
                case 3:
                    ngauNhien(danhSach);
                    break;
                case 4:
                    sapXepGiamDan(danhSach);
                    break;
                case 5:
                    xoa(scanner, danhSach);
                    break;
                case 6:
                    System.out.println("Ứng dụng kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Nhập danh sách họ và tên");
        System.out.println("2. Xuất danh sách");
        System.out.println("3. Xuất danh sách ngẫu nhiên");
        System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
        System.out.println("5. Tìm và xóa họ tên");
        System.out.println("6. Kết thúc");
        System.out.print("Chọn chức năng: ");
        return scanner.nextInt();
    }

    public static void nhap(Scanner scanner, ArrayList<String> danhSach) {
        scanner.nextLine();
        System.out.println("Nhập danh sách họ và tên (nhập 'done' để kết thúc):");
        while (true) {
            String hoTen = scanner.nextLine();
            if (hoTen.equalsIgnoreCase("done")) {
                break;
            }
            danhSach.add(hoTen);
        }
    }

    public static void xuat(ArrayList<String> danhSach) {
        System.out.println("Danh sách họ và tên:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

    public static void ngauNhien(ArrayList<String> danhSach) {
        Collections.shuffle(danhSach);
        System.out.println("Danh sách ngẫu nhiên:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

    public static void sapXepGiamDan(ArrayList<String> danhSach) {
        Collections.sort(danhSach);
        Collections.reverse(danhSach);
        System.out.println("Danh sách sau khi sắp xếp giảm dần:");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
    }

    public static void xoa(Scanner scanner, ArrayList<String> danhSach) {
        scanner.nextLine();
        System.out.print("Nhập họ tên cần xóa: ");
        String hoTenCanXoa = scanner.nextLine();
        boolean daXoa = false;
        for (int i = 0; i < danhSach.size(); i++) {
            if (danhSach.get(i).equalsIgnoreCase(hoTenCanXoa)) {
                danhSach.remove(i);
                System.out.println("Đã xóa '" + hoTenCanXoa + "' thành công.");
                daXoa = true;
                break;
            }
        }
        if (!daXoa) {
            System.out.println("Không tìm thấy '" + hoTenCanXoa + "' trong danh sách.");
        }
    }
}
