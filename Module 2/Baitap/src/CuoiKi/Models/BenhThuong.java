package CuoiKi.Models;

public class BenhThuong extends BenhAn{
    private int vienPhi;

    public BenhThuong() {
    }

    public BenhThuong(int soLuong, int ma, String ten, String ngayVao, String ngayRa, String lyDo) {
        super(soLuong, ma, ten, ngayVao, ngayRa, lyDo);
    }

    public BenhThuong(int vienPhi) {
        this.vienPhi = vienPhi;
    }

    public BenhThuong(int soLuong, int ma, String ten, String ngayVao, String ngayRa, String lyDo, int vienPhi) {
        super(soLuong, ma, ten, ngayVao, ngayRa, lyDo);
        this.vienPhi = vienPhi;
    }

    public BenhThuong(int soLuong, String s, String ten, String ngayVao, String ngayRa, int parseInt) {
    }

    public int getVienPhi() {
        return vienPhi;
    }

    public void setVienPhi(int vienPhi) {
        this.vienPhi = vienPhi;
    }

    @Override
    public String toString() {
        return super.toString()+vienPhi;
    }
}
