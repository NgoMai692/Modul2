import java.util.Scanner;

public class AggregateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang thu nhat: ");
        int length1 = scanner.nextInt();
        int[] arr1 = setArray(length1);

        System.out.println("Nhap so luong phan tu mang thu hai: ");
        int length2 = scanner.nextInt();
        int[] arr2 = setArray(length2);
        System.out.println("Mang thu nhat: ");
        displayArray(arr1);
        System.out.println();
        System.out.println("Mang thu hai:");
        displayArray(arr2);
        System.out.println();
        System.out.println("Mang moi sau khi gop 2 mang:");
        int[] newArr = aggregateTwoArray(arr1,arr2);
        displayArray(newArr);

    }

    public static int[] aggregateTwoArray(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if(i < arr1.length){
                newArr[i] = arr1[i];
            }else {
                newArr[i] = arr2[i -arr1.length];
            }
        }
        return newArr;
    }
    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] setArray(int length){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[length];
        int i = 0;
        while (i < arr.length){
            System.out.println("Nhap phan tu thu " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        return arr;
    }
}
