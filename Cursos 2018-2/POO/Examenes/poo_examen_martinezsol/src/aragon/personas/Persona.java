/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.personas;

/**
 *
 * @author MARTINEZ SOL AXEL
 */
public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private String nacionalida;
    private int anoDeNaacimiento;
    private float altura;

    public Persona(String nombre, String paterno, String materno, String nacionalida, int anoDeNaacimiento, float altura) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacionalida = nacionalida;
        this.anoDeNaacimiento = anoDeNaacimiento;
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

    public String getNacionalida() {
        return nacionalida;
    }

    public void setNacionalida(String nacionalida) {
        this.nacionalida = nacionalida;
    }

    public int getAnoDeNaacimiento() {
        return anoDeNaacimiento;
    }

    public void setAnoDeNaacimiento(int anoDeNaacimiento) {
        this.anoDeNaacimiento = anoDeNaacimiento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void mostrarInfo(){
        System.out.println("nombre:"+this.nombre);
        System.out.println("paterno:"+this.paterno);
        System.out.println("materno:"+this.materno);
        System.out.println("año de nacimiento:"+this.anoDeNaacimiento);
        System.out.println("altura:"+this.altura);
        
    }
}
