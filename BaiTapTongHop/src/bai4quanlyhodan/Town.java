package bai4quanlyhodan;

import java.util.ArrayList;
import java.util.Arrays;

public class Town {
    private int humanNum;
    private int apartmentNum;
    private ArrayList<Human> humans;

    public Town() {
    }

    public Town(int humanNum, int apartmentNum, ArrayList<Human>  humans) {
        this.humanNum = humanNum;
        this.apartmentNum = apartmentNum;
        this.humans = humans;
    }

    public int getHumanNum() {
        return humanNum;
    }

    public void setHumanNum(int humanNum) {
        this.humanNum = humanNum;
    }

    public int getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(int apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }

    public void setHumans(ArrayList<Human> humans) {
        this.humans = humans;
    }

    @Override
    public String toString() {
        return "Town{" +
                "humanNum=" + humanNum +
                ", apartmentNum=" + apartmentNum +
                ", humans=" + Arrays.toString(new ArrayList[]{humans}) +
                '}';
    }
}
