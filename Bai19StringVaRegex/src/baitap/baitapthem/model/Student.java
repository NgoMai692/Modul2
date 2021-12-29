package baitap.baitapthem.model;

import baitap.baitapthem.model.Human;

public class Student extends Human {
    private double avgPoint;

    public Student() {
    }

    public Student(String name, int age, String gender, String address, double avgPoint) {
        super(name, age, gender, address);
        this.avgPoint = avgPoint;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }
}
