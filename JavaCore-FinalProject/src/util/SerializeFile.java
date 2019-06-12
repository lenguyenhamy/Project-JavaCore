/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Shado
 */
public class SerializeFile {

    public static boolean writeDataToFile(Object data, String path) {

        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace(System.out);
            }
        }

        try (FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(data);
            return true;
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        return false;
    }

    public static Object readDataFromFile(String path) {

        try (FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Object data;
            data = ois.readObject();
            return data;
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace(System.err);
        }
        return null;
    }
}
