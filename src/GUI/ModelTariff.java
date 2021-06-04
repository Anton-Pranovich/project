package GUI;

import java.util.List;
import java.util.ArrayList;

import model.Tariff;
import javax.swing.table.AbstractTableModel;

public class ModelTariff extends AbstractTableModel {

	/**
	 * Этот класс отвечает за создание тарифных планов и добавление их в таблицу
	 * JTable
	 */
	private static final long serialVersionUID = -8855614213849594120L;
	// создаем ArrayList tariff в который будем записывать тарифные планы
	List<Tariff> tariff = new ArrayList<>();
	// Создаем массив строк и записываем туда название столбцов для таблицы
	String colNames[] = { "Name", "operator name", "payroll", "callPricesWithinTheNetwork",
			"callPricesOutsideTheNetwork", "callPricesеToHomeNetwork", "smsPrice", "parameters" };
	Class<?> colClasses[] = { String.class, String.class, Double.class, Double.class, Double.class, Double.class,
			Double.class, String.class };

// Добавление тарифных планов в таблицу
	ModelTariff() {
		tariff.add(new Tariff("КомфортМ", "A1", 26.9, 0.0, 0.1, 0.1, 0.078,
				"Абонентская плата для новых абонентов с учетом скидки:\r\n" + "Первые 3 месяца - 13,90 руб./мес."));
		tariff.add(new Tariff("Привет", "A1", 0, 0.104, 0.104, 0.104, 0.104, "0,00 руб/мес абонентская плата"));
		tariff.add(new Tariff("БизнесКласс", "A1", 125.17, 0.0, 0.0, 0.0, 0.0,
				"Почувствуйте уверенность в завтрашнем дне"));
		tariff.add(new Tariff("Безлимитище", "МТС", 25.48, 0.0468, 0.0988, 0.0988, 0.0780,
				"Безлимит интернета!, Бесплатная подписка на кино и ТВ "));
		tariff.add(new Tariff("СуперГолос", "МТС", 24.98, 0.0, 0.0, 0.0, 0.0780,
				"Безлимит звонков во все сети Республики Беларусь "));
		tariff.add(new Tariff("Абсолют", "МТС", 0.0, 0.0, 0.0, 0.0, 0.0,
				"200 минут на международные звонки, Безлимитные звонки во все сети, интернет, SMS и MMS"));
		tariff.add(new Tariff("Шейк", "Life", 14.90, 0.0, 0.15, 0.15, 0.007,
				"Бесплатная раздача трафика, Накопление ГБ и минут, Безлимит на мессенджеры"));
		tariff.add(new Tariff("ВсеВключено", "Life", 21.90, 0.0, 0.0, 0.0, 0.0,
				"Безлимит во все сети, Безлимит ГБ,Бесплатная раздача трафика"));
		tariff.add(new Tariff("Геймер", "Life", 22.90, 0.0, 0.15, 0.15, 0.07,
				"Безлимит интернета!, 300 коинов на покупку игр в Steam "));
	}

	// Возвращает число строк в модели по размеру ArrayList tariff
	public int getRowCount() {
		return tariff.size();
	}

	// Возвращает число столбцов в модели. A JTable использование этот метод, чтобы
	// определить,
	// сколько столбцов это должно создать и вывести на экран по умолчанию.
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

//Возвращает имя столбца в columnIndex. Это используется, чтобы инициализировать имя заголовка столбца таблицы. 

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
