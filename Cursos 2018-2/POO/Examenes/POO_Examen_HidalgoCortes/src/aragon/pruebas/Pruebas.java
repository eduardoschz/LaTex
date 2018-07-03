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
 * @author M38
 */
public class Pruebas extends Pelicula {

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("Un dia gris", 2016, 02,
                new Actor("Maryn", 8, 2004, "Laura", "Gonzales", "Garcia", "Mexicana", 1995, 1.75f),
                new Actor("Mat", 2, 2007, "Mateo", "Pozos", "Riquelme", "Chilena", 1997, 1.86f),
                new Director(5, 5, "Alexander", "De la cruz", "Sanchez", "Mexicana", 1985, 1.81f),
                new Genero("Drama", "Historia de un triangulo amoroso con toques tragicos"));
        pelicula1.mostrarInfo();

        Pelicula pelicula3 = new Pelicula("El delfin que hacia:***", 2012, 04,
                new Actor("el rayo", 2, 2002, "Pierre", "Balzar", "Gomez", "Autraliana", 1990, 1.85f),
                new Actor("Da Queen", 4, 1992, "Magdalena", "Castillo", "Perez", "Española", 2014, 1.69f),
                new Director(12, 8, "Juan", "rulfo", "Perea", "Mexicana", 1972, 1.80f),
                new Genero("Comedia", "Un Delfin sad buscaa venganza contra los humanos"));

        pelicula3.mostrarInfo();

        Pelicula pelicula2 = new Pelicula("pokimones", 2019, 01,
                new Actor("canicas", 0, 2015, "roberto", "blanco", "blanco", "Mexicana", 1997, 1.95f),
                new Actor("Master", 3, 1998, "Manuel", "Benatia", "Perez", "Española", 2014, 1.89f),
                new Director(5, 0, "romario", "estrada", "leon", "argentina", 1990, 1.70f),
                new Genero("Accion", "peleas epicas entre pokimones :b"));

        pelicula2.mostrarInfo();

    }
}
