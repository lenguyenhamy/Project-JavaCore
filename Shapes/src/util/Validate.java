/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Scanner;

/**
 * DOUBLE
 *
 * @author anhdt45
 */
public class Validate {

    private static final String REGEX_DOUBLE = "\\d+|\\d+\\.\\d+";

    private static final String REGEX_INTEGER = "\\d+";

    public static double getDouble(String message, double min, double max) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        double number = 0;

        while (flag) {
            System.out.print(message);
            String numberStr = scanner.nextLine().trim();

            if (numberStr.matches(REGEX_DOUBLE)) {
                number = Double.valueOf(numberStr);

                if (number >= min && number <= max) {
                    flag = false;
                } else {
                    System.out.println("Number out of range.");
                }
            } else {
                System.out.println("Invalid number.");
            }
        }
        return number;
    }

    public static int getInteger(String message, double min, double max) {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int number = 0;

        while (flag) {
            System.out.print(message);
            String numberStr = scanner.nextLine().trim();

            if (numberStr.matches(REGEX_INTEGER)) {
                number = Integer.valueOf(numberStr);

                if (number >= min && number <= max) {
                    flag = false;
                } else {
                    System.out.println("Number out of range.");
                }
            } else {
                System.out.println("Invalid number.");
            }
        }
        return number;
    }

}
