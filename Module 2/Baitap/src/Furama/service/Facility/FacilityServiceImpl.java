package Furama.service.Facility;

import Furama.model.Facility;
import Furama.model.House;
import Furama.model.Room;
import Furama.model.Villa;
import Furama.until.ReadAndWriteHouse;
import Furama.until.ReadAndWriteRoom;
import Furama.until.ReadAndWriteVilla;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static LinkedHashMap<Facility, Integer> facilities = new LinkedHashMap<>();
//    static {
//        facility.put(new Villa("Villa",5000000,6,"Tháng",500,"Thường",3,200),0);
//        facility.put(new House("House",500000,3,"Ngày", 1000,"VIP", 2),0);
//        facility.put(new Room("Room",150000,2,"Ngày",200,"Sân thượng"),0);
//
//    }


    @Override
    public void display() {
        facilities = new LinkedHashMap<>();
        try {
            LinkedHashMap<Facility, Integer> list = ReadAndWriteVilla.readCSV();
            for (Facility villa : list.keySet()) {
                facilities.put(villa, list.get(villa));
            }
            list = ReadAndWriteHouse.readCSV();
            for (Facility house : list.keySet()) {
                facilities.put(house, list.get(house));
            }
            list = ReadAndWriteRoom.readCSV();
            for (Facility room : list.keySet()) {
                facilities.put(room, list.get(room));
            }
            for (Facility facility : facilities.keySet()) {
                System.out.println(facility + ", " + facilities.get(facility));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        for(Map.Entry<Facility,Integer> item : facility.entrySet()){
//            System.out.printf("%s - %s",item.getKey(),item.getValue());
//            System.out.println();
//
//        }
    }

    @Override
    public void addNew() throws IOException {
        facilities = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to menu");
            System.out.println("Chọn số: ");
            choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                case 1:
                    Villa tempVilla = addNewVilla();
                    facilities.put(tempVilla,0);
                    ReadAndWriteVilla.writeCSV(facilities);
                    display();
                    break;
                case 2:
                    House tempHouse = addNewHouse();
                    facilities.put(tempHouse, 0);
                    ReadAndWriteHouse.writeCSV(facilities);
                    display();
                    break;
                case 3:
                    Room tempRoom = addNewRoom();
                    facilities.put(tempRoom, 0);
                    ReadAndWriteRoom.writeCSV(facilities);
                    display();
                    break;
                case 4:
                    break;
            }
        } while (choice < 4);
    }

    public Villa addNewVilla() {
        facilities = new LinkedHashMap<>();
        try {
            LinkedHashMap<Facility, Integer> list = ReadAndWriteVilla.readCSV();
            for (Facility villa : list.keySet()) {
                facilities.put(villa, list.get(villa));
            }
            for (Facility facility : facilities.keySet()) {
                System.out.println(facility + ", " + facilities.get(facility));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên dịch vụ: ");
        String name = input.nextLine();
        // giá
        double price = 0;
        do {
            try {
                System.out.println("Nhập giá : ");
                price = Double.parseDouble(input.nextLine());
                if (price < 0) {
                    System.out.println("Vui lòng nhập số lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 0");
            }
        } while (price < 0);
        // số lượng
        int numberr = 0;
        do {
            try {
                System.out.println("Nhập số lượng : ");
                numberr = Integer.parseInt(input.nextLine());
                if (numberr < 0 || numberr > 20) {
                    System.out.println("Vui lòng nhập số lớn hơn 0 và nhỏ hơn 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 0 và nhỏ hơn 20");
            }
        } while (numberr < 0 || numberr > 20);
        System.out.println("Nhập kiểu: ");
        String type = input.nextLine();
        // diện tích sử dụng được
        double usableArea = 0;
        do {
            try {
                System.out.println("Diện có thể sử dụng được: ");
                usableArea = Double.parseDouble(input.nextLine());
                if (usableArea < 30) {
                    System.out.println("Vui lòng nhập số lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 30");
            }
        } while (usableArea < 30);

        System.out.println("Tiêu chuẩn phòng: ");
        String roomStandard = input.nextLine();
        // số tầng
        int numberOfFloors = 0;
        do {
            try {
                System.out.println("Nhập số tầng : ");
                numberOfFloors = Integer.parseInt(input.nextLine());
                if (numberOfFloors < 0) {
                    System.out.println("Vui lòng nhập số lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 0");
            }
        } while (numberOfFloors < 0);
        // diện tích hồ bơi
        double poolArea = 0;
        do {
            try {
                System.out.println("Diện tích hồ bơi: ");
                poolArea = Double.parseDouble(input.nextLine());
                if (poolArea < 30) {
                    System.out.println("Vui lòng nhập số lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 30");
            }
        } while (poolArea < 30);
        return new Villa(name, price, numberr, type, usableArea, roomStandard, numberOfFloors, poolArea);

    }

    public Room addNewRoom() {
        facilities = new LinkedHashMap<>();
        try {
            LinkedHashMap<Facility, Integer> list = ReadAndWriteRoom.readCSV();
            for (Facility room : list.keySet()) {
                facilities.put(room, list.get(room));
            }
            for (Facility facility : facilities.keySet()) {
                System.out.println(facility + ", " + facilities.get(facility));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên dịch vụ: ");
        String name = input.nextLine();
        double price = 0;
        do {
            try {
                System.out.println("Nhập giá : ");
                price = Double.parseDouble(input.nextLine());
                if (price < 0) {
                    System.out.println("Vui lòng nhập số lớn hơn 0");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 0");
            }
        } while (price < 0);
        int numberr = 0;
        do {
            try {
                System.out.println("Nhập số lượng : ");
                numberr = Integer.parseInt(input.nextLine());
                if (numberr < 0 || numberr > 20) {
                    System.out.println("Vui lòng nhập số lớn hơn 0 và nhỏ hơn 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 0 và nhỏ hơn 20");
            }
        } while (numberr < 0 || numberr > 20);
        System.out.println("Nhập kiểu: ");
        String type = input.nextLine();
        double usableArea = 0;
        do {
            try {
                System.out.println("Diện có thể sử dụng được: ");
                usableArea = Double.parseDouble(input.nextLine());
                if (usableArea < 30) {
                    System.out.println("Vui lòng nhập số lớn hơn 30");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng,Vui lòng nhập số lớn hơn 30");
            }
        } while (usableArea < 30);
        System.out.println("Khu vực miễn phí: ");
        String freeService = input.nextLine();
        return new Room(name, price, numberr, type, usableArea, freeService);
    }

    public House addNewHouse() {
        facilities = new LinkedHashMap<>();
        try {
            LinkedHashMap<Facility, Integer> list = ReadAndWriteHouse.readCSV();
            for (Facility house : list.keySet()) {
                facilities.put(house, list.get(house));
            }
            for (Facility facility : facilities.keySet()) {
                System.out.println(facility + " , " + facilities.get(facility));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên dịch vụ : ");
        String name = input.nextLine();
        double price = 0;
        do {
            try {
                System.out.println("Nhập giá : ");
                price = Double.parseDouble(input.nextLine());
                if (price < 0) {
                    System.out.println("Vui lòng nhập số lớn hơn 0 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng, vui lòng nhập số lớn hơn 0 ! ");
            }
        } while (price < 0);
        int number = 0;
        do {
            try {
                System.out.println("Nhập số lượng : ");
                number = Integer.parseInt(input.nextLine());
                if (number < 0 || number > 20) {
                    System.out.println("Vui lòng nhập số lớn hơn 0 và nhỏ hơn 20 ! ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng , vui lòng nhập lại ! ");
            }
        } while (number < 0 || number > 20);
        System.out.println("Nhập kiểu: ");
        String type = input.nextLine();
        double usableArea = 0;
        do {
            try {
                System.out.println("Diện tích có thể sử dụng được : ");
                usableArea = Double.parseDouble(input.nextLine());
                if (usableArea < 30) {
                    System.out.println("Vui lòng nhập số lớn hơn 30 !");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng , vui lòng nhập lại ! ");
            }
        } while (usableArea < 30);
        System.out.println("Tiêu chuẩn phòng : ");
        String roomStandard = input.nextLine();
        int numberOfFloors = 0;
        do {
            try {
                System.out.println("Nhập số tầng : ");
                numberOfFloors = Integer.parseInt(input.nextLine());
                if (numberOfFloors < 0) {
                    System.out.println("Vui lòng nhập số lớn hơn 0 ! ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không đúng vui lòng nhập lại ! ");
            }
        } while (numberOfFloors < 0);
        return new House(name, price, number, type, usableArea, roomStandard, numberOfFloors);
    }

    @Override
    public void edit() {
        facilities = new LinkedHashMap<>();
    }

    @Override
    public void delete() {
        facilities = new LinkedHashMap<>();

    }
}
