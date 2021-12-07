
import java.util.Scanner;
public class BTChangeCash {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lương USD:");
        int dola = scanner.nextInt();
        System.out.println(dola*23000 + "VND");
    }
}
