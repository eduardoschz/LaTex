/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.graficos;

import gui.senales.logica.Coseno;
import gui.senales.logica.Senal;
import gui.senales.logica.Seno;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Eduardo Sanchez
 */
public class Graficos extends javax.swing.JFrame {

    /**
     * Creates new form Graficos
     */
    private Senal senal;

    public Graficos() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        /**
        * Se instancia nuestro panel
        *
        **/
        panelGraficos = new PanelDibujo();
        miPanelEstatico = new PanelEstatico();
        miPanelDinamico = new PanelDinamico();
        panelSenales = new javax.swing.JPanel();
        miPanelSenales = new PanelSenales();
        miPanelControles = new javax.swing.JPanel();
        btnCoseno = new javax.swing.JButton();
        btnSeno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAmp = new javax.swing.JTextField();
        txtFrec = new javax.swing.JTextField();
        txtOffset = new javax.swing.JTextField();
        btnGuardarImagen = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelGraficosLayout = new javax.swing.GroupLayout(panelGraficos);
        panelGraficos.setLayout(panelGraficosLayout);
        panelGraficosLayout.setHorizontalGroup(
            panelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        panelGraficosLayout.setVerticalGroup(
            panelGraficosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Graficos", panelGraficos);

        javax.swing.GroupLayout miPanelEstaticoLayout = new javax.swing.GroupLayout(miPanelEstatico);
        miPanelEstatico.setLayout(miPanelEstaticoLayout);
        miPanelEstaticoLayout.setHorizontalGroup(
            miPanelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        miPanelEstaticoLayout.setVerticalGroup(
            miPanelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estatico", miPanelEstatico);

        javax.swing.GroupLayout miPanelDinamicoLayout = new javax.swing.GroupLayout(miPanelDinamico);
        miPanelDinamico.setLayout(miPanelDinamicoLayout);
        miPanelDinamicoLayout.setHorizontalGroup(
            miPanelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        miPanelDinamicoLayout.setVerticalGroup(
            miPanelDinamicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Dinámico", miPanelDinamico);

        miPanelSenales.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        miPanelSenales.setMaximumSize(new java.awt.Dimension(400, 300));
        miPanelSenales.setPreferredSize(new java.awt.Dimension(400, 300));

        javax.swing.GroupLayout miPanelSenalesLayout = new javax.swing.GroupLayout(miPanelSenales);
        miPanelSenales.setLayout(miPanelSenalesLayout);
        miPanelSenalesLayout.setHorizontalGroup(
            miPanelSenalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        miPanelSenalesLayout.setVerticalGroup(
            miPanelSenalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        btnCoseno.setText("Coseno");
        btnCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosenoActionPerformed(evt);
            }
        });

        btnSeno.setText("Seno");
        btnSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenoActionPerformed(evt);
            }
        });

        jLabel1.setText("Amplitud");

        jLabel2.setText("Frecuencia");

        jLabel3.setText("Offset");

        btnGuardarImagen.setText("Guardar");
        btnGuardarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout miPanelControlesLayout = new javax.swing.GroupLayout(miPanelControles);
        miPanelControles.setLayout(miPanelControlesLayout);
        miPanelControlesLayout.setHorizontalGroup(
            miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelControlesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAmp)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFrec)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOffset)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCoseno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSeno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarImagen)
                .addGap(28, 28, 28))
        );
        miPanelControlesLayout.setVerticalGroup(
            miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, miPanelControlesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(btnSeno)
                    .addComponent(btnGuardarImagen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCoseno)
                    .addGroup(miPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFrec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtOffset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Generador de Señales");

        javax.swing.GroupLayout panelSenalesLayout = new javax.swing.GroupLayout(panelSenales);
        panelSenales.setLayout(panelSenalesLayout);
        panelSenalesLayout.setHorizontalGroup(
            panelSenalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(miPanelControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSenalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelSenalesLayout.createSequentialGroup()
                .addComponent(miPanelSenales, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelSenalesLayout.setVerticalGroup(
            panelSenalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSenalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miPanelSenales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(miPanelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Señales", panelSenales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 725, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenoActionPerformed
        int amplitud = Integer.parseInt(txtAmp.getText());
        int frecuencia = Integer.parseInt(txtFrec.getText());
        int offset = Integer.parseInt(txtOffset.getText());
        this.pintarSeno(amplitud, frecuencia, offset);
    }//GEN-LAST:event_btnSenoActionPerformed

    private void btnCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosenoActionPerformed
        int amplitud = Integer.parseInt(txtAmp.getText());
        int frecuencia = Integer.parseInt(txtFrec.getText());
        int offset = Integer.parseInt(txtOffset.getText());
        this.pintarCoseno(amplitud, frecuencia, offset);
    }//GEN-LAST:event_btnCosenoActionPerformed

    private void btnGuardarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarImagenActionPerformed

        BufferedImage bi = new BufferedImage(this.miPanelSenales.getSize().width, this.miPanelSenales.getSize().height, BufferedImage.TYPE_INT_RGB);
        Graphics g = bi.createGraphics();
        this.miPanelSenales.paint(g);  //this == JComponent
        g.dispose();
        JFileChooser jfc = new JFileChooser(System.getProperty("user.dir"));
        int a = jfc.showSaveDialog(this);
        if (a == JFileChooser.APPROVE_OPTION) {
            try {
                File archivo = new File(jfc.getSelectedFile() + ".png");
                ImageIO.write(bi, "png", archivo);
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_btnGuardarImagenActionPerformed

    public void pintarSeno(int amplitud, int frecuencia, int offset) {
        senal = new Seno(amplitud, frecuencia, offset);
        ((PanelSenales) this.miPanelSenales).actualizar(senal);
    }

    public void pintarCoseno(int amplitud, int frecuencia, int offset) {
        senal = new Coseno(amplitud, frecuencia, offset);
        ((PanelSenales) this.miPanelSenales).actualizar(senal);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoseno;
    private javax.swing.JButton btnGuardarImagen;
    private javax.swing.JButton btnSeno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel miPanelControles;
    private javax.swing.JPanel miPanelDinamico;
    private javax.swing.JPanel miPanelEstatico;
    private javax.swing.JPanel miPanelSenales;
    private javax.swing.JPanel panelGraficos;
    private javax.swing.JPanel panelSenales;
    private javax.swing.JTextField txtAmp;
    private javax.swing.JTextField txtFrec;
    private javax.swing.JTextField txtOffset;
    // End of variables declaration//GEN-END:variables
}