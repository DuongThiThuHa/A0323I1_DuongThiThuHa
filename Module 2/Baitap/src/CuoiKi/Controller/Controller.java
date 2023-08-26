package CuoiKi.Controller;

import CuoiKi.Models.BenhThuong;
import CuoiKi.Models.BenhVip;
import CuoiKi.Service.BenhThuongService;
import CuoiKi.Service.BenhVipService;
import CuoiKi.Service.IBenhThuongService;
import CuoiKi.Service.IBenhVipService;

import java.util.Scanner;

public class Controller {
    private static Scanner scanner = new Scanner(System.in);
    private static IBenhThuongService iBenhThuongService = new BenhThuongService();
    private static IBenhVipService iBenhVipService = new BenhVipService();

    public void displayMenu() {
        while (true) {
            try {
                System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN ---");
                System.out.println("Chọn đối tương");
                System.out.println("1.Bệnh thường");
                System.out.println("1.Bệnh vip");

                System.out.println("Nhập lựa chọn : ");
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        BenhNhanThuong();
                        break;
                    case 2:
                        BenhNhanVip();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng ");
                System.out.println("Chỉ được chọn 1 trong 2");
            }
        }
    }

    public void BenhNhanThuong() {
        while (true) {
            try {
                System.out.println("Chọn chức năng");
                System.out.println("1.Thêm mới");
                System.out.println("2.Hiển thị");
                System.out.println("3.Xóa");
                System.out.println("4.Thoát");

                System.out.println("Nhập lựa chọn : ");
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        iBenhThuongService.themMoi();
                        break;
                    case 2:
                        iBenhThuongService.hienThi();
                        break;
                    case 3:
                        iBenhThuongService.xoa();
                        break;
                    case 4:
                        System.out.println("Trở về menu");
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng ");
                System.out.println("Chỉ được chọn từ 1 đến 4");
            }
        }
    }

    public void BenhNhanVip() {
        while (true) {
            try {
                System.out.println("Chọn chức năng");
                System.out.println("1.Thêm mới");
                System.out.println("2.Hiển thị");
                System.out.println("3.Xóa");
                System.out.println("4.Thoát");

                System.out.println("Nhập lựa chọn : ");
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        iBenhVipService.themMoi();
                        break;
                    case 2:
                        iBenhVipService.hienThi();
                        break;
                    case 3:
                        iBenhVipService.xoa();
                        break;
                    case 4:
                        System.out.println("Trở về menu");
                        return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhập không đúng định dạng ");
                System.out.println("Chỉ được chọn từ 1 đến 4");
            }
        }
    }
}
