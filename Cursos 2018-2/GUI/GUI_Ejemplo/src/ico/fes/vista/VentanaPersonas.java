package ico.fes.vista;

import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ico.fes.modelo.*;

public class VentanaPersonas extends JFrame {

    private JLabel lblNombre;
    private JLabel lblPaterno;
    private JLabel lblMaterno;
    private JLabel lblEdad;
    private JTextField txtNombre;
    private JTextField txtPaterno;
    private JTextField txtMaterno;
    private JTextField txtEdad;
    private JButton btnAgregar;
    private JPanel panel;
    private ArrayList<Persona> listado;

    private JTable tblPersonas;
    private JScrollPane scrollTabla;
    private ModeloTablaPersona modelo;

    private JButton btnGuardar;
    private JButton btnRecuperar;
    private JButton btnEliminar;

    private JButton btnModificar;
    private JButton btnGuardarCambios;
    private Persona personaModificacion;

    private ArchivoPersona ap;

    public VentanaPersonas() {
        initGUI();
    }

    private void initGUI() {
        GraphicsEnvironment env
                = GraphicsEnvironment.getLocalGraphicsEnvironment();

        lblPaterno = new JLabel("Ap. Paterno:");
        lblNombre = new JLabel("Nombre:");
        lblMaterno = new JLabel("Ap. Materno:");
        lblEdad = new JLabel("Edad:");

        txtNombre = new JTextField();
        txtPaterno = new JTextField();
        txtEdad = new JTextField();
        txtMaterno = new JTextField();

        txtNombre.setColumns(15);
        txtPaterno.setColumns(15);
        txtMaterno.setColumns(15);
        txtEdad.setColumns(5);

        btnAgregar = new JButton("Agregar persona");
        btnGuardar = new JButton("Guardar en archivo");
        btnRecuperar = new JButton("Leer de archivo");
        btnEliminar = new JButton("Eliminar");
        btnModificar = new JButton("Modificar persona");
        btnGuardarCambios = new JButton("GuardarCambios");

        tblPersonas = new JTable();
        listado = new ArrayList<Persona>();
        modelo = new ModeloTablaPersona(listado);
        tblPersonas.setModel(modelo);
        scrollTabla = new JScrollPane(tblPersonas);

        ap = new ArchivoPersona();

        panel = (JPanel) this.getContentPane();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        //this.setSize(600, 400);
        this.setMaximizedBounds(env.getMaximumWindowBounds());
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);

        this.setTitle("Listado de personas");
        panel.add(lblNombre);
        panel.add(txtNombre);
        panel.add(lblPaterno);
        panel.add(txtPaterno);
        panel.add(lblMaterno);
        panel.add(txtMaterno);
        panel.add(lblEdad);
        panel.add(txtEdad);
        panel.add(btnAgregar);
        panel.add(btnGuardar);
        panel.add(btnRecuperar);
        panel.add(scrollTabla);
        panel.add(btnEliminar);
        panel.add(btnModificar);
        panel.add(btnGuardarCambios);
        btnGuardarCambios.setVisible(false);

        /**
         * Eventos de la ventana
         */
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                super.windowClosing(e);
            }
        });

        // Boton de agregar
        btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Por implementar: VALIDACION y MANEJO DE EXCEPCIONES
                listado.add(
                        new Persona(
                                txtNombre.getText(), //nombre 
                                txtPaterno.getText(),//apPaterno 
                                txtMaterno.getText(),//apMaterno, 
                                Integer.parseInt(txtEdad.getText())//edad
                        )
                );

                actualizarTabla();
                limpiarFormulario();
            }
        });
        // Boton guardar a archivo
        btnGuardar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.showSaveDialog(null);
                ap.setArchivo(jfc.getSelectedFile().getAbsolutePath());
                try {
                    ap.guardarPersonas(listado);
                } catch (Exception e2) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Error al intentar guardar el archivo");
                }
            }
        }); // fin del btoton guardar a archivo

        btnRecuperar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser jfc = new JFileChooser();
                jfc.showOpenDialog(null);
                ap.setArchivo(jfc.getSelectedFile().getAbsolutePath());
                try {
                    listado = ap.leerPersonas();
                    actualizarTabla();
                } catch (Exception e2) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Error al intentar leer el archivo");
                }
            }
        }); // fin boton leer archivo

        btnEliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int renglonSeleccionado = tblPersonas.getSelectedRow();
                System.out.println("Seleccionado:" + renglonSeleccionado);
                if (renglonSeleccionado == -1) {
                    // no se ah elegido un renglon de la tabla
                    JOptionPane.showMessageDialog(null, "No se ah seleccionado nada de la tabla, por favor seleccione un renglon e intente de nuevo");
                } else {
                    int respuesta = JOptionPane.showConfirmDialog(null, "¿Realmente deseas eliminar este registro?");
                    if (respuesta == JOptionPane.OK_OPTION) {
                        listado.remove(renglonSeleccionado);
                        modelo.setDatos(listado);
                        actualizarTabla();
                    }
                }
            }

        }); // fin de eliminar

        btnModificar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                limpiarFormulario();
                habilitarModificacion(true);
                int renglonSeleccionado = tblPersonas.getSelectedRow();
                if (renglonSeleccionado == -1) {
                    // no se ah elegido un renglon de la tabla
                    JOptionPane.showMessageDialog(null, "No se ah seleccionado nada de la tabla, por favor seleccione un renglon e intente de nuevo");
                    habilitarModificacion(false);
                } else {
                    personaModificacion = listado.get(renglonSeleccionado); // objeto temporal declarado como atributo de clase
                    txtNombre.setText(personaModificacion.getNombre());
                    txtPaterno.setText(personaModificacion.getApPaterno());
                    txtMaterno.setText(personaModificacion.getApMaterno());
                    txtEdad.setText("" + personaModificacion.getEdad()); // parse a String con "" +
                    txtNombre.requestFocus();
                }
            }
        }); // fin de modificar

        btnGuardarCambios.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Esto les toca a uds :P");
            }
        });
    }

    private void actualizarTabla() {
        /*txtListado.setText("");
		
		for (Persona persona : listado) {
			txtListado.append(persona.getNombre()+"\n");
		}
         */

        modelo.setDatos(listado);
        tblPersonas.revalidate();

    }

    private void limpiarFormulario() {
        txtNombre.setText("");
        txtPaterno.setText("");
        txtMaterno.setText("");
        txtEdad.setText("");
    }

    /**
     * Metodo habilitarModificacion Cambia el estado de los botones para
     * habilitar la modificacion si recibe true oculta los botones basicos con
     * false los muestra nuevamente
     *
     * @param estado
     */
    private void habilitarModificacion(boolean estado) {

        btnAgregar.setVisible(!estado);
        btnGuardar.setVisible(!estado);
        btnRecuperar.setVisible(!estado);
        btnEliminar.setVisible(!estado);
        btnModificar.setVisible(!estado);
        btnGuardarCambios.setVisible(estado);

    }

    public static void main(String[] args) {
        VentanaPersonas ventana = new VentanaPersonas();
        ventana.setVisible(true);

    }

}
