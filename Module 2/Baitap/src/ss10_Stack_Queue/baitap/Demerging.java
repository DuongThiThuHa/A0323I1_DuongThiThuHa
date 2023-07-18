package ss10_Stack_Queue.baitap;

import java.util.LinkedList;

public class Demerging {
    private int code;
    private String name;
    private String dateOfBirth;
    private String gender;

    public Demerging(int code, String name, String dateOfBirth, String gender) {
        this.code = code;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        LinkedList<Demerging> Nu = new LinkedList<>();
        LinkedList<Demerging> Nam = new LinkedList<>();

        Demerging demerging1 = new Demerging(1, "TH", "24/12", "Nu");
        Demerging demerging2 = new Demerging(2, "DH", "18/10", "Nu");
        Demerging demerging3 = new Demerging(3, "MH", "12/10", "Nam");
        Demerging demerging4 = new Demerging(4, "AQ", "13/05", "Nam");

        Nu.add(demerging1);
        Nu.add(demerging2);
        Nam.add(demerging3);
        Nam.add(demerging4);

        System.out.println("Số bản ghi trong hàng đợi Nữ: " + Nu.size());
        System.out.println("Số bản ghi trong hàng đợi Nam: " + Nam.size());

        System.out.println("Hàng đợi Nữ: ");
        while (!Nu.isEmpty()) {
            Demerging demerging = Nu.poll();
            System.out.println(demerging.getCode());
            System.out.println(demerging.getName());
            System.out.println(demerging.getDateOfBirth());
            System.out.println(demerging.getGender());
            System.out.println("------------");
        }

        System.out.println("Hàng đợi Nam:");
        while (!Nam.isEmpty()) {
            Demerging demerging = Nam.poll();
            System.out.println(demerging.getCode());
            System.out.println(demerging.getName());
            System.out.println(demerging.getDateOfBirth());
            System.out.println(demerging.getGender());
            System.out.println("------------");
        }

    }
}
