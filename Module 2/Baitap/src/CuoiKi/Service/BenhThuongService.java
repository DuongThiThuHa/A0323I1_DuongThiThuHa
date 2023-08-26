package CuoiKi.Service;

import CuoiKi.Models.BenhThuong;
import CuoiKi.Repository.BenhThuongRepository;
import CuoiKi.Repository.IBenhThuongRepository;
import CuoiKi.Untils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhThuongService implements IBenhThuongService {
    public Scanner scanner = new Scanner(System.in);
    private static IBenhThuongRepository iBenhThuongRepository = new BenhThuongRepository();

    @Override
    public void themMoi() {
        BenhThuong benhThuong = inputInfo();
        iBenhThuongRepository.add(benhThuong);
        System.out.println("Thêm mới thành công ");
        System.out.println("--------------------");
    }

    public BenhThuong inputInfo() {
        BenhThuong benhThuong = new BenhThuong();
        System.out.println("Nhập số thứ tự : ");
        benhThuong.setSoLuong(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập mã: ");
        benhThuong.setMa(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập tên bệnh : ");
        benhThuong.setTen(scanner.nextLine());
        System.out.println("Nhập ngày vào viện : ");
        benhThuong.setNgayVao(scanner.nextLine());
        System.out.println("Nhập ngày ra viện : ");
        benhThuong.setNgayRa(scanner.nextLine());
        System.out.println("Nhập lý do nhập viện : ");
        benhThuong.setLyDo(scanner.nextLine());
        System.out.println("Nhập viện phí : ");
        benhThuong.setVienPhi(Integer.parseInt(scanner.nextLine()));
        return benhThuong;
    }

    @Override
    public void hienThi() {
        List<BenhThuong> benhThuongs = iBenhThuongRepository.getAll();
        for (BenhThuong benhThuong : benhThuongs) {
            System.out.println(benhThuong);
        }
    }

    @Override
    public void xoa() {
        System.out.println("Nhập mã để xóa : ");
        int ma = Integer.parseInt(scanner.nextLine());
        iBenhThuongRepository.remove(ma);
    }

}
