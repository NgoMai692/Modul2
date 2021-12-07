import java.util.Scanner;

public class FindMinArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phantu cua mang:");
        int length = scanner.nextInt();
        int[] arr = setArray(length);
        int min = findMinArray(arr);
        System.out.println("Gia tri nho nhat cua mang la: "+ min);
    }

    public static int findMinArray(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static int[] setArray(int length){
        Scanner input = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhap phan tu thu "+ (i+1));
            array[i] = input.nextInt();
        }


        return array;
    }
}
