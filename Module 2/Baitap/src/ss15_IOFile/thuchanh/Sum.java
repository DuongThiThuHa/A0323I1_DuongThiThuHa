package ss15_IOFile.thuchanh;

import java.io.File;

public class Sum {
    public void readFileText(String filePath){
        File file = new File(filePath);
        if (!file.exists()){
            System.out.println("Loi khong tim thay file");
        }
    }
}
