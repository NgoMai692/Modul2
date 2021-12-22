package baitap.caidatthuattoansapxepchen;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,0,-1,9};
        insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void insertionSort(int[] arr){
        int pos, x;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i];
            pos = i;
            while (pos > 0 && x < arr[pos-1]){
                arr[pos] = arr[pos-1];
                pos--;
            }
            arr[pos] = x;
        }
    }
}
