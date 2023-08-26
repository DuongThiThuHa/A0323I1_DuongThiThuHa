package QuanLiDienThoai.repository;

import QuanLiDienThoai.models.DienThoaiChinhHang;

import java.util.List;

public interface IChinhHangRepo {
    public void themChinhHang(DienThoaiChinhHang dienThoaiChinhHang);
    public List danhSach();
    public List findAll();
    public void xoa(int id);
    public void timKiemID(int id);
    public void tinKiemTen(String name);
}
