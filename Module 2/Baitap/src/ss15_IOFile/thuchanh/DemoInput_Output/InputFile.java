package ss15_IOFile.thuchanh.DemoInput_Output;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputFile {
    public static String pathFile;

    public static List<String> readFile(String pathFile){
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            while ((line = bufferedReader.readLine()) != null){
                listLine.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }

}
