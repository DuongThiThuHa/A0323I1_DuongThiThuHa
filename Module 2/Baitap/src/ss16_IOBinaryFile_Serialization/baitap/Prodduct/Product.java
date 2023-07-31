package ss16_IOBinaryFile_Serialization.baitap.Prodduct;

public class Product {
    private int code;
    private String name;
    private String manufacturers; // hãng sản xuất
    private double price;
    private String otherDescriptions;

    public Product() {
    }

    public Product(int code, String name, String manufacturers, double price, String otherDescriptions) {
        this.code = code;
        this.name = name;
        this.manufacturers = manufacturers;
        this.price = price;
        this.otherDescriptions = otherDescriptions;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(String manufacturers) {
        this.manufacturers = manufacturers;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOtherDescriptions() {
        return otherDescriptions;
    }

    public void setOtherDescriptions(String otherDescriptions) {
        this.otherDescriptions = otherDescriptions;
    }

    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", manufacturers='" + manufacturers + '\'' +
                ", price=" + price +
                ", otherDescriptions='" + otherDescriptions + '\'' +
                '}';
    }
}
