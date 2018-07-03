/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.pruebas;

import aragon.conceptos.Genero;
import aragon.conceptos.Pelicula;
import aragon.persona.Actor;
import aragon.persona.Director;

/**
 *
 * @author PC-04
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula pelicula1;
        Pelicula pelicula2;
        Pelicula pelicula3;
        
        Actor protagonista;
        protagonista= new Actor("Spiderman", 7, 2014, "Tom", "Holland", "jr.", "Americana", 1991, 1.96f);
        Actor coProtagonista;
        coProtagonista= new Actor("Emma ", 12, 2016, "Emma", "Stone", "Watson", "Inglesa", 1994, 1.68f);
        Director dir;
        dir= new Director(30, 15, "Guillermo", "Del Toro", "Jr.", "Mexicana", 1970, 1.85f);
        Genero genero;
        genero= new Genero("Accion", "Spiderman vs los 6 siniestros");
        
        pelicula1= new Pelicula("Spider-man", 2020, 150220, protagonista, coProtagonista, dir, genero);
        
        Actor protagonista2;
        protagonista2= new Actor("Iron Man", 8, 2000, "Robert", "Downey", "jr.", "Americana", 1981, 1.80f);
        Actor coProtagonista2;
        coProtagonista2= new Actor("Capitan genial ", 9, 1998, "Chris", "Evans", "jr.", "Canadiense", 1984, 1.88f);
        Director dir2;
        dir2= new Director(30, 15, "Michel", "Bay", "Jr.", "Americana", 1970, 1.85f);
        Genero genero2;
        genero2= new Genero("Accion", "Civil war 2");
        
        pelicula2= new Pelicula("CIvil War 2", 2025, 150225, protagonista2, coProtagonista2, dir2, genero2);
        
        Actor protagonista3;
        protagonista3= new Actor("No tiene nombre artistico", 0, 1987, "Son", "Goku", "", "Japonesa", 1987, 1.87f);
        Actor coProtagonista3;
        coProtagonista3= new Actor("No tiene ", 0, 1990, "Vegeta", "Principe ", "De los Saiyajins", "Japonesa", 1987, 1.75f);
        Director dir3;
        dir3= new Director(10, 1, "Akira", "Toriyama", "", "Japonesa", 1980, 1.85f);
        Genero genero3;
        genero3= new Genero("Anime", "Los guerreros Z vs Cell");
        
        pelicula3= new Pelicula("Dragon Ball Z: la resureccion de Cell", 2020, 150220, protagonista3, coProtagonista3, dir3, genero3);
    
        pelicula1.mostrarinfo();
        pelicula2.mostrarinfo();
        pelicula3.mostrarinfo();
        
      
    }
    
}
