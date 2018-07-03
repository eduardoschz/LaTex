/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.personas;

/**
 *
 * @author Valencia Rosas Ricardo Arturo
 */
public class Persona {
    private String nombre;
    private String paterno;
    private String nacionalidad;
    private int añoDeNacimiento;
    private float altura;


    public Persona() {
    }

    public Persona(String nombre, String paterno, String nacionalidad, int añoDeNacimiento, float altura) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.nacionalidad = nacionalidad;
        this.añoDeNacimiento = añoDeNacimiento;
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
    
        System.out.println("nombre:"+nombre+"\napellido:"+paterno+"\nnacionalidad:"+nacionalidad+"\nAño de nacimiento:"+añoDeNacimiento+"\naltura:"+altura);
    }
    
    
}
