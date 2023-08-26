package QuanLiDienThoai.services;

import QuanLiDienThoai.models.DienThoaiChinhHang;
import QuanLiDienThoai.models.DienThoaiXachTay;
import QuanLiDienThoai.repository.ChinhHangRepo;
import QuanLiDienThoai.repository.IChinhHangRepo;
import QuanLiDienThoai.untils.Validate.Validate;

import java.util.List;
import java.util.Scanner;

public class ChinhHangServices implements IChinhHangServices{
    private Validate validate = new Validate();
    private DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang();
    private IChinhHangRepo iChinhHangRepo = new ChinhHangRepo();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void themChinhHang() {
        DienThoaiChinhHang dienThoaiChinhHang = this.getThongTin();
        iChinhHangRepo.themChinhHang(dienThoaiChinhHang);
    }

    @Override
    public void danhSach() {
        List<DienThoaiChinhHang>dienThoaiChinhHangList = iChinhHangRepo.findAll();
        for (DienThoaiChinhHang dienThoai: dienThoaiChinhHangList){
            System.out.println(dienThoai);
        }
    }

    @Override
    public void xoa(int id) {
        iChinhHangRepo.xoa(id);
        danhSach();
    }

    @Override
    public void timKiemID(int id) {
        iChinhHangRepo.timKiemID(id);
    }

    @Override
    public void timKiemTen(String name) {
        iChinhHangRepo.tinKiemTen(name);
    }
    public DienThoaiChinhHang getThongTin(){
        boolean check = true;
        System.out.println("Nhập vào thông tin điện thoại chính hãng: ");
        int id = 0;
        System.out.println("Tên điện thoại: ");
        String tenDienThoai = scanner.nextLine();
        int giaBan;
        do {
            System.out.println("Nhập vào giá bán: ");
            giaBan = Integer.parseInt(scanner.nextLine());
            check = validate.testChiPhi(String.valueOf(giaBan));
        }while (!check);
        int soLuong;
        do {
            System.out.println("Nhập vào số lượng: ");
            soLuong = Integer.parseInt(scanner.nextLine());
            check = validate.testChiPhi(String.valueOf(soLuong));
        }while (!check);
        System.out.println("Nhập vào nhà sản xuất : ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Thời gian bảo hành : ");
        int thoiGianBaoHanh = Integer.parseInt(scanner.nextLine());
        String phamVi;
        do {
            System.out.println("Phạm vi bảo hành: ");
            phamVi = scanner.nextLine();
            validate.testPhamVi(phamVi);
        }while (!check);
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(id,tenDienThoai,giaBan,soLuong,nhaSanXuat,thoiGianBaoHanh,phamVi);
        return  dienThoaiChinhHang;
    }
}
