/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Student;
import java.util.ArrayList;
import java.util.Scanner;
import model.StudentModel;
import util.SerializeFile;

/**
 *
 * @author anhdt45
 */
public class StudentMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StudentModel studentModel = new StudentModel();
        SerializeFile serializeFile = new SerializeFile();
        ArrayList<Student> list = new ArrayList<>();

        // start loop menu
        process:
        do {
            // menu student
            System.out.println("");
            System.out.println("- - STUDENTS MANAGEMENT - -");
            System.out.println("1. Input data");
            System.out.println("2. Add new student");
            System.out.println("3. Update student");
            System.out.println("4. Delete student");
            System.out.println("5. Search student");
            System.out.println("6. Sort list student");
            System.out.println("7. Display list student");
            System.out.println("8. Save new list");
            System.out.println("9. Exit");
            System.out.print("You choose: ");
            int choose = Integer.valueOf(scan.nextLine().trim());

            System.out.println("- - - - - - - - - - - - - -");

            int flat;
            String rollNumber;
            String name;
            String mark;

            switch (choose) {
                case 1:
                    System.out.println("1. Add new list student");
                    System.out.println("2. Load file");
                    System.out.print("You choose: ");
                    flat = Integer.valueOf(scan.nextLine().trim());

                    System.out.println("- - - - - - - - - - - - - -");
                    if (flat == 1) {
                        System.out.println("Add new list success!!!");
                    } else {
                        System.out.print("Enter file name: ");
                        String fileName = scan.nextLine().trim();

                        list = (ArrayList<Student>) serializeFile.readDataFromFile(fileName);
                        if (list != null) {
                            System.out.println("Load data success!");
                        } else {
                            System.out.println("Load data failed. Try again!");
                        }
                    }
                    break;
                case 2:
                    if (studentModel.add(list, studentModel.input())) {
                        System.out.println("Add new student success!");
                    } else {
                        System.out.println("Duplicate roll number. Please try again.");
                    }
                    break;
                case 3:
                    System.out.print("Enter roll number: ");
                    rollNumber = scan.nextLine().trim();

                    if (studentModel.update(list, rollNumber)) {
                        System.out.println("Update student success!");
                    } else {
                        System.out.println("Not found roll number of student. Please try again.");
                    }
                    break;
                case 4:
                    System.out.print("Enter roll number: ");
                    rollNumber = scan.nextLine().trim();

                    if (studentModel.delete(list, rollNumber)) {
                        System.out.println("Delete student success!");
                    } else {
                        System.out.println("Not found roll number of student. Please try again.");
                    }
                    break;
                case 5:
                    System.out.println("1. Search by roll number");
                    System.out.println("2. Search by name");
                    System.out.println("3. Search by mark");
                    System.out.print("You choose: ");
                    flat = Integer.valueOf(scan.nextLine().trim());

                    ArrayList<Student> listResult;
                    System.out.println("- - - - - - - - - - - - - -");
                    switch (flat) {
                        case 1:
                            System.out.print("Enter roll number: ");
                            rollNumber = scan.nextLine().trim();
                            listResult = studentModel.search(list, rollNumber, "rollNumber");
                            System.out.println("Found " + listResult.size() + " results for keywords \"" + rollNumber + "\".\n");
                            studentModel.display(listResult);
                            break;
                        case 2:
                            System.out.print("Enter name: ");
                            name = scan.nextLine().trim();
                            listResult = studentModel.search(list, name, "name");
                            System.out.println("Found " + listResult.size() + " results for keywords \"" + name + "\".\n");
                            studentModel.display(listResult);
                            break;
                        default:
                            System.out.print("Enter mark: ");
                            mark = scan.nextLine().trim();
                            listResult = studentModel.search(list, mark, "mark");
                            System.out.println("Found " + listResult.size() + " results for keywords \"" + mark + "\".\n");
                            studentModel.display(listResult);
                            break;
                    }
                    break;
                case 6:
                    System.out.println("1. Search by roll number");
                    System.out.println("2. Search by name");
                    System.out.println("3. Search by mark");
                    System.out.print("You choose: ");
                    flat = Integer.valueOf(scan.nextLine().trim());

                    System.out.println("- - - - - - - - - - - - - -");
                    switch (flat) {
                        case 1:
                            studentModel.sort(list, "rollNumber");
                            System.out.println("List after sort: \n");
                            studentModel.display(list);
                            break;
                        case 2:
                            studentModel.sort(list, "name");
                            System.out.println("List after sort: \n");
                            studentModel.display(list);
                            break;
                        default:
                            studentModel.sort(list, "mark");
                            System.out.println("List after sort: \n");
                            studentModel.display(list);
                            break;
                    }
                    break;
                case 7:
                    System.out.println("List student:");
                    studentModel.display(list);
                    break;
                case 8:
                    System.out.print("Enter new file name: ");
                    String fileName = scan.nextLine().trim();
                    if (serializeFile.writeDataToFile(list, fileName)) {
                        System.out.println("Save data to file success!");
                    }
                    break;
                case 9:
                    break process;
                default:
                    System.out.println("Only select [1-9]. Please try again.\n");
                    break;
            }
            System.out.println("- - - - - - - - - - - - - -");
        } while (true);
    }
}