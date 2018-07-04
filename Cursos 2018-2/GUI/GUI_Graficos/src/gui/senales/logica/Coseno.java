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
public class Coseno extends Senal{

    public Coseno(int amplitud, int frecuencia, int offset) {
        super(amplitud, frecuencia, offset);
    }

    @Override
    public int[] calcular(int ancho, int alto) {
         int[] puntos = new int[ancho];
        for (int i = 0; i < ancho; i++) {
            puntos[i] = (this.offset * alto / 10) + (int) ((alto / 10) * this.amplitud * Math.cos(Math.PI / 180 * i * this.frecuencia));
        }
        return puntos;
    }
    
}
