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
public class PanelEstatico extends JPanel{
    
    @Override
    public void paint(Graphics g){
        /**
         * En este punto se dibuja una malla estática, es decir que no se moverá
         * aunque la ventana cambie de tamaño. 
         */
        Color c;
        c = new Color(255, 255, 255); //Se selecciona el color 
        g.setColor(c);                //Se asigna el color
        g.fillRect(0, 0, 400, 300);   // Se dibuja un rectángulo deltamaño de la ventana
        c = new Color(180, 180, 180); //Se selecciona color
        g.setColor(c);                //Se asigna color
        int i;
        for (i = 40; i < 400; i += 40) {
            g.drawLine(i, 0, i, 300); //Se dibujan las lineas verticales
        }
        for (i = 30; i < 300; i += 30) {
            g.drawLine(0, i, 400, i); //Se dibujan las lineas horizontales
        }
    }
}
