/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anhdt45
 * @param <T>
 */
public interface ICommonMethod<T> {

    T input();

    boolean add(ArrayList<T> paramArrayList, T paramT);

    boolean update(ArrayList<T> paramArrayList, String paramString);

    boolean delete(ArrayList<T> paramArrayList, String paramString);

    ArrayList<T> search(ArrayList<T> paramArrayList, String paramString1, String paramString2);

    void sort(ArrayList<T> paramArrayList, String paramString);

    int getIndex(ArrayList<T> paramArrayList, String paramString);

    void display(ArrayList<T> paramArrayList);
}
