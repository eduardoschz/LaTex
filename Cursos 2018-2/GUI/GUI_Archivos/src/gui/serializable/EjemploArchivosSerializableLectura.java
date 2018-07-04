/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m01
 */
public class EjemploArchivosSerializableLectura {

    public static void main(String[] args) {
        Persona p;
        FileInputStream fis = null;
        try {
            File archivo = new File("archivoSerializable.txt");
            fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Persona) ois.readObject();
            System.out.println(p.toString());;
            p = (Persona) ois.readObject();
            System.out.println(p.toString());;
            p = (Persona) ois.readObject();
            System.out.println(p.toString());;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjemploArchivosSerializableLectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(EjemploArchivosSerializableLectura.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EjemploArchivosSerializableLectura.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(EjemploArchivosSerializableLectura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
