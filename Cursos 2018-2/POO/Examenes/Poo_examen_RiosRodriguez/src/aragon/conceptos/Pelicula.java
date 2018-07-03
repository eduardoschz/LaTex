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
 * @author M48
 */
public class Pelicula {
    
    private String titulo;
    private int año;
    private int fechaDeEstreno;
    private Actor protagonista;
    private Actor cooProtagonista;
    private Director dir;
    private Genero gen;

    public Pelicula() {
    }

    public Pelicula(String titulo, int año, int fechaDeEstreno, Actor protagonista, Actor cooProtagonista, Director dir, Genero gen) {
        this.titulo = titulo;
        this.año = año;
        this.fechaDeEstreno = fechaDeEstreno;
        this.protagonista = protagonista;
        this.cooProtagonista = cooProtagonista;
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

    public Actor getCooProtagonista() {
        return cooProtagonista;
    }

    public void setCooProtagonista(Actor cooProtagonista) {
        this.cooProtagonista = cooProtagonista;
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
        System.out.println("Titulo: "+ titulo);
        System.out.println("Año de estreno: "+ año);
        System.out.println("Fecha de estreno: "+ fechaDeEstreno);
        this.protagonista.mostrarInfo();
        this.cooProtagonista.mostrarInfo();
        this.dir.mostrarInfo();
        System.out.println("Genero: "+ gen.getNombre()+ gen.getDescripcion());
        
    }
    
}
