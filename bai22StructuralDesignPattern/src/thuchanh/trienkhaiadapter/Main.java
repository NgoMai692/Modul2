package thuchanh.trienkhaiadapter;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file or folder path: ");
    String path = scanner.nextLine();
    FileCalculator fileCalculator = new FileCalculatorAdapter();
    Client client = new Client(fileCalculator);
        client.printFileSize(path);
}
