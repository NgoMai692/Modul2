import java.util.Comparator;
import java.util.stream.Collector;

public class Student extends Human implements Comparator<Student> {
    private double mathPoint;
    private double physicsPoint;
    private double chemistryPoint;

    public Student()  {
    }

    public Student(String name, int age, double mathPoint, double physicsPoint, double chemistryPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
    }

    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysicsPoint() {
        return physicsPoint;
    }

    public void setPhysicsPoint(double physicsPoint) {
        this.physicsPoint = physicsPoint;
    }

    public double getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }

    public double getAvgPoint(){
        return (mathPoint+physicsPoint+chemistryPoint)/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + super.getId() +
                ", Name=" + super.getName() +
                ", Age=" + super.getAge() +
                ", mathPoint=" + mathPoint +
                ", physicsPoint=" + physicsPoint +
                ", chemistryPoint=" + chemistryPoint +
                '}';
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (int) Math.round(+o1.getAvgPoint()- o2.getAvgPoint());
    }
}
