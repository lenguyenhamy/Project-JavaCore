/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.twodimensional;

import util.Validate;

/**
 *
 * @author anhdt45
 */
public class Circle extends TwoDimensional {

    private final double PI = 3.14;
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void input() {
        this.r = Validate.getDouble("Enter r: ", 0, Double.MAX_VALUE);
    }

    @Override
    public void output() {
        System.out.println("r = " + this.r);
        System.out.println("Area of Circle: " + this.getArea());
    }

    @Override
    public double getArea() {
        return PI * Math.pow(r, 2);
    }
}
