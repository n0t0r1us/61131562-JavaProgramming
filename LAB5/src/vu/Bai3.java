package vu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    String ten;
    double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Tên: " + ten + ", Giá: " + gia;
    }
}

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        ArrayList<SanPham> danhSachSanPham = new ArrayList<>();

        while (true) {
            int luaChon = menu(scanner);
            switch (luaChon) {
                case 1:
                    nhapDanhSachSanPham(scanner, danhSachSanPham);
                    break;
                case 2:
                    sapXepGiamDanTheoGia(danhSachSanPham);
                    break;
                case 3:
                    xoaSanPhamTheoTen(scanner, danhSachSanPham);
                    break;
                case 4:
                    xuatGiaTrungBinh(danhSachSanPham);
                    break;
                case 5:
                    System.out.println("Ứng dụng kết thúc.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static int menu(Scanner scanner) {
        System.out.println("\n----- MENU -----");
        System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
        System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
        System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
        System.out.println("4. Xuất giá trung bình của các sản phẩm");
        System.out.println("5. Kết thúc");
        System.out.print("Chọn chức năng: ");
        return scanner.nextInt();
    }

    public static void nhapDanhSachSanPham(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
        scanner.nextLine(); // Clear input buffer
        System.out.println("Nhập danh sách sản phẩm (nhập 'done' để kết thúc):");
        while (true) {
            System.out.print("Nhập tên sản phẩm: ");
            String ten = scanner.nextLine();
            if (ten.equalsIgnoreCase("done")) {
                break;
            }
            System.out.print("Nhập giá sản phẩm: ");
            double gia = scanner.nextDouble();
            danhSachSanPham.add(new SanPham(ten, gia));
            scanner.nextLine(); // Clear input buffer
        }
    }

    public static void sapXepGiamDanTheoGia(ArrayList<SanPham> danhSachSanPham) {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.gia, o1.gia);
            }
        };
        Collections.sort(danhSachSanPham, comp);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        for (SanPham sanPham : danhSachSanPham) {
            System.out.println(sanPham);
        }
    }

    public static void xoaSanPhamTheoTen(Scanner scanner, ArrayList<SanPham> danhSachSanPham) {
        scanner.nextLine(); // Clear input buffer
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String tenCanXoa = scanner.nextLine();
        boolean daXoa = false;
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).ten.equalsIgnoreCase(tenCanXoa)) {
                danhSachSanPham.remove(i);
                System.out.println("Đã xóa sản phẩm '" + tenCanXoa + "' thành công.");
                daXoa = true;
                break;
            }
        }
        if (!daXoa) {
            System.out.println("Không tìm thấy sản phẩm '" + tenCanXoa + "' trong danh sách.");
        }
    }

    public static void xuatGiaTrungBinh(ArrayList<SanPham> danhSachSanPham) {
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Danh sách sản phẩm trống.");
            return;
        }
        double tongGia = 0;
        for (SanPham sanPham : danhSachSanPham) {
            tongGia += sanPham.gia;
        }
        double giaTrungBinh = tongGia / danhSachSanPham.size();
        System.out.println("Giá trung bình của các sản phẩm: " + giaTrungBinh);
    }
}
