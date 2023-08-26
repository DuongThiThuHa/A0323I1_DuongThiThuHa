package QuanLiDienThoai.models;

public abstract class DienThoai {
    private int id;
    private String tenDienThoai;
    private int giaBan;
    private int soLuong;
    private String nhaSanXuat;
    public DienThoai(int id){
        this.id = id;
    }
    public DienThoai(){

    }

    public DienThoai(int id, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "id=" + id +
                ", tenDienThoai='" + tenDienThoai + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj==null|| getClass()!=obj.getClass()) return false;
        DienThoai dienThoai = (DienThoai) obj;
        return id==dienThoai.id;
    }
}
