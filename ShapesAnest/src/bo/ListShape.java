/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.IShape;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anhdt45
 */
public class ListShape {

    List<IShape> list;

    public ListShape() {
        this.list = new ArrayList<>();
    }

    public ListShape(List<IShape> list) {
        this.list = list;
    }

    public List<IShape> getList() {
        return list;
    }

    public void setList(List<IShape> list) {
        this.list = list;
    }

    public void add(IShape shape) {
        this.list.add(shape);
    }

    public void display() {
        if (list.isEmpty() || list == null) {
            System.out.println("List is empty.");
        }

        this.list.forEach(shape -> shape.output());
    }

}
