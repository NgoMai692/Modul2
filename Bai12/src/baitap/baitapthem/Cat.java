package baitap.baitapthem;

public class Cat extends Animal implements AnimalMethod{

    public Cat() {
    }

    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    public String catCatchMouse(){
        return "Cat is catching Mouse";
    }

    public void eat (){
        System.out.println("Cat is eating");
        super.setWeight(super.getWeight()+1);
    }
    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "meo meo";
    }

    @Override
    public String toString() {
        return "Cat{"+ super.toString()+ "}";
    }
}
