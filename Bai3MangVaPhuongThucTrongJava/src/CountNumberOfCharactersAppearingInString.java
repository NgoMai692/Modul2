import java.util.Scanner;

public class CountNumberOfCharactersAppearingInString {
    public static void main(String[] args) {
        String str = "";
        String countChar = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi kí tự: ");
        str = scanner.nextLine();
        System.out.println("Nhập vào kí tự muốn đếm:");
        char character = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == character){
                count++;
            }
        }
        System.out.println("Chuỗi có: "+count + " kí tự " + character);
    }
}
