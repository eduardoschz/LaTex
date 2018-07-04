package ico.fes.modelo;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArchivoPersona {

    private File file;
    private String archivo;

    public ArchivoPersona() {
        // TODO Auto-generated constructor stub
    }

    public ArchivoPersona(File file, String archivo) {
        super();
        this.file = file;
        this.archivo = archivo;
    }

    public ArchivoPersona(String archivo) {
        super();
        this.archivo = archivo;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void guardarPersonas(ArrayList<Persona> personas) {
        try {
            ObjectOutputStream fSalida
                    = new ObjectOutputStream(new FileOutputStream(archivo));
            for (Persona persona : personas) {
                fSalida.writeObject(persona);
            }
            fSalida.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public ArrayList<Persona> leerPersonas() {
        ArrayList<Persona> listaRes = new ArrayList<Persona>();
        try {
            ObjectInputStream fLectura
                    = new ObjectInputStream(new FileInputStream(archivo));
            Object tmp = fLectura.readObject();
            while (tmp != null) {
                if (tmp instanceof Persona) {
                    listaRes.add((Persona) tmp);
                    tmp = fLectura.readObject();
                }
            }
        } catch (EOFException eofe) {
            System.out.println("Fina de archivo!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaRes;
    }

    public static void main(String[] args) {
        ArchivoPersona ap = new ArchivoPersona();
        ap.setArchivo("personas.dat");
        ArrayList<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona("Jesus", "Hernandez", "Cabrera", 18));
        lista.add(new Persona("Pedro", "Venegas", "Herrera", 22));
        lista.add(new Persona("Diana", "Hernandez", "Bonilla", 19));
        lista.add(new Persona("Juan", "Arriola", "Leon", 30));

        ap.guardarPersonas(lista);
        ArrayList<Persona> resultado = ap.leerPersonas();
        for (Persona persona : resultado) {
            System.out.println("Nombre:" + persona.getNombre());
        }
    }

}
