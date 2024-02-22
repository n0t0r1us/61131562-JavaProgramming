/**
 * 
 */
package vu;

/**
 * 
 */
public class SanPham_bai3 {

	/**
	 * @param args
	 */
	private String tenSp;
    private double donGia;
    private double giamGia;

    public SanPham_bai3(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPham_bai3(String tenSp, double donGia) {
        this(tenSp, donGia, 0); 
    }


    private double getThueThuNhap() {
        return 0.1 * donGia;
    }

    public void xuat() {
        System.out.println("Ten Sp: " + tenSp);
        System.out.println("Don Gia: " + donGia);
        System.out.println("Giam gia: " + giamGia);
        System.out.println("Thue nhap khau: " + getThueThuNhap());
		// TODO Auto-generated method stub

	}

}
