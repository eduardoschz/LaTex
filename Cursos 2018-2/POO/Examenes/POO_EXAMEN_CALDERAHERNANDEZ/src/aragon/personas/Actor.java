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
public class Actor extends Persona {

    private String nombreArtistico;
    private int premiosganados;
    private int anioDebut;

    public Actor() {
    }

    public Actor(String nombreArtistico, int premiosganados, int anioDebut) {
        this.nombreArtistico = nombreArtistico;
        this.premiosganados = premiosganados;
        this.anioDebut = anioDebut;
    }

    public Actor(String nombreArtistico, int premiosganados, int anioDebut, String nombre, String paterno, String materno, String nacionalidad, int anioNacimiento, float altura) {
        super(nombre, paterno, materno, nacionalidad, anioNacimiento, altura);
        this.nombreArtistico = nombreArtistico;
        this.premiosganados = premiosganados;
        this.anioDebut = anioDebut;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public int getPremiosganados() {
        return premiosganados;
    }

    public void setPremiosganados(int premiosganados) {
        this.premiosganados = premiosganados;
    }

    public int getAnioDebut() {
        return anioDebut;
    }

    public void setAnioDebut(int anioDebut) {
        this.anioDebut = anioDebut;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Nombre Artistico : " +nombreArtistico + "Premios Ganados: " + premiosganados + "Anio Debut: "+anioDebut);
    }

}
