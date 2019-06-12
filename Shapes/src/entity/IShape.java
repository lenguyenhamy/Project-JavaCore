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
public interface IShape {

    /**
     * Input Shape
     */
    void input();

    /**
     * Display Shape
     */
    void output();

    /**
     * Calculate Area of Shape
     *
     * @return area of Shape
     */
    double getArea();
}
