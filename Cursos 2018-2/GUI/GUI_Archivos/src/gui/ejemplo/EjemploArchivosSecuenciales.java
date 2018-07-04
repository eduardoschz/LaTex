/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ejemplo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class EjemploArchivosSecuenciales {

    public static void main(String[] args) {

        try {
            File archivo = new File("archivo2.txt");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i <= 10; i++) {
                bw.write("Escribiendo en el archivo #" + i);
                bw.newLine();
            }
            bw.close();
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
