package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Этот класс отвечает за представление главноего окна приложения
 * 
 * @author Anton
 *
 */

public class MainGUI<Tariff> {
	private JButton buttonSearch, buttonShow;
	private JPanel panel1, panel;
	private static final String ORDER_IMG_PATH = "src/images/симки.jpg";

	public void run() throws IOException {
		JFrame frame = new JFrame();
		frame.setSize(1050, 500);// размер
		frame.setTitle("Tariffs"); // заголовок
		frame.setLocationRelativeTo(null);// расположение
		frame.setResizable(false);// нельзя изменять размер
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				// потверждение выхода
				int res = JOptionPane.showConfirmDialog(null, "Do you really want to leave?!", "Exit", 0);
				if (res == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		panel1 = new JPanel();
		panel1.setSize(650, 780);
		panel1.setBackground(Color.WHITE);
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(panel1);
		buttonSearch = new JButton("AddRequest");
		panel1.add(buttonSearch);
		buttonShow = new JButton("Show all tariffs");
		panel1.add(buttonShow);
		BufferedImage iconTariff = ImageIO.read(new File(ORDER_IMG_PATH));
		JLabel picLabel = new JLabel(new ImageIcon(iconTariff));
		panel1.add(picLabel);
		panel1.add(buttonShow);
		frame.add(panel);

		buttonSearch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddRequestGUI addRequestGUI = new AddRequestGUI();
				try {
					addRequestGUI.run();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		buttonShow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AllTariffs searchGUI = new AllTariffs();
				searchGUI.run();
			}
		});

		frame.setVisible(true);
	}
}
