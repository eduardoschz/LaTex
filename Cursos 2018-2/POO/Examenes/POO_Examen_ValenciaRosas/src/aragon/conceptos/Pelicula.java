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
 * @author Valencia Rosas Ricardo Arturo
 */
public class Pelicula {

    private String titulo;
    private int año;
    private int fechaDeEstreno;
    private Actor protagonista;
    private Actor coProtagonista;
    private Director dir;
    private Genero gen;

    public Pelicula() {
    }

    public Pelicula(String titulo, int año, int fechaDeEstreno, Actor protagonista, Actor coProtagonista, Director dir, Genero gen) {
        this.titulo = titulo;
        this.año = año;
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

   
    public void mostrarInfo() {

      System.out.println("titulo:" + titulo + "\naño:" + año + "\nfecha de estreno: " + fechaDeEstreno   );
        System.out.println("-----protagonista---");
      protagonista.mostrarInfo();
        System.out.println("\n----Coprotagonista-----");
        coProtagonista.mostrarInfo();
        System.out.println("------director------");
        dir.mostrarInfo();
        System.out.println("-------Genero-------");
        System.out.println("nombre del genero:"+getGen().getNombre()+"\ndescripcion del genero: "+getGen().getDescripcion());
    }

}
