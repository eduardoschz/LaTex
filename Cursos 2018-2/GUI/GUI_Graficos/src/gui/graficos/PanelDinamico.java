/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.graficos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo Sanchez
 */
public class PanelDinamico extends JPanel{
    private int ancho, alto;
    @Override
    public void paint(Graphics g){
                /**
         * En este punto se dibuja una malla estática, es decir que no se moverá
         * aunque la ventana cambie de tamaño. 
         */
        Color c;        
        this.ancho = (int) this.getSize().getWidth();
        this.alto = (int) this.getSize().getHeight();
        int anchoCelda = (int) (this.getSize().getWidth() / 10);
        int altoCelda = (int) (this.getSize().getHeight() / 10);
        c = new Color(255, 255, 255);
        g.setColor(c);
        g.fillRect(0, 0, this.ancho, this.alto);
        c = new Color(180, 180, 180); //Prueba con otros colores! :)
        g.setColor(c);
        int i;

        for (i = anchoCelda; i < this.ancho - anchoCelda; i += anchoCelda) {
            g.drawLine(i, 0, i, this.alto);
        }
        for (i = altoCelda; i < this.alto - altoCelda; i += altoCelda) {
            g.drawLine(0, i, this.ancho, i);
        }
    }
}
