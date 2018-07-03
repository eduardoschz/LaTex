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
public class Director extends Persona{
   private Integer peliculasDirigidas, premiosGanados;

    public Director() {
    }

    public Director(Integer peliculasDirigidas, Integer premiosGanados) {
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    public Director(Integer peliculasDirigidas, Integer premiosGanados, String nombre, String paterno, String materno, String nacionalidad, int añoDENacimiento, float altura) {
        super(nombre, paterno, materno, nacionalidad, añoDENacimiento, altura);
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Peliculas dirgidas: "+ peliculasDirigidas + "\nPremios ganados: "+premiosGanados);
    }
   
    
}
