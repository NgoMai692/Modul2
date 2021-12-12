package baitap.baitapvn;

import java.util.Scanner;

public class ManagerBook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng sách: ");
        int bookNum = scanner.nextInt();

        Book[] arrayBook = new Book[bookNum];
        // Tạo mảng có số lượng sách nhập vào
        creatArrayBook(scanner, arrayBook);

        int choice = -1;
        while (choice != 0){
            System.out.println("Menu: ");
            System.out.println("1.Hiển thị toàn bộ sách.");
            System.out.println("2.Tính tổng giá tiền của tất cả sách trong mảng.");
            System.out.println("3.Tìm quyển sách có giá thành cao nhất.");
            System.out.println("4.Tìm quyển sách có giá thành rẻ nhất");
            System.out.println("5.Tìm sách theo thể loại");
            System.out.println("6.Tìm sách theo tác giả");
            System.out.println("7.Tính giá trung bình của sách khoa học");
            System.out.println("0.Exit");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Hiển thị các sách đã nhập
                    displayBooks(arrayBook);
                    break;
                case 2:
                    // Tính tổng tiền sách
                    System.out.println("Tổng giá tiền tất cả sách là:"+ sumPrice(arrayBook));
                    break;
                case 3:
                    //Tìm sách có giá cao nhất
                    System.out.println("Sách có giá cao nhất là: ");
                    System.out.println(findMaxPriceBook(arrayBook));
                    break;
                case 4:
                    // Tìm sách có giá rẻ nhất
                    System.out.println("Sách có giá thành rẻ nhất là: ");
                    System.out.println(findMinPriceBook(arrayBook));
                    break;
                case 5:
                    System.out.println("Nhập vào thể loại muốn tim:");
                    String findType = scanner.nextLine();
                    findBookByType(arrayBook, findType);
                    break;
                case 6:
                    System.out.println("Nhập vào tác giả muốn tìm: ");
                    String findAuthor = scanner.nextLine();
                    findBookByAuthor(arrayBook, findAuthor);
                    break;
                case 7:
                    // Tính giá sách trung bình của sách khoa học
                    System.out.println("Giá trung bình của sách khoa học là:");
                    System.out.println(averagePriceOfScienceBook(arrayBook));
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có trong lựa chọn!");
            }
        }

    }

    private static void creatArrayBook(Scanner scanner, Book[] arrayBook) {
        for (int i = 0; i < arrayBook.length; i++) {
            System.out.println("Nhập thông tin sách thứ " + (i + 1));
            System.out.println("Chọn thể loại sách:");
            System.out.println("1.Sách khoa học");
            System.out.println("2.Tiểu thuyết");
            System.out.println("0.Không chọn");
            System.out.println("Hãy chọn thể loại:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    arrayBook[i] = new Book();
                    importBook(scanner, arrayBook, i);
                    System.out.println("Nhâp thể loại sách:");
                    String type = scanner.nextLine();
                    arrayBook[i] = new ScienceBook(arrayBook[i].getName(), arrayBook[i].getPrice(), arrayBook[i].getAmount(), arrayBook[i].getPublishDate(), type);
                    break;
                case 2:
                    arrayBook[i] = new Book();
                    importBook(scanner, arrayBook, i);
                    System.out.println("Nhâp tên tác giả:");
                    String author = scanner.nextLine();
                    arrayBook[i] = new Novel(arrayBook[i].getName(), arrayBook[i].getPrice(), arrayBook[i].getAmount(), arrayBook[i].getPublishDate(), author);
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }

    private static void importBook(Scanner scanner, Book[] arrayBook, int i) {
        scanner.nextLine();
        System.out.println("Nhập tên sách:");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sách:");
        double price = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhâp ngày xuất bản:");
        String publishDate = scanner.nextLine();

        arrayBook[i] = new Book(name, price, amount, publishDate);
    }

    private static void displayBooks(Book[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }

    private static double sumPrice(Book[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i].getPrice()*arr[i].getAmount());
        }
        return sum;
    }

    private static Book findMaxPriceBook(Book[] arr) {
        double maxPrice = arr[0].getPrice();
        int maxPriceIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (maxPrice < arr[i].getPrice()) {
                maxPrice = arr[i].getPrice();
                maxPriceIndex = i;
            }
        }
        return arr[maxPriceIndex];
    }

    private static Book findMinPriceBook(Book[] arr) {
        double minPrice = arr[0].getPrice();
        int minPriceIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (minPrice > arr[i].getPrice()) {
                minPrice = arr[i].getPrice();
                minPriceIndex = i;
            }
        }
        return arr[minPriceIndex];
    }

    private static void findBookByType(Book[] arr, String findStype) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof ScienceBook) {
                if (((ScienceBook) arr[i]).getType().equals(findStype)) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static void findBookByAuthor(Book[] arr, String findAuthor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Novel) {
                if (((Novel) arr[i]).getAuthor().equals(findAuthor)) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    private static double averagePriceOfScienceBook(Book[] arr) {
        int count = 0;
        double sumPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof ScienceBook) {
                sumPrice += arr[i].getPrice();
                count++;
            }
        }
        return sumPrice / count;
    }
}



