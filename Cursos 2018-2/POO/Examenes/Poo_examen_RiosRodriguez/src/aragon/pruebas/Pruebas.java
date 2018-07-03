/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.pruebas;

import aragon.conceptos.Genero;
import aragon.conceptos.Pelicula;
import aragon.personas.Actor;
import aragon.personas.Director;

/**
 *
 * @author M48
 */
public class Pruebas {
    public Pelicula pelicula1;
    public Pelicula pelicula2;
    public Pelicula pelicula3;

    public Pruebas() {
    }

    public Pruebas(Pelicula pelicula1, Pelicula pelicula2, Pelicula pelicula3) {
        this.pelicula1 = pelicula1;
        this.pelicula2 = pelicula2;
        this.pelicula3 = pelicula3;
    }

    public Pelicula getPelicula1() {
        return pelicula1;
    }

    public void setPelicula1(Pelicula pelicula1) {
        this.pelicula1 = pelicula1;
    }

    public Pelicula getPelicula2() {
        return pelicula2;
    }

    public void setPelicula2(Pelicula pelicula2) {
        this.pelicula2 = pelicula2;
    }

    public Pelicula getPelicula3() {
        return pelicula3;
    }

    public void setPelicula3(Pelicula pelicula3) {
        this.pelicula3 = pelicula3;
    }
    
    public static void main(String[] args) {
        
        Pelicula peli1= new Pelicula("Super Man ",2015,1152015, new Actor("Carlos", 3, 2006, "Carlos", "Perez", "Sanchez", "Mexicana", 1992, 1.80f), new Actor("Carlos", 3, 2006, "Carlos", "Perez", "Sanchez", "Mexicana", 1992, 1.80f),new Director(10, 5, "Juan", "Perez","Herrera", "Mexicana", 1975, 1.65f) , new Genero("Accion", "Mucha Accion"));
        Pelicula peli2= new Pelicula("Super Man ",2015,1152015, new Actor("Carlos", 3, 2006, "Carlos", "Perez", "Sanchez", "Mexicana", 1992, 1.80f), new Actor("Carlos", 3, 2006, "Carlos", "Perez", "Sanchez", "Mexicana", 1992, 1.80f),new Director(10, 5, "Juan", "Perez","Herrera", "Mexicana", 1975, 1.65f) , new Genero("Accion", "Mucha Accion"));
        Pelicula peli3= new Pelicula("Super Man ",2015,1152015, new Actor("Carlos", 3, 2006, "Carlos", "Perez", "Sanchez", "Mexicana", 1992, 1.80f), new Actor("Carlos", 3, 2006, "Carlos", "Perez", "Sanchez", "Mexicana", 1992, 1.80f),new Director(10, 5, "Juan", "Perez","Herrera", "Mexicana", 1975, 1.65f) , new Genero("Accion", "Mucha Accion"));
        
        Pruebas p1 = new Pruebas(peli1, peli2, peli3);
        
        p1.getPelicula1().mostrarInfo();
        p1.getPelicula2().mostrarInfo();
        p1.getPelicula3().mostrarInfo();
                
    
    }
    
}
