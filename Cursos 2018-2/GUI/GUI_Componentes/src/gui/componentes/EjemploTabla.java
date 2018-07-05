/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.componentes;

import gui.archivo.Archivos;
import gui.modelo.ModeloTablaPersona;
import gui.modelo.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author m01
 */
public class EjemploTabla extends javax.swing.JFrame {

    private ModeloTablaPersona modelo;
    private ArrayList<Persona> lista = new ArrayList<>();
    private Persona temp;
    private int indice;

    public EjemploTabla() {
        initComponents();
        modelo = new ModeloTablaPersona(lista);
        tblPersona.setModel(modelo);

        this.btnCancelar.setVisible(false);
        this.btnCancelar.setEnabled(false);

        this.btnGuardarCambios.setVisible(false);
        this.btnGuardarCambios.setEnabled(false);

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

        jPanel1 = new javax.swing.JPanel();
        txtApellido = new javax.swing.JTextField();
        lblApellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        cbCarrera = new javax.swing.JComboBox<>();
        lblCarrera = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersona = new javax.swing.JTable();
        btnGuardarSerializable = new javax.swing.JButton();
        btnLeer = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro - FES Aragon");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        lblApellido.setText("Apellido");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblCorreo.setText("Correo");

        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        cbCarrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ARQ", "ECO", "SOC", "RRII", "PED", "PDA", "DER", "DIN", "CYP", "ICO", "ICI", "IME", "IEE", "IID" }));
        cbCarrera.setToolTipText("<html><b>Elige una carrera</b>");
        cbCarrera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbCarreraMouseClicked(evt);
            }
        });
        cbCarrera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbCarreraKeyTyped(evt);
            }
        });

        lblCarrera.setText("Carrera");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tblPersona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPersona);

        btnGuardarSerializable.setText("Guardar Serializable");
        btnGuardarSerializable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSerializableActionPerformed(evt);
            }
        });

        btnLeer.setText("Leer Serializable");
        btnLeer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeerActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarSerializable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLeer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNombre)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApellido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtCorreo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(90, 90, 90)
                                        .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(110, 110, 110)
                                        .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(68, 68, 68)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardarCambios)
                                .addGap(31, 31, 31)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(56, 56, 56))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(78, 78, 78))
                                .addComponent(cbCarrera, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(lblApellido)
                    .addComponent(lblCorreo)
                    .addComponent(lblCarrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btnGuardarCambios)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarSerializable)
                    .addComponent(btnLeer))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (this.txtNombre.getText().equals("") || this.txtApellido.getText().equals("") || this.txtApellido.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Uno de los campos está vacio. \n Verifique, por favor.", "Campo vacio", JOptionPane.WARNING_MESSAGE);
        } else {
            Persona temp = new Persona();
            temp.setNombre(this.txtNombre.getText());
            temp.setApellido(this.txtApellido.getText());
            temp.setCorreo(this.txtCorreo.getText());
            temp.setCarrera((String) this.cbCarrera.getSelectedItem());

            lista.add(temp);
            actualizaTabla();
            temp = null;
            limpiarCampos();
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblPersona.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado nada en la tabla", "No hay selección", JOptionPane.ERROR_MESSAGE);
        } else {
            if ((JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar esto?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)) == JOptionPane.YES_OPTION) {
                lista.remove(tblPersona.getSelectedRow());
                actualizaTabla();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarSerializableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSerializableActionPerformed
        Archivos.guardarArchivo_S(lista);
    }//GEN-LAST:event_btnGuardarSerializableActionPerformed

    private void btnLeerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeerActionPerformed
        lista = Archivos.leerArchivo_S();
        actualizaTabla();
    }//GEN-LAST:event_btnLeerActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tblPersona.getSelectedRow() != -1) {

            indice = tblPersona.getSelectedRow();
            this.btnGuardarCambios.setVisible(true);
            this.btnAgregar.setEnabled(false);
            this.btnEliminar.setEnabled(false);
            this.btnEditar.setEnabled(false);
            this.btnCancelar.setVisible(true);
            this.btnCancelar.setEnabled(true);

            temp = lista.get(tblPersona.getSelectedRow());
            this.txtNombre.setText(temp.getNombre());
            this.txtApellido.setText(temp.getApellido());
            this.txtCorreo.setText(temp.getCorreo());
            this.cbCarrera.setSelectedItem(temp.getCarrera());

        } else {
            JOptionPane.showMessageDialog(this, "No hay nada seleccionado", "Registro - FES Aragón", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        activarBtnGuardar();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        temp.setNombre(txtNombre.getText());
        temp.setApellido(txtApellido.getText());
        temp.setCorreo(txtCorreo.getText());
        temp.setCarrera((String) cbCarrera.getSelectedItem());

        lista.set(indice, temp);
        this.btnAgregar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnEditar.setEnabled(true);

        this.btnGuardarCambios.setVisible(false);
        this.btnGuardarCambios.setEnabled(false);

        actualizaTabla();
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        activarBtnGuardar();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        activarBtnGuardar();
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void cbCarreraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbCarreraKeyTyped
        activarBtnGuardar();
    }//GEN-LAST:event_cbCarreraKeyTyped

    private void cbCarreraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbCarreraMouseClicked
        activarBtnGuardar();
    }//GEN-LAST:event_cbCarreraMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.btnAgregar.setEnabled(true);
        this.btnEliminar.setEnabled(true);
        this.btnEditar.setEnabled(true);
        this.btnGuardarCambios.setVisible(false);
        this.btnGuardarCambios.setEnabled(false);
        this.btnCancelar.setVisible(false);
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void limpiarCampos() {
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtCorreo.setText("");
        this.cbCarrera.setSelectedIndex(0);
    }

    private void actualizaTabla() {
        modelo.setDatos(lista);
        tblPersona.repaint();
        tblPersona.revalidate();
    }

    private void activarBtnGuardar() {
        this.btnGuardarCambios.setEnabled(true);
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
            java.util.logging.Logger.getLogger(EjemploTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemploTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemploTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemploTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemploTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnGuardarSerializable;
    private javax.swing.JButton btnLeer;
    private javax.swing.JComboBox<String> cbCarrera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCarrera;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblPersona;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
