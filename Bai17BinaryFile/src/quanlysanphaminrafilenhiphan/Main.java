package quanlysanphaminrafilenhiphan;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Iphone13","Apple",2000));
        products.add(new Product("SamSungGalasy3","SamSung",5000));
        products.add(new Product("Iphone10","Apple",1000));
        products.add(new Product("Iphone7","Apple",600));
        writeToFile("products.txt",products);

        List<Product> productsReadFromFile = readDataFromFile("products.txt");
        for (Product p: productsReadFromFile) {
            System.out.println(p);
        }
    }
}
