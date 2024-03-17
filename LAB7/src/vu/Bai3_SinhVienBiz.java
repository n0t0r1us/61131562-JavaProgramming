package vu;

public class Bai3_SinhVienBiz extends Bai3_SinhVienPoly {
	protected double diemMarketting;
    protected double diemSales;

    public Bai3_SinhVienBiz(String hoTen, String nganh, double diemMarketting, double diemSales) {
        super(hoTen, nganh);
        this.diemMarketting = diemMarketting;
        this.diemSales = diemSales;
    }

    @Override
    double getDiem() {
        return (2 * diemMarketting + diemSales) / 3;
    }
}
