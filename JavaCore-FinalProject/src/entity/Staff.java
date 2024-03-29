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
public class Staff extends Person {

    private String staffNumber;
    private double salary;

    public Staff() {
    }

    public Staff(String staffNumber, double salary, String name, boolean gender) {
        super(name, gender);
        this.staffNumber = staffNumber;
        this.salary = salary;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String display() {
        return staffNumber + " - " + super.getName() + " - " + (super.isGender() == true ? "Male" : "Female") + " - " + salary;
    }
}
