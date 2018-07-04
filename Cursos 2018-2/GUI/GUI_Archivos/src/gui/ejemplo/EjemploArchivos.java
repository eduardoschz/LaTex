/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ejemplo;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class EjemploArchivos {
    
    public static void main(String[] args) {
        
        File archivo = new File("archivo.txt");
        System.out.println("El nombre del archivo es: " + archivo.getName());
        System.out.println("La ruta del archivo es: " + archivo.getAbsolutePath());
    
        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo fue creado");
            } else {
                System.out.println("El archivo NO fue creado");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Es directorio? " + archivo.isDirectory());
        System.out.println("Es archivo? " + archivo.isFile());
        System.out.println("Fecha de modificiación: " + archivo.lastModified());
        Date fecha = new Date(archivo.lastModified());
        System.out.println("Fecha de modificación: " + fecha.toString());
        System.out.println("Tamaño: " + archivo.length() + "b");
        
    }
    
}
