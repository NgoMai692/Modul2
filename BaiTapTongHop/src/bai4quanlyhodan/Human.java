package bai4quanlyhodan;

import java.time.LocalDate;

public class Human {
    private String name;
    private LocalDate birthDay;
    private String career;

    public Human() {
    }

    public Human(String name, LocalDate birthDay, String career) {
        this.name = name;
        this.birthDay = birthDay;
        this.career = career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", career='" + career + '\'' +
                '}';
    }
}
