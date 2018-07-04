/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.serializable;

import java.io.Serializable;

/**
 *
 * @author m01
 */
public class Persona implements Serializable {

    private int edad;
    private String nombre;
    private String apellido;
    private String correo;

    public Persona() {
    }

    public Persona(int edad, String nombre, String apellido, String correo) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Edad: " + this.edad
                + "; Nombre: " + this.nombre
                + "; Apellido: " + this.apellido
                + "; Correo: " + this.correo;
    }

}
