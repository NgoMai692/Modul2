package baitap.timkiemnhiphandungdequy;

public class BinarySearch {


    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0;
        int right = array.length-1;
        System.out.println(binarySearch(array,left,right, 0));
        System.out.println(binarySearch(array, 0, 10, 1));
        System.out.println(binarySearch(array, 0, 10, 2));
        System.out.println(binarySearch(array, 0, 10, 3));
        System.out.println(binarySearch(array, 0, 10, 4));
        System.out.println(binarySearch(array, 0, 10, 5));
        System.out.println(binarySearch(array, 0, 10, 6));
        System.out.println(binarySearch(array, 0, 10, 7));
        System.out.println(binarySearch(array, 0, 10, 8));
        System.out.println(binarySearch(array, 0, 10, 9));
        System.out.println(binarySearch(array, 0, 10, 10));
        System.out.println(binarySearch(array, 0, 10, 11));
        System.out.println(binarySearch(array, 0, 10, -1));

    }
    public static int binarySearch(int[] arr, int left, int right, int value) {
        int mid = (left + right) / 2;
        if (left <= right) {
            if (arr[mid] == value) {
                return mid;
            }else if (arr[mid] > value) {
                int right1 = mid - 1;
                return binarySearch(arr, left, right1, value);
            } else{
                int left1 = mid + 1;
                return binarySearch(arr, left1, right, value);
            }
        }
        return -1;
    }


}
