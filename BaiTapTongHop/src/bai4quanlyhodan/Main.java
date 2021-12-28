package bai4quanlyhodan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TownManager townManager = new TownManager();
        int choice = -1;
        do{
            System.out.println("Menu:");
            System.out.println("1.Thêm hộ dân");
            System.out.println("2.Thêm người");
            System.out.println("3.Hiển thị thông tin hộ dân theo số nhà");
            System.out.println("4.Hiển thị các hộ năm nay có người 80 tuổi");
            System.out.println("Nhập lựa chọn");
            choice =scanner.nextInt();
            switch (choice){
                case 1:
                    Town family = townManager.creatFamily();
                    townManager.addFamily(family);
                    break;
                case 2:
                    System.out.println(townManager.addNewHuman());
                    break;
                case 3:
                    townManager.displayFamilyByApartmentNum();
                    break;
                case 4:
                    townManager.displayFamilyHasHumanIs80Age();
                    break;
            }


        }while (choice !=0);
    }



}
