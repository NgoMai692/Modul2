package bai4quanlyhodan;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.addAll;

public class TownManager {
    private ArrayList<Town> towns = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Town creatFamily() {
        System.out.println("Nhập số nhà:");
        int apartmentNum = scanner.nextInt();
        System.out.println("Nhập số người trong nhà:");
        int humanNum = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập thông tin người trong nhà:");
        ArrayList<Human> humans = new ArrayList<>();

        for (int i = 0; i < humanNum; i++) {
            System.out.println("Nhập thành viên thứ " + (i + 1));
            Human human = creatHuman();
            humans.add(human);
        }
        return new Town(humanNum, apartmentNum, humans);
    }
    public Human addNewHuman(){
        System.out.println("Nhập số nhà:");
        int apartmentNum = scanner.nextInt();
        scanner.nextLine();
        Boolean check = false;
        Human human = null;
        int humanNum;
        for (int i = 0; i < towns.size(); i++) {
            if(towns.get(i).getApartmentNum() == apartmentNum){
                human = creatHuman();
                humanNum = towns.get(i).getHumanNum()+1;
                ArrayList<Human> humans= new ArrayList<>();
                humans.add(human);
                humans.addAll(towns.get(i).getHumans());
                towns.set(i,new Town(humanNum,apartmentNum,humans));
                check = true;
            }
        }
        if(check){
            System.out.println("đã thêm 1 người " + human + " vào số nhà " +  apartmentNum);
        }else {
            System.out.println("Chưa có số nhà này hãy thêm hộ mới.");
        }
        return human;
    }
    private Human creatHuman() {
        System.out.println("Nhập Tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào ngày sinh(dd-mm-yyyy):");
        String dob = scanner.next();
        LocalDate dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-LL-yyyy"));
        scanner.nextLine();
        System.out.println("Nhập vào nghề nghiệp:");
        String job = scanner.nextLine();
        return new Human(name, dateOfBirth, job);
    }
    public void displayFamilyHasHumanIs80Age() {
        for (int i = 0; i < towns.size(); i++) {
            for (int j = 0; j < towns.get(i).getHumans().size(); j++) {
                if (LocalDate.now().getYear() - towns.get(i).getHumans().get(j).getBirthDay().getYear() == 0) {
                    System.out.println(towns.get(i));
                }
            }
        }
    }
    public void addFamily(Town town) {
        towns.add(town);
    }

    public void displayFamilyByApartmentNum(){
        System.out.println("Nhập số nhà:");
        int apartmentNum = scanner.nextInt();
        scanner.nextLine();
        for (Town t: towns) {
            if(t.getApartmentNum() == apartmentNum){
                System.out.println(t);
            }
        }

    }
}
