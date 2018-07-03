/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.personas;

/**
 *
 * @author M35
 */
public class Persona {
    private String nombre, paterno, materno, nacionalidad;
    private int añoDENacimiento;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, String paterno, String materno, String nacionalidad, int añoDENacimiento, float altura) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacionalidad = nacionalidad;
        this.añoDENacimiento = añoDENacimiento;
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

    public int getAñoDENacimiento() {
        return añoDENacimiento;
    }

    public void setAñoDENacimiento(int añoDENacimiento) {
        this.añoDENacimiento = añoDENacimiento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void mostrarInformacion(){
        System.out.println("nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno + ", nacionalidad=" + nacionalidad + ", a\u00f1oDENacimiento=" + añoDENacimiento + ", altura=" + altura);
    }

  
            
    
}
