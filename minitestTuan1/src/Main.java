import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số lượng sản phẩm: ");
        int productNum = scanner.nextInt();

        Product[] products = new Product[productNum];

        creatProduct(scanner, products);
    }

    private static void creatProduct(Scanner scanner, Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập mã sản phẩm thứ "+ (i+1) +":");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập tên sản phẩm thứ "+ (i+1) +":");
            String name = scanner.nextLine();

            System.out.println("Nhập giá sản phẩm thứ "+ (i+1) +":");
            long price = scanner.nextLong();
            scanner.nextLine();
            System.out.println("Nhập tên loại sản phẩm thứ "+ (i+1) +":");
            String categories = scanner.nextLine();
            products[i] = new Product(id,name,price,categories);
        }
    }

//    public Product findProduct(Product[] products,String name){
//        boolean check = false;
//        int index = -1;
//        for (int i = 0; i < products.length; i++) {
//            if((products[i].getName()) == name){
//                check = true;
//                index = i;
//                break;
//            }
//        }
//        if (check){
//            return products[index];
//        }else {
//            return
//        }
//    }
}
