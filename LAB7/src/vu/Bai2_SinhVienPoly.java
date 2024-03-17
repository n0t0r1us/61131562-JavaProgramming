package vu;

public abstract class Bai2_SinhVienPoly {
	// Thuộc tính
    private String hoTen;
    private String nganh;
    // Constructor
    public Bai2_SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNganh() {
        return nganh;
    }
    // Phương thức trừu tượng
    abstract double getDiem();
    // Phương thức xếp loại học lực
    public String getHocLuc() {
        String hocLuc = null;
        double diem = getDiem();
        if (diem >= 9) {
            hocLuc = "Xuat Xac";
        } else if (diem >= 7.5) {
            hocLuc = "Gioi";
        } else if (diem >= 6.5) {
            hocLuc = "Kha";
        } else if (diem >= 5) {
            hocLuc = "Trung binh";
        } else {
            hocLuc = "Yeu";
        }
        return hocLuc;
    }
}


