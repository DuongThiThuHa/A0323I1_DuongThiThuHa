package CuoiKi.Models;

public abstract class BenhAn {
    private int soLuong;
    private int ma;
    private String ten;
    private String ngayVao;
    private String ngayRa;
    private String lyDo;

    public BenhAn() {
    }

    public BenhAn(int soLuong, int ma, String ten, String ngayVao, String ngayRa, String lyDo) {
        this.soLuong = soLuong;
        this.ma = ma;
        this.ten = ten;
        this.ngayVao = ngayVao;
        this.ngayRa = ngayRa;
        this.lyDo = lyDo;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayVao() {
        return ngayVao;
    }

    public void setNgayVao(String ngayVao) {
        this.ngayVao = ngayVao;
    }

    public String getNgayRa() {
        return ngayRa;
    }

    public void setNgayRa(String ngayRa) {
        this.ngayRa = ngayRa;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    @Override
    public String toString() {
        return soLuong+","+ma+","+ten+","+ngayVao+","+ngayRa+','+lyDo;
    }
}
