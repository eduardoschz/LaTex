/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.graficos;

import gui.senales.logica.Senal;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Eduardo Sanchez
 */
public class PanelSenales extends JPanel {

    private int ancho;
    private int alto;
    private Senal senal;

    public void actualizar(Senal s) {
        this.senal = s;
        this.repaint();
    }

    @Override
    public void paint(Graphics g) {
        this.ancho = (int) this.getSize().getWidth();
        this.alto = (int) this.getSize().getHeight();
        int anchoCelda = (int) (this.getSize().getWidth() / 10);
        int altoCelda = (int) (this.getSize().getHeight() / 10);
     
        Color c;
        c = new Color(255, 255, 255);
        g.setColor(c);
        g.fillRect(0, 0, this.ancho, this.alto);
        c = new Color(180, 180, 180);
        g.setColor(c);
        int i;
        
        for (i = anchoCelda; i < this.ancho - (anchoCelda / 2); i += anchoCelda) { //dibuja verticales
            g.drawLine(i, 0, i, this.alto);
            g.drawString((i/anchoCelda)-5+"", i, this.alto/2);
        }
        for (i = altoCelda; i < this.alto - (altoCelda / 2); i += altoCelda) {
            g.drawLine(0, i, this.ancho, i);
            g.drawString((-i/altoCelda)+5+"", this.ancho/2, i);
        }
        
        c = new Color(20, 0, 255);
        g.setColor(c);
        if (this.senal != null) {
            int[] puntos = this.senal.calcular(this.ancho, this.alto);
            for (i = 0; i < this.ancho - 1; i++) {
                g.drawLine(i, (this.alto / 2) - puntos[i], i + 1, (this.alto / 2) - puntos[i + 1]);
            }
        }
        
        g.setColor(Color.BLACK);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());

        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
    }
}
