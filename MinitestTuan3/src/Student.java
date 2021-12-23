public class Student extends Human{
    private double mathPoint;
    private double physicsPoint;
    private double chemistryPoint;
    private double avgPoint;
    public Student() {
    }

    public Student(String name, int age, double mathPoint, double physicsPoint, double chemistryPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicsPoint = physicsPoint;
        this.chemistryPoint = chemistryPoint;
        this.avgPoint = (mathPoint+ physicsPoint+chemistryPoint)/3;
    }

    public double getAvgPoint() {
        return avgPoint;
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

    @Override
    public String toString() {
        return  "Student{" + super.toString()+ "shas "+
                "mathPoint=" + mathPoint +
                ", physicsPoint=" + physicsPoint +
                ", chemistryPoint=" + chemistryPoint +
                '}';
    }
}
