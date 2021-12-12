import java.util.Scanner;

public class SumMainDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng và cột của ma trận vuông: ");
        int matrixSize = scanner.nextInt();

        double[][] array = new double[matrixSize][matrixSize];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Nhập vào gí trị phần tử dòng thứ "+ (i+1)+ " cột thứ " + (j + 1));
                array[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }

        System.out.println("Tổng đường chéo chính là " + sum);
    }
}
