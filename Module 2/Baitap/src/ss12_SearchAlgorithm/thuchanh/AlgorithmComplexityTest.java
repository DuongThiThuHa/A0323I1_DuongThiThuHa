package ss12_SearchAlgorithm.thuchanh;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi ki tu bat ki : ");
        String str = scanner.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            frequentChar[ascii] += 1;
        }
        int max = 0 ;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            max = frequentChar[i];
            character = (char) i;
         }
        System.out.println("Chu cai xuat hien nhieu nhat la : '" + character + "' voi tan suat la:  " + max + " lan");
    }
}
