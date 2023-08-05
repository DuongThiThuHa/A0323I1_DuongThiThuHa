package ss16_IOBinaryFile_Serialization.baitap.Product;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import static ss16_IOBinaryFile_Serialization.baitap.Product.Bitstream.displayProduct;
import static ss16_IOBinaryFile_Serialization.baitap.Product.Bitstream.productList;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Bitstream bitstream = new Bitstream();

    void addProduct() {
        int code;
        String nameProduct;
        String manufacturers; // hãng sản xuất
        double price;
        String otherDescriptions;

        System.out.println("Nhập vào mã sản phẩm : ");
        code = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tên sản phẩm : ");
        nameProduct = scanner.nextLine();
        System.out.println("Nhập vào hãng sản xuất : ");
        manufacturers = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm : ");
        price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập các mô tả khác : ");
        otherDescriptions = scanner.nextLine();

        Product myProduct = new Product(code, nameProduct, manufacturers, price, otherDescriptions);

        Bitstream.addProduct(myProduct);
    }

    void listProduct() throws ClassNotFoundException, IOException {
        List<Product> myProducts = Bitstream.readProductList();
        for (Product product : myProducts) {
            System.out.println(product.toString());
        }
    }

    void findByProduct() {
        System.out.println("Nhập vào mã id cần tìm : ");
        Product product = Bitstream.findProductById();
        if (product != null) {
            System.out.println(product.toString());
        } else {
            System.out.println("Không tìm thấy id !");
        }
    }

    void Menu() throws IOException, ClassNotFoundException {
        int choice = 0;
        while (true) {
            System.out.println("1.Thêm sản phẩm : ");
            System.out.println("2.Hiển thị danh sách sản phẩm : ");
            System.out.println("4.Tìm kiếm mã sản phẩm :  ");
            System.out.println("5.Thoát ! ");

            System.out.println("Mời chọn yêu cầu :");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                   displayProduct(productList);
                    break;
                case 3:
                    findByProduct();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Mời nhập lại : ");
                    break;
            }

        }

    }


    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Menu m = new Menu();
        m.Menu();
    }
}
