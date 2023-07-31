package ss15_IOFile.baitap.Countries;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null;
        try {
            String line ;
            bufferedReader = new BufferedReader(new FileReader("src/ss15_IOFile/baitap/countries/countries.csv"));

            while ((line = bufferedReader.readLine()) != null) {
                country(stringList(line));
            }

        } catch (IOException e) {
            System.out.println("Lỗi không tìm thấy file");
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                System.out.println("lỗi đóng file");
            }
        }
    }

    public static List<String> stringList(String line) {
        List<String> result = new ArrayList<>();
        if (line != null) {
            String[] splitData = line.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void country(List<String> country) {
        System.out.println("Quốc gia có id = " + country.get(0)  + " , mã = " + country.get(1)  + " , tên = " + country.get(2));
    }

}
