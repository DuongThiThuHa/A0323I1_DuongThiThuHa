package QuanLiDienThoai.services;

import QuanLiDienThoai.models.DienThoaiXachTay;
import QuanLiDienThoai.repository.IXachTayRepo;
import QuanLiDienThoai.repository.XachTayRepo;
import QuanLiDienThoai.untils.Validate.Validate;

import java.util.List;
import java.util.Scanner;

public class XachTayServices implements IXachTayServices{
    private Validate validate = new Validate();
    private DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay();
    private IXachTayRepo iXachTayRepo = new XachTayRepo();
    private Scanner scanner = new Scanner(System.in);
    @Override
    public void themXachTay() {
        DienThoaiXachTay dienThoaiXachTay = this.getThongTin();
        iXachTayRepo.themXachTay(dienThoaiXachTay);
    }
    public void danhSach(){
        List<DienThoaiXachTay> dienThoaiXachTayList = iXachTayRepo.findAll();
        for(DienThoaiXachTay dienThoai : dienThoaiXachTayList){
            System.out.println(dienThoai);
        }
    }

    @Override
    public void xoa(int id) {
        iXachTayRepo.xoa(id);
        danhSach();
    }

    @Override
    public void timKiemID(int id) {
        iXachTayRepo.timKiemID(id);
    }

    @Override
    public void timKiemTen(String name) {
        iXachTayRepo.timKiemTen(name);
    }

    public DienThoaiXachTay getThongTin(){
        boolean check = true;
        System.out.println("Nhập vào thông tin điện thoại xách tay: ");
//        System.out.println("Nhập vào id: ");
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
        do{
            System.out.println("Nhập vào số lượng: ");
            soLuong = Integer.parseInt(scanner.nextLine());
            check = validate.testChiPhi(String.valueOf(soLuong));
        }while (!check);
        System.out.println("Nhập vào nhà sản xuất: ");
        String nhaSanXuat = scanner.nextLine();
        System.out.println("Quốc gia: ");
        String quocGia = scanner.nextLine();
        System.out.println("Trạng thái: ");
        String trangThai = scanner.nextLine();
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id,tenDienThoai,giaBan,soLuong,nhaSanXuat,quocGia,trangThai);
        return dienThoaiXachTay;
    }
}
