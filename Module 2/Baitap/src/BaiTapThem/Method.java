package BaiTapThem;

public class Method {

    public static int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void myMethod() {
        System.out.println("Hello World !");
    }


    public static void main(String[] args) {
        System.out.println(sum(6, 9));

        myMethod();
    }
}
