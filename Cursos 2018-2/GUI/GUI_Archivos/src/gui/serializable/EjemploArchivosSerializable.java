/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.serializable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m01
 */
public class EjemploArchivosSerializable {

    public static void main(String[] args) {
        Persona p;
        FileOutputStream fos = null;
        try {
            File archivo = new File("archivoSerializable.txt");
            fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            p = new Persona(20, "Juanito", "Banana", "juanito@unam.mx");
            oos.writeObject(p); //Escribir el objeto en el archivo
            p = new Persona(33, "Lorena", "Medina", "lore@eslibertad.com");
            oos.writeObject(p);
            p = new Persona(41, "Birgit", "Lamn", "birgit@naumman.gr");
            oos.writeObject(p);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
}
