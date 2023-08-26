package QuanLiDienThoai.models;

public class DienThoaiChinhHang extends DienThoai{
    private int thoiGianBaoHanh;
    private String phamVi;
    public DienThoaiChinhHang(int id){
        super(id);
    }
    public DienThoaiChinhHang(){

    }

    public DienThoaiChinhHang(int id, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamVi) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamVi = phamVi;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamVi() {
        return phamVi;
    }

    public void setPhamVi(String phamVi) {
        this.phamVi = phamVi;
    }

    @Override
    public String toString() {
        return "DienThoaiChinhHang{" + super.toString()+
                "thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", phamVi='" + phamVi + '\'' +
                '}';
    }
}
