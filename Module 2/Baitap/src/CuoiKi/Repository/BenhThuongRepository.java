package CuoiKi.Repository;

import CuoiKi.Models.BenhThuong;
import CuoiKi.Untils.ReadWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BenhThuongRepository implements IBenhThuongRepository {

    private static Scanner scanner = new Scanner(System.in);
    public static final String SRC_BENHTHUONG = "src/CuoiKi/Data/BenhThuong.csv";


    @Override
    public List<BenhThuong> getAll() {
        List<BenhThuong> benhThuongs = new ArrayList<>();
        List<String> strings = ReadWriteFile.readFile(SRC_BENHTHUONG);
        String[] tam ;
        for (String string : strings) {
            tam = string.split(",");

            benhThuongs.add(new BenhThuong(Integer.parseInt(tam[0]), Integer.parseInt(tam[1]), tam[2], tam[3], tam[4], tam[5], Integer.parseInt(tam[6])));
        }
        return benhThuongs;
    }

    @Override
    public void add(BenhThuong benhThuong) {
        ReadWriteFile.writeFile(SRC_BENHTHUONG, convertToString(benhThuong), true);
    }

    @Override
    public void remove(int code) {
        List<BenhThuong> benhThuongs = getAll();
        for (BenhThuong benhThuong : benhThuongs) {
            if (benhThuong.getMa() == code) {
                System.out.println("Bạn có muốn xóa bệnh nhân có mã " + code + "này không ?");
                System.out.println("1.Đồng ý");
                System.out.println("2.Hủy bỏ");

                System.out.println("Mời nhập lựa chọn : ");
                int choose = Integer.parseInt(scanner.nextLine());

                if (choose == 1) {
                    benhThuongs.remove(benhThuong);
                    String string = "";
                    for (BenhThuong tam : benhThuongs) {
                        string += convertToString(tam)+"\n";
                    }
                    string = string.substring(0, string.length()-3);
                    ReadWriteFile.writeFile(SRC_BENHTHUONG, string, false);
                    System.out.println("Xóa thành công !");
                }
                break;
            }
        }
    }

    private String convertToString(BenhThuong benhThuong) {
        return benhThuong.getMa()+","+benhThuong.getSoLuong()+","+benhThuong.getTen()+","+benhThuong.getNgayVao()+","+benhThuong.getNgayRa()+","+benhThuong.getLyDo()+","+benhThuong.getVienPhi();
    }

}
