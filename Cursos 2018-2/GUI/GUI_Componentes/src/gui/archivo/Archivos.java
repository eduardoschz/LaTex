/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.archivo;

import gui.modelo.Persona;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author m01
 */
public class Archivos {

    public static void guardarArchivo_S(ArrayList datos) {
        if (datos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros", "Registros - FES Aragon", JOptionPane.INFORMATION_MESSAGE);
        } else {
            FileOutputStream fos = null;
            JFileChooser jfc = new JFileChooser();
            jfc.addChoosableFileFilter(new Filtro());
            try {
                jfc.setCurrentDirectory(new File(System.getProperty("user.dir") + File.pathSeparator + "Documents"));
                int a = jfc.showSaveDialog(null);
                if (a == JFileChooser.APPROVE_OPTION) {
                    File archivo = new File(jfc.getSelectedFile() + ".fes");

                    fos = new FileOutputStream(archivo);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (int i = 0; i < datos.size(); i++) {
                        oos.writeObject(datos.get(i));
                    }

                }

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

    public static ArrayList leerArchivo_S() {
        FileInputStream fis = null;
        JFileChooser jfc = new JFileChooser();
        jfc.addChoosableFileFilter(new Filtro());

        ArrayList<Object> datos = new ArrayList<>();

        try {
            jfc.setCurrentDirectory(new File(System.getProperty("user.dir") + File.pathSeparator + "Documents"));

            int a = jfc.showOpenDialog(null);

            if (a == JFileChooser.APPROVE_OPTION) {
                File archivo = new File(jfc.getSelectedFile() + "");
                fis = new FileInputStream(archivo);
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (fis.available() != 0) {
                    Persona p = (Persona) ois.readObject();
                    datos.add(p);
                }
            }

            //p = (Persona) ois.readObject();
            //System.out.println(p.toString());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return datos;
    }
}
