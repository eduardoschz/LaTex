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
public class Director extends Persona{
    private Integer peliculasDirigidas;
    private Integer premiosGanados;

    public Director(Integer peliculasDirigidas, Integer premiosGanados, String nombre, String paterno, String materno, String nacionalida, int anoDeNaacimiento, float altura) {
        super(nombre, paterno, materno, nacionalida, anoDeNaacimiento, altura);
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    public Director(Integer peliculasDirigidas, Integer premiosGanados) {
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    public Director() {
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); 
        System.out.println("peliculas dirigidas:"+this.peliculasDirigidas);
        System.out.println("premios ganados:"+this.premiosGanados);
    }

    
}
