/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author thienbd@gmail.com
 * <p>
 * </p>
 */
public class ValidateWithTryCatch {

    /**
     * Press any key to continue
     *
     * @return <code>true</code> if user want to continue "Y/y",
     * <code>false</code>
     */
    public static boolean checkContinue() {

        Scanner scanner = new Scanner(System.in);
        boolean check;
        while (true) {
            System.out.print("Do you want to continue? Y/N?: ");
            String c = scanner.nextLine();
            if ((c.equals("Y") == true) || (c.equals("y") == true)) {
                check = true;
                return check;
            } else if ((c.equals("N") == true) || (c.equals("n") == true)) {
                System.out.println("EXIT_SUCCESS");
                check = false;
                return check;
            } else {
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * The function to get an integer from the keyboard in console application
     *
     * @param mess : The <code>message</code>
     * @param max : maximum
     * @param min : minimum
     * @return an integer from keyboard
     */
    public static int getIntNumber(String mess, int min, int max) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(mess);
                String str = scanner.nextLine();
                int result = Integer.parseInt(str);
                if (result > max || result < min) {
                    System.out.println("Number out of range.");
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
    }

    /**
     * The function to get a double from the keyboard in console application
     *
     * @param mess : The <code>message</code>
     * @param max : maximum
     * @param min : minimum
     * @return a double from keyboard
     */
    public static double getDoubleNumber(String mess, double min, double max) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print(mess);
                String str = scanner.nextLine();
                double result = Double.parseDouble(str);
                if (result > max || result < min) {
                    System.out.println("Number out of range.");
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }
    }

}
