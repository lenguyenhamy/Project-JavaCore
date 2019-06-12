/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.twodimensional;

import entity.IShape;

/**
 *
 * @author anhdt45
 */
public abstract class TwoDimensional implements IShape {

    @Override
    public abstract void input();

    @Override
    public abstract void output();

    @Override
    public abstract double getArea();

}
