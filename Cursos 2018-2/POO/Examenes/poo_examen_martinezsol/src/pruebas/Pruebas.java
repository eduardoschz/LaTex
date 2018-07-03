/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import aragon.personas.Actor;
import aragon.personas.Director;
import aragon.personas.Persona;
import conceptos.Genero;
import conceptos.Pelicula;

/**
 *
 * @author MARTINEZ SOL AXEL
 */
public class Pruebas {



    public static void main(String[] args) {
        
      
       //Director d=new Director(22, 7);
       //Actor a=new Actor("iavana baquero", 2, 2003);
       //Genero g=new Genero("el laberinto del fauno", "ss");
       Pelicula pe1=new Pelicula("el laberinto del fauno", 2006, 2006, new Actor("ivana", 2, 2003), new Actor("aridna", 2, 1899), new Director(22, 7), new Genero("el laberinto del fauno", "drama"));
       Pelicula pe2=new Pelicula("blade II", 2002, 2002, new Actor(" Wesley Snipes", 1, 1986), new Actor("Kris Kristofferson", 0, 1963), new Director(22, 7), new Genero("blase II","accion"));
       Pelicula pe3=new Pelicula("el espinazo del diablo", 2001, 2001, new Actor("Marisa Paredes", 0, 1960), new Actor("Federico Luppi", 18, 1965), new Director(22, 7), new Genero("el espinazo del diablo", "terror"));
       pe1.mostrarInfo();
       pe2.mostrarInfo();
       pe3.mostrarInfo();
    }
    
    
}
