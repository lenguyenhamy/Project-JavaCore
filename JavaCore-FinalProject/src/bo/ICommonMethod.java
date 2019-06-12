/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import java.util.ArrayList;

/**
 *
 * @author anhdt45
 * @param <T>
 */
public interface ICommonMethod<T> {

    T input();

    boolean add(ArrayList<T> list, T obj);

    boolean update(ArrayList<T> list, String text);

    boolean delete(ArrayList<T> list, String text);

    ArrayList<T> search(ArrayList<T> list, String keyword, String type);

    void sort(ArrayList<T> list, String type);

    int getIndex(ArrayList<T> list, String text);

    void display(ArrayList<T> list);
}
