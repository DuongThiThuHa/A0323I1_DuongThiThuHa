package QuanLiDienThoai.models;

public class DienThoaiXachTay extends DienThoai{
    private String quocGiaBaoHanh;
    private String trangThai;
    public DienThoaiXachTay(int id){
        super(id);
    }
    public DienThoaiXachTay(){

    }

    public DienThoaiXachTay(int id, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat, String quocGiaBaoHanh, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaBaoHanh = quocGiaBaoHanh;
        this.trangThai = trangThai;
    }

    public String getQuocGiaBaoHanh() {
        return quocGiaBaoHanh;
    }

    public void setQuocGiaBaoHanh(String quocGiaBaoHanh) {
        this.quocGiaBaoHanh = quocGiaBaoHanh;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "DienThoaiXachTay{" + super.toString()+
                "quocGiaBaoHanh='" + quocGiaBaoHanh + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
