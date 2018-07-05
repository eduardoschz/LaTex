/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.modelo;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author m01
 */
public class ModeloTablaPersona implements TableModel {

    ArrayList<Persona> datos;

    public ModeloTablaPersona() {
    }

    public ModeloTablaPersona(ArrayList<Persona> datos) {
        super();
        this.datos = datos;
    }

    public ArrayList<Persona> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Persona> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size(); // La cantidad de filas depende del tamaño del ArrayList datos
    }

    @Override
    public int getColumnCount() {
        return 4; //Depende de los datos que se vayan a representar en la tabla
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colName = "";
        switch (columnIndex) {
            case 0:
                colName = "Nombre";
                break;
            case 1:
                colName = "Apellido";
                break;
            case 2:
                colName = "Correo";
                break;
            case 3:
                colName = "Carrera";
                break;
            default:
            case 4:
                colName = "ND";
                break;

        }
        return colName;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; //Todas las celdas NO son editables
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona temp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return temp.getNombre();
            case 1:
                return temp.getApellido();
            case 2:
                return temp.getCorreo();
            case 3:
                return temp.getCarrera();
            default:
                break;

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        // No se implementa
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        // No se implementa
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //No se implementa
    }

}
