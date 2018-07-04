/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.senales.logica;

/**
 *
 * @author Eduardo Sanchez
 */
public abstract class Senal {
    protected int amplitud;
    protected int frecuencia;
    protected int offset;

    public Senal(int amplitud, int frecuencia, int offset) {
        this.amplitud = amplitud;
        this.frecuencia = frecuencia;
        this.offset = offset;
    }

    public int getAmplitud() {
        return amplitud;
    }

    public void setAmplitud(int amplitud) {
        this.amplitud = amplitud;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    
    public abstract  int[] calcular(int ancho, int alto);
}
