import java.util.Scanner;

public class SumAColumOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập và số dòng của mảng: ");
        int row = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        int col = scanner.nextInt();
        double[][] array = new double[row][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập giá trị phần tử dòng "+ (i+1)+ " cột " + (j+1));
                array[i][j] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();

        }

        System.out.println("Nhập cột muốn tính tổng");
        int sumCol = scanner.nextInt();

        if (sumCol < 0 || sumCol >= array.length){
            System.out.println("Không có cột này trong mảng");
        }else {
            double sum = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if(j==sumCol-1){
                        sum += array[i][j];
                    }
                }
            }
            System.out.println("Tổng các số ở cột " + sumCol +" là " + sum);
        }

    }


}
