package ss11_JavaCollectionFramework.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgeStudent {
    public static void main(String[] args) {
        //Luu danh sach sinh vien
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Simmy",22);
        hashMap.put("Sidur",25);
        hashMap.put("Kenny",30);
        System.out.println("Display entries in HashMap : "+ hashMap + "\n");

        //Luu key theo thu tu giam dan
        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key : "+ treeMap);

        //Luu danh sach sinh vien va hien thi
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(15,0.75f,true);
        linkedHashMap.put("Simmy", 22);
        linkedHashMap.put("Sidur",25);
        linkedHashMap.put("Kenny",30);
        System.out.println("The age for "+ "Simmy is " + linkedHashMap.get("Simmy"));
    }
}
