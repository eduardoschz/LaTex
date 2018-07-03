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
public class Director extends Persona{
    private Integer peliculasDirigidas;
    private Integer premiosGanados;

    public Director(Integer peliculasDirigidas, Integer premiosGanados, String nombre, String paterno, String materno, String nacionalidad, int añoDeNacimiento, float altura) {
        super(nombre, paterno, materno, nacionalidad, añoDeNacimiento, altura);
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    public Director(Integer peliculasDirigidas, Integer premiosGanados) {
        this.peliculasDirigidas = peliculasDirigidas;
        this.premiosGanados = premiosGanados;
    }

    public Director() {
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
    public void mostrarInfo(){
    super.mostrarInfo();
        System.out.println("Peliculas Dririguiads:"+this.peliculasDirigidas);
        System.out.println("Premioss Ganados:"+this.premiosGanados);
   }
    
    
    
}
