package ss11_JavaCollectionFramework.baitap.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Product {
    private final int code;
    private String productName;
    private double price;

    public Product(int code, String name, double price) {
        this.code = code;
        this.productName = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return productName;
    }

    public int getPrice() {
        return (int) price;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ma san pham: " + code + ", Ten san pham: " + productName + ", Gia san pham: " + price;
    }

}

class ProductManagement {
    private static final ArrayList<Product> productList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Them san pham: ");
            System.out.println("2. Sua thong tin theo ma san pham: ");
            System.out.println("3. Xoa san pham theo ma san pham: ");
            System.out.println("4. Hien thi danh sach san pham: ");
            System.out.println("5. Tim kiem san pham: ");
            System.out.println("6. Sap xep san pham tang dan theo gia: ");
            System.out.println("7. Sap xep san pham giam dan theo gia: ");
            System.out.println("0. Thoat");

            System.out.print("Moi ban nhap: ");
            int choice = Integer.parseInt(scanner.nextLine());
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    editProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    displayProducts();
                    break;
                case 5:
                    searchProductByName();
                    break;
                case 6:
                    sortProductByPriceAscending();
                    break;
                case 7:
                    sortProductByPriceDescending();
                    break;
                case 0:
                    System.out.println("Da thoat chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong phu hop! ");
            }
        }
    }

    private static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma san pham: ");
        int code = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap ten san pham: ");
        String productName = scanner.nextLine();

        System.out.print("Nhap gia san pham: ");
        double price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(code, productName, price);
        productList.add(product);

        System.out.println("San pham them thanh cong! ");
    }

    private static void editProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma san phma can sua: ");
        int code = Integer.parseInt(scanner.nextLine());

        boolean check = false;
        for (Product product : productList) {
            if (product.getCode() == code) {
                System.out.print("Nhap ten san pham moi: ");
                String newName = scanner.nextLine();
                product.setName(newName);

                System.out.print("Nhap gia san pham moi: ");
                int newPrice = scanner.nextInt();
                scanner.nextLine();
                product.setPrice(newPrice);

                System.out.println("Thong tin san pham da thay doi thanh cong! ");
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Khong tim thay ma san pham " + code);
        }
    }

    private static void removeProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma san pham can xoa: ");
        int code = Integer.parseInt(scanner.nextLine());

        boolean check = false;
        for (Product product : productList) {
            if (product.getCode() == code) {
                productList.remove(product);
                System.out.println("San pham da duoc xoa thanh cong! ");
                check = true;
                break;
            }
        }

        if (!check) {
            System.out.println("Khong tim thay ma san pham" + code);
        }
    }

    private static void displayProducts() {
        System.out.println("Danh sach san pham:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private static void searchProductByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san phma can tim: ");
        String name = scanner.nextLine();

        ArrayList<Product> searchResult = new ArrayList<>();

        for (Product product : productList) {
            if (product.getName().equals(name)) {
                searchResult.add(product);
            }
        }

        if (searchResult.size() > 0) {
            System.out.println("Ket qua tim kiem : ");
            for (Product product : searchResult) {
                System.out.println(product);
            }
        } else {
            System.out.println("Khong tim thay ten san pham " + name);
        }
    }

    private static void sortProductByPriceAscending() {
        Collections.sort(productList, Comparator.comparingInt(Product::getPrice));

        System.out.println("Danh sach san pham duoc sap xep tang dan theo gia: ");
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    private static void sortProductByPriceDescending() {
        Collections.sort(productList, Comparator.comparingInt(Product::getPrice).reversed());

        System.out.println("Danh sach san pham duoc sap xep giam dan theo gia:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
