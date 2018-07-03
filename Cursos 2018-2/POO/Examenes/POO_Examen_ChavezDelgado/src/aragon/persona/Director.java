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
public class Director extends Persona{
    private Integer peliculasDirigidas;
    private Integer premiosGanados;

    public Director() {
    }

    public Director(Integer peliculasDirigidas, Integer premiosGanados) {
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    public Director(Integer peliculasDirigidas, Integer premiosGanados, String nombre, String paterno, String materno, String nacionalidad, int anioDeNacimiento, float altura) {
        super(nombre, paterno, materno, nacionalidad, anioDeNacimiento, altura);
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    public Integer getPeliculasDirigidas() {
        return peliculasDirigidas;
    }

    public void setPeliculasDirigidas(Integer peliculasDirigidas) {
        this.peliculasDirigidas = peliculasDirigidas;
    }

    public Integer getPremiosGanados() {
        return premiosGanados;
    }

    public void setPremiosGanados(Integer premiosGanados) {
        this.premiosGanados = premiosGanados;
    }

    @Override
    public void MostrarInfo() {
        super.MostrarInfo();
        System.out.println("Peliculas digidas: "+peliculasDirigidas);
        System.out.println("Premios ganados: " +premiosGanados);
    }
    
    
}
