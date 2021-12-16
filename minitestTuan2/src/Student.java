public class Student extends Human{
    private double avgPoint;

    public Student() {
    }

    public Student(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public Student(String name, int age, double avgPoint) {
        super(name, age);
        this.avgPoint = avgPoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "avgPoint=" + avgPoint +
                '}';
    }
}
