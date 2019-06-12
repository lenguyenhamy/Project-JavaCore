/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author anhdt45
 */
public class ValidateHelper {

    public double getInteger(String message) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        while (true) {
            try {
                System.out.print(message);
                number = scanner.nextInt();
                break;
            } catch (InputMismatchException ex) {
                scanner.nextLine();
            }
        }
        return number;
    }

    public double getDouble(String message) {
        Scanner scanner = new Scanner(System.in);
        double number = 0.0D;
        while (true) {
            try {
                System.out.print(message);
                number = scanner.nextDouble();
                break;
            } catch (InputMismatchException ex) {
                scanner.nextLine();
            }
        }
        return number;
    }
}
