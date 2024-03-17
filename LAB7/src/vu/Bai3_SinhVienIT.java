package vu;

public class Bai3_SinhVienIT extends Bai3_SinhVienPoly{
	protected double diemJava;
    protected double diemCss;
    protected double diemHtml;

    public Bai3_SinhVienIT(String hoTen, String nganh, double diemJava, double diemCss, double diemHtml) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    @Override
    double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
}
