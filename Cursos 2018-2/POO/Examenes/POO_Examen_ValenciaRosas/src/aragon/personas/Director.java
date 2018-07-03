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
public class Director extends Persona{
    
    private Integer PeliculasDirigidas;
    private Integer PremiosGanados;

    public Director() {
    }
    
     

    public Director(Integer PeliculasDirigidas, Integer PremiosGanados) {
        this.PeliculasDirigidas = PeliculasDirigidas;
        this.PremiosGanados = PremiosGanados;
    }

    public Director(Integer PeliculasDirigidas, Integer PremiosGanados, String nombre, String paterno, String nacionalidad, int añoDeNacimiento, float altura) {
        super(nombre, paterno, nacionalidad, añoDeNacimiento, altura);
        this.PeliculasDirigidas = PeliculasDirigidas;
        this.PremiosGanados = PremiosGanados;
    }

    public Integer getPeliculasDirigidas() {
        return PeliculasDirigidas;
    }

    public void setPeliculasDirigidas(Integer PeliculasDirigidas) {
        this.PeliculasDirigidas = PeliculasDirigidas;
    }

    public Integer getPremiosGanados() {
        return PremiosGanados;
    }

    public void setPremiosGanados(Integer PremiosGanados) {
        this.PremiosGanados = PremiosGanados;
    }
    
    
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("peliculas dirigidas:"+PeliculasDirigidas+"\npremios ganados:"+PremiosGanados);
    
    }
    
    
    
    
}
