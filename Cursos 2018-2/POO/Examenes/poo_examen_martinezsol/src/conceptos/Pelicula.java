/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos;

import aragon.personas.Actor;
import aragon.personas.Director;
import aragon.personas.Persona;

/**
 *
 * @author MARTINEZ SOL AXEL
 */
public class Pelicula {
    private String titulo;
    private int ano;
    private int fechaDeEstreno;
    private Actor protagonista;
    private Actor coProtagonista;
    private Director dir;
    private Genero gen;

    public Pelicula(String titulo, int ano, int fechaDeEstreno, Actor protagonista, Actor coProtagonista, Director dir, Genero gen) {
        this.titulo = titulo;
        this.ano = ano;
        this.fechaDeEstreno = fechaDeEstreno;
        this.protagonista = protagonista;
        this.coProtagonista = coProtagonista;
        this.dir = dir;
        this.gen = gen;
    }

    public Pelicula() {
    }

    public void mostrarInfo(){
        System.out.println("titulo:"+this.titulo);
        System.out.println("año:"+this.ano);
        System.out.println("fecha de estreno:"+this.fechaDeEstreno);
        this.protagonista.mostrarInfo();
        this.coProtagonista.mostrarInfo();
        this.dir.mostrarInfo();
    }
}
