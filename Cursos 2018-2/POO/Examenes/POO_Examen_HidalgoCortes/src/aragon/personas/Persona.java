/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.personas;

/**
 *
 * @author M38
 */
public class Persona {
    
    private String nombre;
    private String paterno;
    private String materno;
    private String nacionalidad;
    private int añoDeNacimiento;
    private float altura;

    public Persona(String nombre, String paterno, String materno, String nacionalidad, int añoDeNacimiento, float altura) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacionalidad = nacionalidad;
        this.añoDeNacimiento = añoDeNacimiento;
        this.altura = altura;
    }

    public Persona() {
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

    public int getAñoDeNacimiento() {
        return añoDeNacimiento;
    }

    public void setAñoDeNacimiento(int añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre:"+this.nombre);
        System.out.println("Apellido Paterno:"+this.paterno);
        System.out.println("Apellido Materno:"+this.materno);
        System.out.println("Nacionalidad:"+this.nacionalidad);
        System.out.println("Año de nacimiento::"+this.añoDeNacimiento);
        System.out.println("Estatura Mtr.:"+this.altura);
        
        
    
    }
    
    
}
