package GUI;

import java.util.List;
import java.util.ArrayList;

import model.Tariff;
import javax.swing.table.AbstractTableModel;

public class ModelTariff extends AbstractTableModel {
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = -8855614213849594120L;
		List<Tariff> tariff = new ArrayList<>();
	    String colNames[] = { "Name", "operator name", "payroll","callPricesWithinTheNetwork","callPricesOutsideTheNetwork", "callPricesеToHomeNetwork","smsPrice","parameters" };
	    Class<?> colClasses[] = { String.class, String.class, Double.class, Double.class,Double.class,Double.class,Double.class,String.class };
	    
	    ModelTariff() {
	    	tariff.add(new Tariff("name", "operator name", 10, 0.1,0.8,0.8,0.2,"parameters"));
	    	tariff.add(new Tariff("name1", "operator name", 10, 0.1,0.8,0.8,0.2,"parameters"));
	    	tariff.add(new Tariff("name2", "operator name", 10, 0.1,0.8,0.8,0.2,"parameters"));
	    	tariff.add(new Tariff("name3", "operator name", 10, 0.1,0.8,0.8,0.2,"parameters"));
	    }
	    
	    public int getRowCount() {
	        return tariff.size();
	    }

	    public int getColumnCount() {
	        return colNames.length;
	    }

	    public Object getValueAt(int rowIndex, int columnIndex) {
	        if (columnIndex == 0) {
	            return tariff.get(rowIndex).getName();
	        }
	        if (columnIndex == 1) {
	            return tariff.get(rowIndex).getOperatorName();
	        }
	        if (columnIndex == 2) {
	            return tariff.get(rowIndex).getPayroll();
	        }
	        if (columnIndex == 3) {
	            return tariff.get(rowIndex).getCallPricesWithinTheNetwork();
	        }
	        if (columnIndex == 4) {
	            return tariff.get(rowIndex).getCallPricesOutsideTheNetwork();
	        }
	        if (columnIndex == 5) {
	            return tariff.get(rowIndex).getCallPricesеToHomeNetwork();
	        }
	        if (columnIndex == 6) {
	            return tariff.get(rowIndex).getSmsPrice();
	        }
	        if (columnIndex == 7) {
	            return tariff.get(rowIndex).getParameters();
	        }
	        return null;
	    }

	    public String getColumnName(int columnIndex) {
	        return colNames[columnIndex];
	    }

	    public Class<?> getColumnClass(int columnIndex) {
	        return colClasses[columnIndex];
	    }

	    public boolean isCellEditable(int rowIndex, int columnIndex) {
	        return true;
	    }

	    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
	        if (columnIndex == 0) {
	        	tariff.get(rowIndex).setName((String) aValue);
	        }
	        if (columnIndex == 1) {
	        	tariff.get(rowIndex).setOperatorName((String) aValue);
	        }
	        if (columnIndex == 2) {
	        	tariff.get(rowIndex).setPayroll((double) aValue);
	        }
	        if (columnIndex == 3) {
	        	tariff.get(rowIndex).setCallPricesWithinTheNetwork((double) aValue);
	        }
	        if (columnIndex == 4) {
	        	tariff.get(rowIndex).setCallPricesOutsideTheNetwork((double) aValue);
	        }
	        if (columnIndex == 5) {
	        	tariff.get(rowIndex).setCallPricesеToHomeNetwork((double) aValue);
	        }
	        if (columnIndex == 6) {
	        	tariff.get(rowIndex).setSmsPrice((double) aValue);
	        }
	        if (columnIndex == 7) {
	        	tariff.get(rowIndex).setParameters((String) aValue);
	        }
	        fireTableCellUpdated(rowIndex, columnIndex);
	        
	    }
	}

