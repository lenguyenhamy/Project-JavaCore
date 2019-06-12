/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bo.ListShape;
import entity.IShape;
import entity.twodimensional.Circle;
import entity.twodimensional.Square;
import utils.Validate;

/**
 *
 * @author anhdt45
 */
public class TwoDimeansional {

    public static void main(String[] args) {

        ListShape listShape = new ListShape();

        end:
        do {
            System.out.println("\nTwo Dimeansional");
            System.out.println("1. Add Circle");
            System.out.println("2. Add Square");
            System.out.println("3. Add Triangle");
            System.out.println("4. Exit");

            int choice = Validate.getInteger("Your choice: ", 1, 4);

            IShape shape = null;
            switch (choice) {
                case 1:
                    shape = new Circle();
                    break;
                case 2:
                    shape = new Square();
                    break;
                case 3:
                    break;
                case 4:
                    break end;
                default:
                    break;
            }
            shape.input();
            listShape.add(shape);
        } while (true);

        System.out.println("\nList result: ");
        listShape.display();
    }
}
