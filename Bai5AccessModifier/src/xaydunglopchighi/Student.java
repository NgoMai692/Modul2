package xaydunglopchighi;

public class Student {
    private String name;
    private String classes ="C10";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
