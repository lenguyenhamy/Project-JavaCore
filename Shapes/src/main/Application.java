/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import utils.Validate;

/**
 *
 * @author anhdt45
 */
public class Application {

    public static void main(String[] args) {

        end:
        do {
            System.out.println("\nShape");
            System.out.println("1. Two Dimeansional");
            System.out.println("2. Three Dimeansional");
            System.out.println("3. Exit");

            int choice = Validate.getInteger("Your choice: ", 1, 3);
            switch (choice) {
                case 1:
                    TwoDimeansional.main(args);
                    break;
                case 2:
                    break;
                case 3:
                    break end;
                default:
                    break;
            }
        } while (true);
    }
}
