/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.Pruebas;

import aragon.conceptos.Genero;
import aragon.conceptos.Pelicula;
import aragon.personas.Actor;
import aragon.personas.Director;

/**
 *
 * @author Valencia Rosas Ricardo Arturo
 */
public class pruebas {

    public static void main(String[] args) {

        Pelicula pelicula1 = new Pelicula("como entrenar a tu dragon", 2018, 12, new Actor("chimuelo", 5, 2005, "terror nocturno", "hippo", "vikinga", 1855, 1.90f), new Actor("hippo", 5, 2005, "hippo", "gustentag", "vikinga", 1840, 1.70f), new Director(5, 5, "guillermo", "del toro", "mexicana", 1975, 1.80f), new Genero("animada", "pelicula para niños con efectos chingones"));
        Pelicula pelicula2= new Pelicula("pacific RIM", 2017, 5, new Actor("erick", 7, 1882, "manuel", "vasalles", "Estado Unidense", 1882, 1.90f), new Actor("jorge", 8, 1887, "juan", "gustentag", "China", 1889, 1.90f), new Director(8, 10, "mark", "del fino", "costariquense", 1965, 1.85f), new Genero("accion", "mucha accion muerte y robots dandose en la madre"));
        Pelicula pelicula3 = new Pelicula("IT", 2017, 18, new Actor("ESO", 15, 1450, "El payaso come niños", "eso", "Demoniaco", 00000, 2.20f), new Actor("niño gordo", 6, 1997, "gordito", "come tortas", "Estado Unidense", 1995, 1.62f), new Director(12, 18, "paquito", "Anaya", "mexicana", 1985, 1.60f), new Genero("terror,suspenso", "pelicula para que generes una fobia o abrazes a tu chava en el cine "));
    System.out.println("----------------------------Pelicula 1-------------------------");
        pelicula1.mostrarInfo();
        System.out.println("------------------------------Pelicula 2---------------------------");
        pelicula2.mostrarInfo();
        System.out.println("----------------------------Pelicula 3--------------------------");
        pelicula3.mostrarInfo();

    }
}
