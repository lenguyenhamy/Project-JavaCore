/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import entity.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import util.ValidateHelper;

/**
 *
 * @author anhdt45
 */
public class StudentBO implements ICommonMethod<Student> {

    @Override
    public Student input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine().trim();
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter gender: ");
        boolean gender = Boolean.valueOf(scanner.nextLine().trim());
        double mark = ValidateHelper.getDouble("Enter mark: ");

        return new Student(rollNumber, mark, name, gender);
    }

    @Override
    public boolean add(ArrayList<Student> list, Student obj) {
        int index = getIndex(list, obj.getRollNumber());
        if (index < 0) {
            return list.add(obj);
        }
        return false;
    }

    @Override
    public boolean update(ArrayList<Student> list, String rollNumber) {
        int index = getIndex(list, rollNumber);
        if (index >= 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter name: ");
            list.get(index).setName(scanner.nextLine().trim());
            System.out.print("Enter gender: ");
            list.get(index).setGender(Boolean.valueOf(scanner.nextLine().trim()));
            System.out.print("Enter mark: ");
            list.get(index).setMark(Double.valueOf(scanner.nextLine().trim()));
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(ArrayList<Student> list, String rollNumber) {
        int index = getIndex(list, rollNumber);
        if (index >= 0) {
            Student s = list.remove(index);
            if (s != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Student> search(ArrayList<Student> list, String keyword, String type) {
        ArrayList<Student> listResult = new ArrayList<>();
        if (type.equalsIgnoreCase("rollNumber")) {
            for (Student student : list) {
                if (student.getRollNumber().toLowerCase().contains(keyword.toLowerCase())) {
                    listResult.add(student);
                }
            }
        } else if (type.equalsIgnoreCase("name")) {
            for (Student student : list) {
                if (student.getName().toLowerCase().contains(keyword.toLowerCase())) {
                    listResult.add(student);
                }
            }
        } else {
            for (Student student : list) {
                if (student.getMark() == Double.valueOf(keyword)) {
                    listResult.add(student);
                }
            }
        }
        return listResult;
    }

    @Override
    public void sort(ArrayList<Student> list, String type) {
        if (type.equalsIgnoreCase("rollNumber")) {
            list.sort(Comparator.comparing(Student::getRollNumber));
        } else if (type.equalsIgnoreCase("name")) {
            list.sort(Comparator.comparing(Student::getName));
        } else {
            list.sort(Comparator.comparing(Student::getMark));
        }
    }

    @Override
    public int getIndex(ArrayList<Student> list, String rollNumber) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getRollNumber().equalsIgnoreCase(rollNumber.trim())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void display(ArrayList<Student> list) {
        list.forEach(student -> System.out.println(student.display()));
    }
}
