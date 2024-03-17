package Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachSinhVien {
    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập họ tên sinh viên: ");
            String hoTen = scanner.nextLine();
            if (hoTen == null || hoTen.equals("")) {
                break;
            }
            System.out.print("Nhập tên ngành (IT/Biz): ");
            String nganh = scanner.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Điểm Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Nhập điểm CSS: ");
                double diemCss = scanner.nextDouble();
                System.out.print("Nhập điểm HTML: ");
                double diemHtml = scanner.nextDouble();
                SinhVienPoly newSV = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHtml);
                list.add(newSV);
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Nhập điểm Marketting: ");
                double diemMarketting = scanner.nextDouble();
                System.out.print("Nhập điểm Sales: ");
                double diemSales = scanner.nextDouble();
                SinhVienPoly newSV = new SinhVienBiz(hoTen, nganh, diemMarketting, diemSales);
                list.add(newSV);
            }
        } while (true);
    }

    public void xuat() {
        for (SinhVienPoly sv : list) {
            System.out.printf("Họ tên: %s | Ngành: %s ĐiểmTB: %.2f Học lực: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
        }
    }

    public void xuatGioi() {
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
                System.out.printf("Họ tên: %s | Ngành: %s ĐiểmTB: %.2f Học lực: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
            }

        }
    }

    Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
        @Override
        public int compare(SinhVienPoly o1, SinhVienPoly o2) {
            return Double.compare(o1.getDiem(), o2.getDiem());
        }
    };

    public void sapXepTheoDiem() {
        Collections.sort(list, comp);
        System.out.println("Sắp xếp tăng dần theo điểm");
        xuat();
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Xuất thông tin danh sách sinh viên");
            System.out.println("3. Xuất danh sách sinh viên có học lực giỏi");
            System.out.println("4. Sắp xếp danh sách sinh viên theo điểm");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");

            chon = s.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 0:
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xuatGioi();
                        break;
                    case 4:
                        sapXepTheoDiem();
                        break;
                    default:
                        System.out.println("Nhập sai, mời bạn nhập lại!");
                }
            }

        } while (chon != 0);
    }
}
