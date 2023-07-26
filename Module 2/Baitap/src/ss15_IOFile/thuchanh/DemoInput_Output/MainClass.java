package ss15_IOFile.thuchanh.DemoInput_Output;

import java.util.List;

public class MainClass {
    public static final String File_Student = "src/ss15_IOFile/thuchanh/Students.csv";
    //Cac phan tu trong file dc ngan cach boi dau ","
    public static final String COMMA = ",";

    public static void main(String[] args) {

        //Output File
//        Students students1 = new Students(1,"DT",21,"24/12/2001","QN"+"\n");
//        Students students2 = new Students(2,"TH",22,"12/12/2002","DN"+"\n");
//        Students students3 = new Students(3,"NT",20,"18/12/2003","DN"+"\n");
//        Students students4 = new Students(4,"DH",23,"10/12/2004","QN");
//
//        List<Students> studentsList = new ArrayList<>();
//        studentsList.add(students1);
//        studentsList.add(students2);
//        studentsList.add(students3);
//        studentsList.add(students4);
//
//        String line = null;
//        for (Students students: studentsList) {
//            line = students.getCode() + COMMA + students.getName() + COMMA + students.getAge() + COMMA + students.getDateOfBirth() + COMMA + students.getAddress();
//            OutputFile.writeFile(File_Student, line);
//        }

        //Input File
        List<String> listLine = InputFile.readFile(File_Student);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA);
        Students students1 = new Students(Integer.parseInt(lineSplit[0]), lineSplit[1], Integer.parseInt(lineSplit[2]), lineSplit[3], lineSplit[4]);
        System.out.println(students1.getCode() + " , " + students1.getName() + " , " + students1.getAge() + " , " + students1.getDateOfBirth() + " , " + students1.getAddress());
    }
}
