/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 * @version 1.0
 * @author Eduardo Sanchez
 */
public class PanelDibujo extends JPanel {

    /**
     * Para ver como implementarlo, ve a la clase Gráficos.java → Design → Click
     * derecho sobre el panel → Customize code
     */
    

    public PanelDibujo() {

    }

    /**
     * Siempre que vayas a pintar algo debes reescribir este
     * método y adecuardo a tus necesidades. 
     * @param g 
     */
    @Override
    public void paint(Graphics g) { 

        Color c; //Se declara la variable Color
        c = new Color(255, 255, 255); //Se modifica el color
        g.setColor(c);  //Se asigna color
        g.fillRect(0, 0, 400, 300); //Se dibuja un rectángulo desde el origen hasta el punto 400, 300

        c = new Color(0, 0, 255); //Se modifica el color
        g.setColor(c); //Se asigna color
        g.drawLine(10, 10, 10, 100); //Se dibuja una linea desde el punto (10,10) hasta (100,100)

        c = new Color(0, 255, 0); //Se modifica el color
        g.setColor(c); //Se asigna color
        g.drawRect(20, 10, 50, 100); //Se dibuja el perímetro de un rectángulo desde (20,10) de 50 px de ancho y 100 px de alto
        g.fillRect(80, 10, 50, 100); //Se dibuja el area de rectángulo desde (80,10) de 50 px de ancho y 100 px de alto
        g.drawRoundRect(140, 10, 50, 100, 20, 20); //Se dibuja el perímetro de un rectángulo redondeado desde (140,10) de 50 px de ancho y 100 px de alto, y 20% de redondeado
        g.fillRoundRect(200, 10, 50, 100, 20, 20); //Se dibuja el area de un rectángulo redondeado desde (140,10) de 50 px de ancho y 100 px de alto, y 20% de redondeado

        c = new Color(255, 0, 0); //Se modifica el color
        g.setColor(c);            //Se asigna color
        g.drawOval(260, 10, 50, 100); //Se dibuja el perímetro de un ovalo desde el punto (260,10) de 50px de ancho y 100px de alto
        g.fillOval(320, 10, 50, 100); //Se dibuja el area de un ovalo desde el punto (320,10) de 50px de ancho y 100px de alto

        c = new Color(255, 0, 255);
        g.setColor(c);
        int[] x = {10, 20, 30, 40, 50}; //Arreglo de puntos en x
        int[] y = {120, 180, 150, 180, 120}; //Arreglo de puntos en y
        g.drawPolygon(x, y, 5); //Se dibuja el perímetro de un polígono de 5 lados, con puntos en el producto punto de x[] y y[]

        int[] x2 = {60, 70, 80, 90, 100};
        int[] y2 = {120, 180, 150, 180, 120};
        g.fillPolygon(x2, y2, 5); //Se dibuja el area de un polígono de 5 lados, con puntos en el producto punto de x2[] y y2[]

        c = new Color(100, 100, 100);
        g.setColor(c);
        Font f = new Font("Tahoma", 10, 25); //Se crea una variable Fuente, que es Tahoma, tamaño 25
        g.setFont(f); // Se asigna la fuente
        g.drawString("Hola mundo", 120, 150); //Se asigna el texto a dibujar, y se coloca en el punto (120,150)

        //Se declara una variable Image que recibe la imagen que se dibujará
        Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Eduardo Sanchez\\Documents\\NetBeansProjects\\GUI_Graficos\\src\\img\\java.png");
        // Se dibuja la imagen en el punto (250,120) y se indica que será en ese compontente
        g.drawImage(image, 250, 120, this);


    }
}
