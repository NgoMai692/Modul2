import java.util.Scanner;

public class FindMaxArray2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so hang cua mang:");
        int arrRow = scanner.nextInt();
        System.out.println("Nhap vao so cot cua mang:");
        int arrCol = scanner.nextInt();

        int[][] array = setArr(arrRow,arrCol);
        int max = findMaxArray2(array);

        System.out.println("Gia tri lon nhat trong mang la: " + max);
    }

    public static int findMaxArray2(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static int[][] setArr(int row, int col){
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Nhap phan tu hang " + (i+1) + " cot " + (j+1));
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }
}
