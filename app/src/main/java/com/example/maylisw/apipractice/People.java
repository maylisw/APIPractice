package com.example.maylisw.apipractice;

/**
 * Created by maylisw on 1/23/18.
 */

public class People {
    private String name, surname, gender, region;

    public People(String name, String surname, String gender, String region) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                "surname='" + surname + '\'' +
                "gender='" + gender + '\'' +
                "region='" + region + '\'' +
                '}';
    }
}
