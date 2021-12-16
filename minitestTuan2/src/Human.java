public class Human {
    private String name;
    private int age;
    public static int ID = 1;
    private int id;

    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id='"+ id +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
