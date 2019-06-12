/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author anhdt45
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("- - - MENU MANAGEMENT - - -");
            System.out.println("- 1. Staff                -");
            System.out.println("- 2. Student              -");
            System.out.println("- 3. Exit                 -");
            System.out.println("- - - - - - - - - - - - - -");
            System.out.print("You choose: ");
            int choose = Integer.valueOf(scan.nextLine());

            System.out.println("- - - - - - - - - - - - - -");
            switch (choose) {
                case 1:
                    System.out.println("Select 1");
                    continue;
                case 2:
                    //StudentMain.main(args);
                    continue;
                case 3:
                    break;
            }
            System.out.println("Only select [1-3]. Please try again.\n");
        }
    }
}
