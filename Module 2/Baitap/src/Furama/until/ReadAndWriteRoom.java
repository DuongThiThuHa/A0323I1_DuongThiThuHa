package Furama.until;

import Furama.model.Facility;
import Furama.model.Room;

import java.io.*;
import java.util.LinkedHashMap;

public class ReadAndWriteRoom {
    private static final String FILE_PATH="D:\\CodeGym\\TranNhatLong-A1222I1_Md2\\src\\Furama\\data\\Room.csv";
    public static LinkedHashMap<Facility, Integer> readCSV() throws IOException {
        LinkedHashMap<Facility, Integer> fac = new LinkedHashMap<>();
        FileReader fileReader = new FileReader(FILE_PATH);
        BufferedReader buff = new BufferedReader(fileReader);

        String line;
        String[] temp;
        Room room;

        while ((line = buff.readLine()) != null){
            temp = line.split(",");
            String name = temp[0];
            double price = Double.parseDouble(temp[1]);
            int numberOfPeople = Integer.parseInt(temp[2]);
            String rentalTyle = temp[3];
            double usableArea = Double.parseDouble(temp[4]);
            String freeService = temp[5];
            room = new Room(name,price,numberOfPeople,rentalTyle,usableArea,freeService);
            fac.put(room,0);
        }
        buff.close();
        return fac;
    }
    public static void writeCSV(LinkedHashMap<Facility,Integer> roomLinkedHashMap) throws IOException {
        FileWriter fileWriter = new FileWriter(FILE_PATH,false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Facility facility: roomLinkedHashMap.keySet()){
            if(facility instanceof Room){
                Room room = (Room) facility;
                bufferedWriter.write(room.getName()+","+room.getPrice()+","+room.getNumberOfPeople()+","+room.getRentalType()+","+room.getUsableArea()+","+room.getFreeService()+"\n");
            }
        }
        bufferedWriter.close();

    }
}
