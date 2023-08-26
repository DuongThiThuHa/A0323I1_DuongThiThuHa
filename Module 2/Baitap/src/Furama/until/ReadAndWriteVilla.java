package Furama.until;

import Furama.model.Facility;
import Furama.model.Villa;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteVilla {
    private static final String FILE_PATH = "D:\\CodeGym\\TranNhatLong-A1222I1_Md2\\src\\Furama\\data\\Villa.csv";

    public static LinkedHashMap<Facility, Integer> readCSV() throws IOException {
        LinkedHashMap<Facility, Integer> fac = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Villa villa;

        while ((line = buff.readLine()) != null) {
            temp = line.split(",");
            String name = temp[0];
            double price = Double.parseDouble(temp[1]);
            int numberOfPeople = Integer.parseInt(temp[2]);
            String rentalTyle = temp[3];
            double usableArea = Double.parseDouble(temp[4]);
            String roomStandard = temp[5];
            int numberOfFloors = Integer.parseInt(temp[6]);
            double poolArea = Double.parseDouble(temp[7]);
            villa = new Villa(name, price, numberOfPeople, rentalTyle, usableArea, roomStandard, numberOfFloors, poolArea);
            fac.put(villa, 0);
        }
        buff.close();
        return fac;
    }

    public static void writeCSV(LinkedHashMap<Facility, Integer> villaIntegerLinkedHashMap) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Facility facility : villaIntegerLinkedHashMap.keySet()) {
            if (facility instanceof Villa) {
                Villa villa = (Villa) facility;
                bufferedWriter.write(villa.getName() + "," + villa.getPrice() + "," + villa.getNumberOfPeople() + "," + villa.getRentalType() + "," + villa.getUsableArea() + "," + villa.getRoomStandard() + "," + villa.getNumberOfFloors() + "," + villa.getPoolArea() + "\n");
            }
        }
        bufferedWriter.close();
    }
}
