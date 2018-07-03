/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.persona;

/**
 *
 * @author PC-04
 */
public class Actor extends Persona{
    private String nombreArtistico;
    private int premiosGanados;
    private int anioDebut;

    public Actor() {
    }

    public Actor(String nombreArtistico, int premiosGanados, int anioDebut) {
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.anioDebut = anioDebut;
    }

    public Actor(String nombreArtistico, int premiosGanados, int anioDebut, String nombre, String paterno, String materno, String nacionalidad, int anioDeNacimiento, float altura) {
        super(nombre, paterno, materno, nacionalidad, anioDeNacimiento, altura);
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.anioDebut = anioDebut;
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

    public int getAnioDebut() {
        return anioDebut;
    }

    public void setAnioDebut(int anioDebut) {
        this.anioDebut = anioDebut;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Nombre artistico: " +nombreArtistico);
        System.out.println("Premios ganados: "+premiosGanados );
        System.out.println("Año debut: "+anioDebut);
    }
    
    
}
