package ss11_JavaCollectionFramework.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        String str = "truong tan hai";
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< str.length(); i++) {
            if(map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }
        }
        Set<Character> set = map.keySet();
        for(Character c: set) {
            System.out.println("Số lượng xuất hiện của ký tự "+c+" là: "+ map.get(c));
        }
        System.out.println("-------------------------------------");
        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            System.out.println("Số lượng xuất hiện của ký tự "+entry.getKey()+" là: "+ entry.getValue());
        }
    }
}
