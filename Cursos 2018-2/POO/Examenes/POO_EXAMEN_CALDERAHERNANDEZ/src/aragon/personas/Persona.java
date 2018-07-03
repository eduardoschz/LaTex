/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.personas;

/**
 *
 * @author Caldera Hernandez Andrea
 */
public class Persona {

    private String nombre;
    private String paterno;
    private String materno;
    private String nacionalidad;
    private int anioNacimiento;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, String paterno, String materno, String nacionalidad, int anioNacimiento, float altura) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "Apellido Paterno: " + paterno + "Apellido Materno: " + materno + "Nacionalidad: " + nacionalidad + "Anio de Nacimiento: "+anioNacimiento + "Altura: " + altura);
      }

}
