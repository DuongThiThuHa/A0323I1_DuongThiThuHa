package ss11_JavaCollectionFramework.thuchanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgeStudent {
    public static void main(String[] args) {
        //Luu danh sach sinh vien
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("TH", 22);
        hashMap.put("DH", 22);
        hashMap.put("MH", 23);
        hashMap.put("AQ", 23);
        System.out.println("Hien thi cac muc nhap trong HashMap: " + hashMap + "\n");

        //Luu key theo thu tu giam dan
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Hien thi cac muc nhap theo thu tu tang dan: " + treeMap);

        //Luu danh sach sinh vien va hien thi
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(15, 0.75f, true);
        linkedHashMap.put("TH", 22);
        linkedHashMap.put("DH", 22);
        linkedHashMap.put("MH", 23);
        linkedHashMap.put("AQ", 23);
        System.out.println("Tuoi cua AQ la: " + linkedHashMap.get("AQ"));
    }

}
