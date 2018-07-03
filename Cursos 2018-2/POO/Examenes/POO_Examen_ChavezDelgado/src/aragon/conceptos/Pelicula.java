/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aragon.conceptos;

import aragon.persona.Actor;
import aragon.persona.Director;
import aragon.persona.Persona;
/**
 *
 * @author PC-04
 */
public class Pelicula {
    private String titulo;
    private int anio;
    private int fechaEstreno;
    private Actor protagonista;
    private Actor coProtagonista;
    private Director dir;
    private Genero genero;
    
    
    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, int fechaEstreno, Actor protagonista, Actor coProtagonista, Director dir, Genero genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.fechaEstreno = fechaEstreno;
        this.protagonista = protagonista;
        this.coProtagonista = coProtagonista;
        this.dir = dir;
        this.genero = genero;
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

    public int getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(int fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public void mostrarinfo(){
        System.out.println(this.titulo);
        System.out.println(this.anio);
        System.out.println(this.fechaEstreno);
        this.protagonista.MostrarInfo();
        this.coProtagonista.MostrarInfo();
        this.dir.MostrarInfo();
        this.genero.getNombre();
        this.genero.getDescripcion();
    }
}
