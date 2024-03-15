/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Person {
    private String fullName;
    private String gender;
    private String pet;
    private boolean football;
    private boolean basketball;

    public Person(String fullName, String gender, String pet, boolean football, boolean basketball) {
        this.fullName = fullName;
        this.gender = gender;
        this.pet = pet;
        this.football = football;
        this.basketball = basketball;
        System.out.println("Name: " + fullName + "\nGender: " + gender + "\nPet: " + pet + 
                "\nFootball: " + (football ? "Yes" : "No") + "\nBasketball: " + (basketball ? "Yes" : "No"));
    }

    public String getFullName() {
        return fullName;
    }

    public String getGender() {
        return gender;
    }

    public String getPet() {
        return pet;
    }

    public boolean isFootball() {
        return football;
    }

    public boolean isBasketball() {
        return basketball;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + "\nGender: " + gender + "\nPet: " + pet +
                "\nFootball: " + (football ? "Yes" : "No") + "\nBasketball: " + (basketball ? "Yes" : "No");
    }
}

