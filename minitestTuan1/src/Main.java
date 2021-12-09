import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số lượng sản phẩm: ");
        int productNum = scanner.nextInt();

        Product[] products = new Product[productNum];
        creatProduct(scanner, products);

        System.out.println("Tổng giá các sản phẩm là: "+ sumPriceCalculator(products) + products[0].money);
        System.out.println("Nhập vào sản phẩm muốn tìm:");
        String findName = scanner.nextLine();

        System.out.println(products[0].getName());
        System.out.println(findName);
        System.out.println(isFindProduct(products,findName));
        if(isFindProduct(products,findName)){
            findProduct(products,findName);
        }else {
            System.out.println("không có sản phẩm trong danh sách!");
        }

    }


    private static long sumPriceCalculator(Product[] products){
        long sumPrice = 0;
        for (int i = 0; i < products.length; i++) {
            sumPrice += products[i].getPrice();
        }
        return sumPrice;
    }
    private static void findProduct(Product[] products, String name){
        for (int i = 0; i < products.length; i++) {
            if(products[i].getName() == name){
                products[i].toString();
            }
        }
    }
    private static void creatProduct(Scanner scanner, Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập mã sản phẩm thứ " + (i + 1) + ":");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập tên sản phẩm thứ " + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm thứ " + (i + 1) + ":");
            long price = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Nhập tên loại sản phẩm thứ " + (i + 1) + ":");
            String categories = scanner.nextLine();

            products[i] = new Product(id, name, price, categories);
        }
    }


    public static boolean isFindProduct(Product[] products, String name) {

        for (Product element:products) {
            if(element.equals(name)){
                return true;
            }
        }
        return false;
    }
}
