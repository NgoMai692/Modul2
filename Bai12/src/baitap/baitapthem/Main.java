package baitap.baitapthem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AnimalManager animalManager = new AnimalManager();

        int choice = -1;
    Scanner scanner= new Scanner(System.in);
        do{
            System.out.println("Menu:");
            System.out.println("1.Thêm một con vật");
            System.out.println("2.Xóa một con vật");
            System.out.println("3.Sửa một con vật theo tên");
            System.out.println("4.Hiển thị thông tin một con vật theo tên");
            System.out.println("5.Hiển thị tất cả các con vật");
            System.out.println("6.Trả về tất cả các con Dog");
            System.out.println("7.Trả về tất cả các con vật trong khoảng cân nặng được nhập vào");
            System.out.println("0.Exit");
            System.out.println("Nhập vào lựa chọn:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    int choice1 = -1;
                    do{
                        System.out.println("Chọn loại Animal:");
                        System.out.println("1.Dog");
                        System.out.println("2.Cat");
                        System.out.println("3.Mouse");
                        System.out.println("4.animal khác");
                        System.out.println("0.Exit");
                        System.out.println("Nhập vào lựa chọn:");
                        choice1 = scanner.nextInt();
                        scanner.nextLine();


                        if(choice1 !=0){

                        }

                        switch (choice1){
                            case 1:
                                Animal animal = new Dog(name,age,weight);
                                animalManager.addAnimal(animal);
                                break;
                            case 2:
                                Animal animal1 = new Cat(name,age,weight);
                                animalManager.addAnimal(animal1);
                                break;
                            case 3:
                                Animal animal2 = new Mouse(name,age,weight);
                                animalManager.addAnimal(animal2);
                                break;
                            case 4:
                                Animal animal3 = new Animal(name,age,weight);
                                animalManager.addAnimal(animal3);
                                break;
                        }
                    }while (choice1 !=0);
                    break;
                case 2:
                    System.out.println("Nhập tên con vật muốn xóa:");
                    String deleteName = scanner.nextLine();
                    animalManager.deleteAnimal(deleteName);
                    break;
                case 3:
                    System.out.println("Nhập tên con vật muốn sửa:");
                    String editName = scanner.nextLine();
                    animalManager.editAnimal(editName,scanner);
                    break;
                case 4:
                    System.out.println("Nhập tên con vật muốn hiển thị:");
                    String displayName = scanner.nextLine();
                    animalManager.displayByName(displayName);
                    break;
                case 5:
                    animalManager.displayAnimal();
                    break;
                case 6:
                    animalManager.findDogInAnimal();
                    break;
                case 7:
                    System.out.println("Nhập khoảng cân nặng muốn tìm:");
                    System.out.println("Nhập khoảng cân nặng trên:");
                    double heightWeight = scanner.nextDouble();
                    System.out.println("Nhập khoảng cân nặng dưới:");
                    double lowWeight = scanner.nextDouble();
                    scanner.nextLine();

                    animalManager.findAnimalByWeight(heightWeight,lowWeight);
                    break;
            }
        }while (choice !=0);
    }
}
