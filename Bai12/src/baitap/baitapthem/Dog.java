package baitap.baitapthem;

public class Dog extends Animal implements AnimalMethod{

    public Dog() {
    }

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public String dogCatchMouse(){
        return  "Dog is catching Mouse";
    }

    public String dogCatchCat(){
        return "Dog is catching Cat";
    }

    public void eat(){
        System.out.println("Dog is eating");
        super.setWeight(super.getWeight()+1);
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "gâu gâu";
    }

    @Override
    public String toString() {
        return "Dog{"+ super.toString()+ "}";
    }
}
