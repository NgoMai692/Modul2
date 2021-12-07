import java.util.Scanner;

public class DeleteElementArray {
    public static void main(String[] args) {
        int arrNum, deleteNum;
        int []arr,newArr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang: ");
        arrNum = scanner.nextInt();
        arr = setArray(arrNum);
        displayArray(arr);
        System.out.println();

        System.out.println("Nhap phan tu can xoa: ");
        deleteNum = scanner.nextInt();

        if(findElement(arr,deleteNum) != -1){
            int index = findElement(arr,deleteNum);
            newArr = deleteElementInArray(arr,index);
            System.out.println("Mang sau khi xóa gia tri " + deleteNum + " là: ");
            displayArray(newArr);
        }else {
            System.out.println("Giá trị cần xóa không có trong mảng.");
        }
    }

    public static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] deleteElementInArray(int[] arr, int index){
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
            if (i >= index){
                newArr[i] =arr[i+1];
            }else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
    public static int findElement(int[] array , int findNum){
        int index = -1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == findNum){
                index = j;
                break;
            }
        }
        return index;
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
