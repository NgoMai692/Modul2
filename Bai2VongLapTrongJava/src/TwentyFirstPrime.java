import java.util.Scanner;

public class TwentyFirstPrime {
    public static void main(String[] args) {
        int primeNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in: ");
        primeNum = input.nextInt();
        int i = 3;
        System.out.println(2);
        for (int count = 1; count < primeNum; ) {
            boolean check = true;
            for (int j = 2; j < Math.abs(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            i++;
            if (check) {
                System.out.println(i-1);
                count++;
            }
        }
    }
}
