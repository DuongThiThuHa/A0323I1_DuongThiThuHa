package QuanLiDienThoai.repository;

import QuanLiDienThoai.models.DienThoaiXachTay;
import QuanLiDienThoai.untils.File.ReadFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class XachTayRepo implements IXachTayRepo{
    private final String FILE_PATH = "D:\\CodeGym\\TranNhatLong-A1222I1_Md2\\src\\QuanLiDienThoai\\data\\XachTay.csv";
    private List<DienThoaiXachTay> dienThoaiXachTays = new ArrayList<>();

    public XachTayRepo(){
        dienThoaiXachTays = this.danhSach();
    }

    private ReadFile readFile = new ReadFile();

    @Override
    public void themXachTay(DienThoaiXachTay dienThoaiXachTay) {
        int lastID = 0;
        if(dienThoaiXachTays.size() > 0){
            lastID = dienThoaiXachTays.get(dienThoaiXachTays.size()-1).getId();
        }
        dienThoaiXachTay.setId(lastID + 1);
        dienThoaiXachTays.add(dienThoaiXachTay);
        writeFile(Collections.singletonList(dienThoaiXachTay),FILE_PATH, true);
    }

    @Override
    public List danhSach() {
        List result = new ArrayList<>();
        List<String> stringList = readFile.ReadFile(FILE_PATH);
        for (String string : stringList) {
            String temp[] = string.trim().split(",");
            int id = Integer.parseInt(temp[0]);
            String tenDienThoai = temp[1];
            int giaBan = Integer.parseInt(temp[2]);
            int soLuong = Integer.parseInt(temp[3]);
            String nhaSanXuat = temp[4];
            String quocGia = temp[5];
            String trangThai = temp[6];
            DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGia, trangThai);
            result.add(dienThoaiXachTay);
        }
        return result;
    }

    @Override
    public List findAll() {
        return dienThoaiXachTays;
    }

    @Override
    public void xoa(int id) {
        dienThoaiXachTays = danhSach();
        int index = dienThoaiXachTays.indexOf(new DienThoaiXachTay(id));
        if(index != -1){
            dienThoaiXachTays.remove(index);
            writeFile(dienThoaiXachTays,FILE_PATH,false);
        }
    }

    @Override
    public void timKiemID(int id) {
        for(DienThoaiXachTay dienThoaiXachTay: dienThoaiXachTays){
            if(dienThoaiXachTay.getId() == id){
                System.out.println(dienThoaiXachTay);
            }
        }
    }

    @Override
    public void timKiemTen(String name) {
        for(DienThoaiXachTay dienThoaiXachTay: dienThoaiXachTays){
            if(dienThoaiXachTay.getTenDienThoai().equals(name)){
                System.out.println(dienThoaiXachTay);
            }
        }
    }

    public void writeFile(List<DienThoaiXachTay> dienThoaiXachTayList, String filePath, boolean append) {
        File file = new File(filePath);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fileWriter = new FileWriter(file, append);
            bufferedWriter = new BufferedWriter(fileWriter);
            String str = " ";
            for (DienThoaiXachTay dienThoaiXachTay : dienThoaiXachTayList) {
                str += dienThoaiXachTay.getId() + "," + dienThoaiXachTay.getTenDienThoai() + "," + dienThoaiXachTay.getGiaBan() + "," + dienThoaiXachTay.getSoLuong() + "," + dienThoaiXachTay.getNhaSanXuat() + "," + dienThoaiXachTay.getQuocGiaBaoHanh() + ","
                        + dienThoaiXachTay.getTrangThai() + "\n";
            }
            if (str != null && !str.isEmpty()) {
                bufferedWriter.write(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
