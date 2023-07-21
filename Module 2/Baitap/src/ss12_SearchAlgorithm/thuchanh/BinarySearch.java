package ss12_SearchAlgorithm.thuchanh;

public class BinarySearch {
    static int[] list = {24,12,18,10,20,1,2,22,23};
    static int binarySearch(int[] list, int key){
        int start = 0;
        int end = list.length -1;
        while (end >= start){
            int mid = (start + end) / 2;
            if (key < list[mid]){
                end = mid -1;
            }else if (key == list[mid]){
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,18));
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,24));
        System.out.println(binarySearch(list,12));
    }
}
