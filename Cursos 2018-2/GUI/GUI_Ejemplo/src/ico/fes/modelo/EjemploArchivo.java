package ico.fes.modelo;

import java.io.File;

import javax.swing.JFileChooser;

public class EjemploArchivo {

    public static void main(String[] args) {
        File archivo = new File("");
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        archivo = jfc.getSelectedFile();
        System.out.println("Archivo:" + archivo.getName());
        System.out.println("Ruta:" + archivo.getAbsolutePath());
        System.out.println("Directorio?:" + archivo.isDirectory());
        System.out.println("Se puede escribir?:" + archivo.canWrite());
    }
}
