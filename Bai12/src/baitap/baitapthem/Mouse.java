package baitap.baitapthem;

public class Mouse extends Animal implements AnimalMethod{

    public Mouse() {
    }

    public Mouse(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public int run() {
        return 0;
    }

    @Override
    public String makeSound() {
        return "chit chit";
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString()+ "}";
    }
}
