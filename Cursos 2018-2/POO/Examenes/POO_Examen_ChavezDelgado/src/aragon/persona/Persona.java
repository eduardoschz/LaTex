/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.persona;

/**
 *
 * @author Chavez Delgado Ana Laura
 */
public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private String nacionalidad;
    private int anioDeNacimiento;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, String paterno, String materno, String nacionalidad, int anioDeNacimiento, float altura) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacionalidad = nacionalidad;
        this.anioDeNacimiento = anioDeNacimiento;
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

    public int getAnioDeNacimiento() {
        return anioDeNacimiento;
    }

    public void setAnioDeNacimiento(int anioDeNacimiento) {
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
    public void MostrarInfo(){
        System.out.println("Nombre: " +nombre);
        System.out.println("Apellido paterno y materno: "+paterno+" "+materno);
        System.out.println("Nacionalidad: "+nacionalidad);
        System.out.println("Año de nacimiento: " +anioDeNacimiento);
        System.out.println("Altura: "+altura +" cm");
    }
    
}
