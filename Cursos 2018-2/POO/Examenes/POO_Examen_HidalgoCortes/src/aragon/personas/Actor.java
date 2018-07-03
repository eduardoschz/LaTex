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
public class Actor extends Persona{
    private String nombreArtistico;
    private int premiosGanados;
    private int añoDeDebut;

    public Actor(String nombreArtistico, int premiosGanados, int añoDeDebut, String nombre, String paterno, String materno, String nacionalidad, int añoDeNacimiento, float altura) {
        super(nombre, paterno, materno, nacionalidad, añoDeNacimiento, altura);
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.añoDeDebut = añoDeDebut;
    }

    public Actor(String nombreArtistico, int premiosGanados, int añoDeDebut) {
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.añoDeDebut = añoDeDebut;
    }

    public Actor() {
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

    public int getAñoDeDebut() {
        return añoDeDebut;
    }

    public void setAñoDeDebut(int añoDeDebut) {
        this.añoDeDebut = añoDeDebut;
    }
    
    @Override
    public void mostrarInfo(){
    super.mostrarInfo();
        System.out.println("Nombre Artistico:"+this.nombreArtistico);
        System.out.println("Premios ganados:"+this.premiosGanados);
        System.out.println("Año de debut:"+this.añoDeDebut);
        
    
    }
    
}
