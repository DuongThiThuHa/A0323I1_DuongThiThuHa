package ss5_AccessModifier_StaticMethod_StaticProperty.thuchanh;

public class StaticMethod {
    // phuong thuc tinh chenge()
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    StaticMethod(int r , String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CodeGym";
    }

    void display(){
        System.out.println(rollno + " " + name+ " " + college);
    }

    public static void main(String[] args) {
        StaticMethod.change();

        StaticMethod sm1 = new StaticMethod(1,"Thu");
        StaticMethod sm2 = new StaticMethod(2,"Ha");
        StaticMethod sm3 = new StaticMethod(3,"U");

        sm1.display();
        sm2.display();
        sm3.display();

    }
}
