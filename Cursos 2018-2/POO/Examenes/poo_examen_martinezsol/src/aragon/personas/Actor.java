/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.personas;

/**
 *
 * @author ESCUELA CEAPAC
 */
public class Actor extends Persona{
    private String nombreArtistico;
    private int premiosGanados;
    private int anoDebut;

    public Actor(String nombreArtistico, int premiosGanados, int anoDebut, String nombre, String paterno, String materno, String nacionalida, int anoDeNaacimiento, float altura) {
        super(nombre, paterno, materno, nacionalida, anoDeNaacimiento, altura);
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.anoDebut = anoDebut;
    }

    public Actor(String nombreArtistico, int premiosGanados, int anoDebut) {
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.anoDebut = anoDebut;
    }

    public Actor() {
    }


    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("nombre artistico:"+this.nombreArtistico);
        System.out.println("premios ganados:"+this.premiosGanados);
        System.out.println("año debut:"+this.anoDebut);
    } 
}
