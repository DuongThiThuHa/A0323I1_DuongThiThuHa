package ss16.mvc.repository.impl;

import ss16.mvc.common.ReadWriteFile;
import ss16.mvc.model.Teacher;
import ss16.mvc.repository.ITeacherRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepository implements ITeacherRepository {
    private static Scanner scanner = new Scanner(System.in);
    public static final String SRC_TEACHER = "src/ss16/mvc/data/teacher.csv ";
    @Override
    public void remove(int code) {
        List<Teacher> teacherList = getAll();
        for (Teacher teacher : teacherList){
            if (teacher.getCode() == code){
                System.out.println("Bạn có muốn xóa giáo viên có mã là : "+ code);
                System.out.println("1.Đồng ý ");
                System.out.println("2.Hủy bỏ ");
                System.out.println("----------");
                System.out.println("Mời bạn nhập mã cần xóa : ");
                int choose = Integer.parseInt(scanner.nextLine());
                if (choose == 1){
                    teacherList.remove(teacher);
                    String strings = "";
                    for (Teacher temp : teacherList){
                        strings = strings + convertToString(temp);
                    }
                    strings = strings.substring(0,strings.length() -3 );
                    ReadWriteFile.writeFile(SRC_TEACHER,strings,false);
                    System.out.println("Đã xóa thành công ! ");
                }
                break;
            }
        }
    }

    @Override
    public void add(Teacher teacher) {
        ReadWriteFile.writeFile(SRC_TEACHER,convertToString(teacher),true);
    }

    @Override
    public List<Teacher> getAll() {
        List<Teacher> teacherList = new ArrayList<>();
        List<String> stringList = ReadWriteFile.readFile(SRC_TEACHER);
        String[] temp;
        for (String string : stringList){
            for (String s : temp = string.split(" , ")) {
                teacherList.add(new Teacher(Integer.parseInt(temp[0]), temp[1],temp[2],Double.parseDouble(temp[3]),temp[4]));
            }
        }
        return teacherList;
    }

    private String convertToString(Teacher teacher){
        return teacher.getCode()+" , "+teacher.getName()+ ", "+teacher.getDateOfBirth()+ " , "+teacher.getPosition()+ " , "+teacher.getSalary();
    }
}
