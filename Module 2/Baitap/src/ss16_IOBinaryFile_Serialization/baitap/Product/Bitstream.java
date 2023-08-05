package ss16_IOBinaryFile_Serialization.baitap.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bitstream {
    private static final String SRC_PRODUCT = "src/ss16_IOBinaryFile_Serialization/baitap/Prodduct/Product.csv";

    public static List<Product> productList = new ArrayList<>();

    static {
        Product product1 = new Product(1,"Oppo Reno 8","Oppo",8000000,"Điện Thoại");
        Product product2 = new Product(2,"Oppo Reno 7","Oppo",7000000,"Điện Thoại");
        Product product3 = new Product(3,"Oppo Reno 6","Oppo",6000000,"Điện Thoại");
        Product product4 = new Product(4,"Oppo Reno 5","Oppo",5000000,"Điện Thoại");
        Product product5 = new Product(5,"Oppo Reno 4","Oppo",4000000,"Điện Thoại");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
    }

    public Bitstream() {
    }

    public static List<Product> getMyProducts() {
        return productList;
    }

    public static void setMyProducts(List<Product> productList) {
        Bitstream.productList = productList;
    }

    public static void displayProduct(List<Product> productList){
        for (Product product : productList){
            System.out.println(productList + "\n");
        }
    }

    public static void writeObjectList() throws IOException {
        FileOutputStream fos = new FileOutputStream(SRC_PRODUCT);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(productList);
        oos.flush();
        oos.close();
    }

    public static List<Product> readProductList() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(SRC_PRODUCT);
        ObjectInputStream ois = new ObjectInputStream(fis);
        productList = (List<Product>) ois.readObject();
        ois.close();

        return productList;
    }

    static void addProduct(Product product) {
        productList.add(product);
    }

    static Product findProductById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã id cần tìm : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : productList) {
            if (product.getCode() == id) {
                return product;
            }
        }
        return null;
    }

}
