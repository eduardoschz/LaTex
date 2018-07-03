/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.conceptos;

import aragon.personas.Actor;
import aragon.personas.Director;

/**
 *
 * @author Caldera Hernandez Andrea
 */
public class Pelicula {

    private String titulo;
    private int anio;
    private int fechaDeEstreno;
    private Actor protagonista;
    private Actor coProtagonista;
    private Director dir;
    private Director gen;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, int fechaDeEstreno, Actor protagonista, Actor coProtagonista, Director dir, Director gen) {
        this.titulo = titulo;
        this.anio = anio;
        this.fechaDeEstreno = fechaDeEstreno;
        this.protagonista = protagonista;
        this.coProtagonista = coProtagonista;
        this.dir = dir;
        this.gen = gen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getFechaDeEstreno() {
        return fechaDeEstreno;
    }

    public void setFechaDeEstreno(int fechaDeEstreno) {
        this.fechaDeEstreno = fechaDeEstreno;
    }

    public Actor getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Actor protagonista) {
        this.protagonista = protagonista;
    }

    public Actor getCoProtagonista() {
        return coProtagonista;
    }

    public void setCoProtagonista(Actor coProtagonista) {
        this.coProtagonista = coProtagonista;
    }

    public Director getDir() {
        return dir;
    }

    public void setDir(Director dir) {
        this.dir = dir;
    }

    public Director getGen() {
        return gen;
    }

    public void setGen(Director gen) {
        this.gen = gen;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Anio: " + this.anio);
        System.out.println("Fecha de estreno: " + this.fechaDeEstreno);
        System.out.println("Protagonista: ");
        protagonista.mostrarInfo();
        System.out.println("Coprotagonista: ");  
        coProtagonista.mostrarInfo();
        System.out.println("Director: " );
        dir.mostrarInfo();
        System.out.println("Genero: " + this.gen);
        
    }
}
