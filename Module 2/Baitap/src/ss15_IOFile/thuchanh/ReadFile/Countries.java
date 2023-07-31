//package ss15_IOFile.thuchanh.ReadFile;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Countries {
//    private int id;
//    private int code;
//    private String name;
//
//    public Countries(int id, int code, String name) {
//        this.id = id;
//        this.code = code;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getCode() {
//        return code;
//    }
//
//    public void setCode(int code) {
//        this.code = code;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Countries have " + "id=" + id + ", code=" + code + ", name='" + name + '\'' + '}';
//    }
//
//    public List<String> readFile(String pathfile){
//        List<String> listLine = new ArrayList<>();
//        File file = new File(pathfile);
//        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(pathfile);
//            bufferedReader.readLine();
//            String line = null;
//            while ((line = bufferedReader.readLine()) != null){
//                listLine.add(line);
//            }
//            bufferedReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Loi khong tim thay file !");
//        } catch (IOException e) {
//            System.out.println("Loi khong doc duoc file !");
//        }
//        return listLine;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
//
