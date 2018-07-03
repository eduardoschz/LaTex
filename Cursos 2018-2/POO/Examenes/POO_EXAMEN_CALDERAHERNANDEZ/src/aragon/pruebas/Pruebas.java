/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.pruebas;

import aragon.conceptos.Pelicula;
import aragon.personas.Actor;

/**
 *
 * @author Caldera Hernandez Andrea
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
        Pelicula p1 = new Pelicula(new Actor("") );  
        Pelicula p2 = new Pelicula(new Pelicula)); 
        Pelicula p3 = new Pelicula(new Pruebas ));
        Pruebas p = new Pruebas(p1, p2, p3);

        p.getPelicula1().mostrarInfo();
        p.getPelicula2().mostrarInfo();
        p.getPelicula3().mostrarInfo();
    }
}
