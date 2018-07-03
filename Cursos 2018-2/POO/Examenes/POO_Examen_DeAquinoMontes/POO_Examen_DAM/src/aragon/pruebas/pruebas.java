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
 * @author M35
 */
public class pruebas {
    private Pelicula pelicula, pelicula2, pelicula3;

    public pruebas() {
    }

    public pruebas(Pelicula pelicula, Pelicula pelicula2, Pelicula pelicula3) {
        this.pelicula = pelicula;
        this.pelicula2 = pelicula2;
        this.pelicula3 = pelicula3;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
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
       
        Pelicula peli1 = new Pelicula("Los increibles", 2018, 06-03-2018, 
                new Actor("Luismi", 2, 2005, "Ricky", "Rickin", "Canayin", "MEXICANA", 1978, 180), 
                new Actor("chetos", 0, 2000, "Alex", "Rios", "Rodriguez", "MEXICANA", 1997, 185),  
                new Director(23, 10, "Gillermo", "del", "Toro", "Mexicana", 1980, 185), 
                new Genero("Comedia/Animada", "Una divertida historia de una familia de super heroes"));
        Pelicula peli2 = new Pelicula("\n \nLos increibles", 2018, 06-03-2018, 
                new Actor("Luismi", 2, 2005, "Ricky", "Rickin", "Canayin", "MEXICANA", 1978, 180), 
                new Actor("chetos", 0, 2000, "Alex", "Rios", "Rodriguez", "MEXICANA", 1997, 185),  
                new Director(23, 10, "Gillermo", "del", "Toro", "Mexicana", 1980, 185), 
                new Genero("Comedia/Animada", "Una divertida historia de una familia de super heroes"));
        Pelicula peli3 = new Pelicula("\n \nLos increibles", 2018, 06-03-2018, 
                new Actor("Luismi", 2, 2005, "Ricky", "Rickin", "Canayin", "MEXICANA", 1978, 180), 
                new Actor("chetos", 0, 2000, "Alex", "Rios", "Rodriguez", "MEXICANA", 1997, 185),  
                new Director(23, 10, "Gillermo", "del", "Toro", "Mexicana", 1980, 185), 
                new Genero("Comedia/Animada", "Una divertida historia de una familia de super heroes"));
        
        pruebas prueba1 = new pruebas(peli3, peli2, peli3);
        prueba1.getPelicula().mostrarInfo();
         prueba1.getPelicula2().mostrarInfo();
          prueba1.getPelicula3().mostrarInfo();
        
    }
    
}
