package ico.fes.modelo;



import java.util.ArrayList;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class ModeloTablaPersona implements TableModel{
	ArrayList<Persona> datos;
	
	public ModeloTablaPersona() {
		// TODO Auto-generated constructor stub
		datos=new ArrayList<Persona>();
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
		return datos.size();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public String getColumnName(int columnIndex) {
		String colName="";
		switch (columnIndex) {
		case 0:
			colName="Nombre";
			break;
		case 1:
			colName="Paterno";
			break;
		case 2:
			colName="Materno";
			break;
		case 3:
			colName="Edad";
			break;
		default:
		case 4:
			colName="ND";
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
		default:
			return Integer.class;
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Persona temp=datos.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return temp.getNombre();
		case 1:
			return temp.getApPaterno();
		case 2:
			return temp.getApMaterno();
		case 3:
			return new Integer(temp.getEdad());
		default:
			break;
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO Auto-generated method stub
		
	}

}
