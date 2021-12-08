package Animal;

public class Animal {
    String name;
    double weight;
    int age;
    String sex;

    public Animal(){

    }
    public Animal(String name, double weight, int age, String sex) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String sound(String str){
        return str;
    }

    public void eat(){
        this.weight += 1;
    }
}
