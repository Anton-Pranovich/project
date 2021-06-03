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





public class Grafic<Tariff> {
	private JButton buttonSearch, buttonShow;
	private JPanel panel_1, panel;

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
				if (res == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		panel_1 = new JPanel();
		panel_1.setSize(650, 780);
		panel_1.setBackground(Color.WHITE);

		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(panel_1);
	
		buttonSearch = new JButton("Search the tariff");
		panel_1.add(buttonSearch);
		buttonShow = new JButton("Show all tariffs");
		panel_1.add(buttonShow);
		BufferedImage iconTariff = ImageIO.read(new File("src/images/симки.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(iconTariff));
		panel_1.add(picLabel);

		panel_1.add(buttonShow);

		frame.add(panel);
		
		buttonSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SearchGUI<Tariff> searchGUI = new SearchGUI<>();
					try {
						searchGUI.run();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
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
