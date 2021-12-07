import java.util.Scanner;

public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu cua mang: ");
        int arrNum = scanner.nextInt();
        int [] arr = setArray(arrNum);
        displayArray(arr);

        System.out.println("Nhap giá trị cần thêm: ");
        int insertNum = scanner.nextInt();
        System.out.println("Nhap vao vi tri muon chen: ");
        int insertIndex = scanner.nextInt();

        if(isCouldInsert(arr,insertIndex)){
            int[] newArray = insertElementInArray(arr,insertIndex,insertNum);
            displayArray(newArray);
        }else {
            System.out.println("Khong chen dươc phan tu vao mang.");
        }
    }

    public static boolean isCouldInsert(int[] array, int insertIndex){
        if (insertIndex <= -1 || insertIndex >= array.length-1){
            return false;
        }
        return true;
    }
    public static int[] insertElementInArray(int[] array, int index, int value){
        int[] newArr = new int[array.length+1];
        for (int i = 0; i < array.length+1; i++) {
            if (i == index){
                newArr[i] = value;
            }else if(i < index){
                newArr[i] = array[i];
            }else {
                newArr[i] = array[i-1];
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
