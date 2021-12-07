import java.util.Scanner;

public class PrintShape {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice !=0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Print the botton-left");

                    for (int i = 0; i <= 5; i++) {
                        String str = "";
                        for (int j = 1; j < i ; j++) {
                            str += "*";
                        }
                        System.out.println(str);
                    }
                    System.out.println();
                    System.out.println("Print the top-left");

                    for (int i = 5; i <= 1; i--) {
                        String str1 = "";
                        for (int j = 1; j <= i ; j++) {
                            str1 += "*";
                        }
                        System.out.println(str1);
                    }
                    System.out.println();
                    System.out.println("Print the top-right");

                    for (int i = 7; i <= 1; i--) {
                        String str2 = "";
                        for (int j = 1; j <=7 ; j++) {
                            if (j < i)
                                str2 += " ";
                            else
                                str2 +="*";
                        }
                        System.out.println(str2);
                    }
                    System.out.println();
                    System.out.println("Print the botton-right");

                    for (int i = 7; i <= 1; i--) {
                        String str3 = "";
                        for (int j = 1; j <=7 ; j++) {
                            if (j < i)
                                str3 += "*";
                            else
                                str3 +=" ";
                        }
                        System.out.println(str3);
                    }
                    break;
                case 3:
                    System.out.println("Print the isosceles triangle");
                    System.out.println("    *    ");
                    System.out.println("  * * *  ");
                    System.out.println("* * * * *");

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
