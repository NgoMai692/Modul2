package baitap.baitapthem;

import thuchanh.sapxepvoicomparablevacomparator.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AnimalManager {
    private Set<Animal> animals = new HashSet<>();

    public AnimalManager(Set<Animal> animals) {
        this.animals = animals;
    }

    public AnimalManager() {
    }

    public Animal creatAnimal(Scanner scanner, int choice){
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        System.out.println("Nhập cân nặng");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        if(choice ==1){
            return new Dog(name,age,weight);
        }
        if(choice ==2){
            return new Cat(name,age,weight);
        }
        if(choice ==3){
            return new Mouse(name,age,weight);
        }
        if(choice ==4){
            return new Animal(name,age,weight);
        }
        return null;
    }
    public void displayAnimal() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.printf("Name: %s has  %d  age and %f weight. \n", animal.getName(), animal.getAge(), animal.getWeight());

            }
        }
        System.out.println("-------------------");
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void deleteAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                animals.remove(animal);
            }
        }
    }

    public void editAnimal(String name, Scanner scanner) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.println("Enter new Name:");
                String newName = scanner.nextLine();
                System.out.println("Enter new age:");
                int newAge = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter new weight:");
                double newWeight = scanner.nextDouble();
                scanner.nextLine();
                animal.setName(newName);
                animal.setAge(newAge);
                animal.setWeight(newWeight);
            }
        }
    }

    public void displayByName(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                System.out.printf("Name: %s has  %d  age and %f weight.", animal.getName(), animal.getAge(), animal.getWeight());
            }
        }
    }

    public void findDogInAnimal() {
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.printf("Name: %s has  %d  age and %f weight.", animal.getName(), animal.getAge(), animal.getWeight());
            }
        }
    }

    public void findAnimalByWeight(double highWeight, double lowWeight) {
        for (Animal animal : animals) {
            if (animal.getWeight() < highWeight && animal.getWeight() > lowWeight) {
                System.out.printf("Name: %s has  %d  age and %f weight.", animal.getName(), animal.getAge(), animal.getWeight());
            }
        }
    }
}
