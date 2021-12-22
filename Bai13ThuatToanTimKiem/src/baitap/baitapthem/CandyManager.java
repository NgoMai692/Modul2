package baitap.baitapthem;

import java.util.ArrayList;
import java.util.Scanner;

public class CandyManager {
    ArrayList<Candy> candies ;

    public CandyManager() {
        this.candies = new ArrayList<>() ;
    }

    public void displayCandy(){
        for (Candy candy: candies) {
            System.out.println(candy);
        }
    }
    public boolean addCandy(Candy candy){
        return candies.add(candy);
    }

    public Candy deleteCandyById(int id){
        return candies.remove(id);
    }

    public Candy editCandy(Scanner scanner,int id){
        System.out.println("Nhập tính chất mới:");
        String tinhChat = scanner.nextLine();
        System.out.println("Nhập màu sắc mới:");
        String mauSac = scanner.nextLine();
        System.out.println("Nhập số lượng mới:");
        int soLuong = scanner.nextInt();
        System.out.println("Nhập đơn giá mới:");
        double donGia = scanner.nextDouble();
        System.out.println();

        return candies.set(id,new Candy(mauSac,tinhChat,soLuong,donGia));
    }

    public void displayCandyById(int id){
        System.out.println(candies.get(id));
    }

    public void deleteCandyByColor(String color){
        for (Candy candy: candies) {
            if(candy.getMauSac().equals(color)){
                candies.remove(candy);
            }
        }
    }

    public void displayCandyByColor(String color){
        for (Candy candy:candies) {
            if (candy.getMauSac().equals(color)){
                System.out.println(candy);
            }
        }
    }

    public ArrayList<Candy> findMaxPriceCandy(){
        ArrayList<Candy> newCandies = new ArrayList<>();
        double maxPrice = 0;
        for (Candy candy: candies) {
            if (candy.getDonGia() > maxPrice){
                maxPrice = candy.getDonGia();
            }
        }
        for (Candy candy: candies) {
            if(candy.getDonGia() == maxPrice){
                newCandies.add(candy);
            }
        }

        return newCandies;
    }

    public void sumPriceOfCandy(){
        for (Candy candy: candies) {
            System.out.println("Candy"+ candy.getId()+" có giá thành là: "+ candy.getDonGia()*candy.getSoLuong());
        }
    }
}
