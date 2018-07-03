/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.personas;

/**
 *
 * @author M48
 */
public class Actor extends Persona{
    
    private String nombreArtistico;
    private int premiosGanados;
    private int añoDebut;

    public Actor() {
    }

    public Actor(String nombreArtistico, int premiosGanados, int añoDebut) {
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.añoDebut = añoDebut;
    }

    public Actor(String nombreArtistico, int premiosGanados, int añoDebut, String nombre, String paterno, String materno, String nacionalidad, int añoDeNacimiento, float altura) {
        super(nombre, paterno, materno, nacionalidad, añoDeNacimiento, altura);
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.añoDebut = añoDebut;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public int getPremiosGanados() {
        return premiosGanados;
    }

    public void setPremiosGanados(int premiosGanados) {
        this.premiosGanados = premiosGanados;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nombre Artistico: "+this.nombreArtistico);
        System.out.println("Premios Ganados"+ this.premiosGanados);
    }
    
    
    
}
