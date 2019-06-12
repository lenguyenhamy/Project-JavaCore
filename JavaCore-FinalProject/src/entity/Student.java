/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author anhdt45
 */
public class Student extends Person {

    private String rollNumber;
    private double mark;

    public Student() {
    }

    public Student(String rollNumber, double mark, String name, boolean gender) {
        super(name, gender);
        this.rollNumber = rollNumber;
        this.mark = mark;
    }

    public String getRollNumber() {
        return this.rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMark() {
        return this.mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String display() {
        return this.rollNumber + " - " + getName() + " - " + ((isGender() == true) ? "Male" : "Female") + " - " + this.mark;
    }
}
