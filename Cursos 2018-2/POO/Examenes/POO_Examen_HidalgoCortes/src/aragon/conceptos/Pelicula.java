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
 * @author M38
 */
public class Pelicula {
    
    private String titulo;
    private int año;
    private int fechaDeEstreno;
    private Actor protagonista;
    private Actor coProtagonista;
    private Director dir;
    private Genero gen;

    public Pelicula(String titulo, int año, int fechaDeEstreno, Actor protagonista, Actor coProtagonista, Director dir, Genero gen) {
        this.titulo = titulo;
        this.año = año;
        this.fechaDeEstreno = fechaDeEstreno;
        this.protagonista = protagonista;
        this.coProtagonista = coProtagonista;
        this.dir = dir;
        this.gen = gen;
    }

    public Pelicula() {
    }

  

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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

    public Genero getGen() {
        return gen;
    }

    public void setGen(Genero gen) {
        this.gen = gen;
    }
    
    public void mostrarInfo(){
        
        System.out.println("\n\nTitulo de la Plicula:"+this.titulo);
        System.out.println("Año de estreno:"+this.año);
        System.out.println("Fecha de estreno:"+this.fechaDeEstreno);
        System.out.println("Protagonista:");
        protagonista.mostrarInfo();
        System.out.println("CoProtagonista:");
        coProtagonista.mostrarInfo();
        System.out.println("Director:");
        dir.mostrarInfo();
        System.out.println("Genero: "+this.gen.getNombre() +"\nDescripcion:"+ gen.getDescripcion() );
    }
           
            
    
}
