package GUI;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * Этот класс нужен для создания таблицы, в которой содержатся все тарифы
 * 
 * @author Anton
 *
 */

public class AllTariffs {
	private static final int AUTO_RESIZE_ALL_COLUMNS = 4;
	private JTable table;

	public void run() {
		JFrame frame = new JFrame();
		frame.setSize(1050, 500);// размер
		frame.setTitle("All Tariffs"); // заголовок
		frame.setLocationRelativeTo(null);// расположение
		frame.setResizable(false);// нельзя изменять размер
		table = new JTable(new ModelTariff());
		table.setAutoResizeMode(AUTO_RESIZE_ALL_COLUMNS);
		frame.add(new JScrollPane(table));
		frame.setVisible(true);
	}

}