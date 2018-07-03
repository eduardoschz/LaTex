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
public class Actor extends Persona{
    private  String nombreArtistico;
    private int premiosGanados;
    private int añoDebut;

    public Actor() {
    }

    public Actor(String nombreArtistico, int premiosGanados, int añoDebut) {
        this.nombreArtistico = nombreArtistico;
        this.premiosGanados = premiosGanados;
        this.añoDebut = añoDebut;
    }

    public Actor(String nombreArtistico, int premiosGanados, int añoDebut, String nombre, String paterno, String nacionalidad, int añoDeNacimiento, float altura) {
        super(nombre, paterno, nacionalidad, añoDeNacimiento, altura);
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
    public void mostrarInfo(){
        
        super.mostrarInfo();
    
        System.out.println("nombre artistico:"+this.getNombreArtistico()+"\npremios ganados:"+premiosGanados+"año de debut:"+añoDebut);
    
    
    }
}
