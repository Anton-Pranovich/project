package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.AllTariff;
import model.Request;
/**
 * 
 * @author Anton
 *
 * @param <Tariff>
 */
public class AddRequestGUI<Tariff> {
	JFrame frame;
	private JButton buttonAddRequest;
	private JPanel panel_1, panel_2, panel;
	private JLabel labelName, labelSecondName, labelPatronymic, labelAge, labelBirthday, labelPassport, labelTariff;
	private JTextField textName, textSecondName, textPatronymic, textAge, textBirthday, textPassport, textTariff;
	private boolean isEmpty = false;
	public static final String FILE_NAME = "request.txt";
	private boolean append = true;

	public void run() throws IOException {

		List<Request> request = new ArrayList<>();

		FileOutputStream fos = new FileOutputStream(FILE_NAME, append);		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		frame = new JFrame();
		frame.setSize(1050, 500);// размер
		frame.setTitle("Search Tariffs"); // заголовок
		frame.setLocationRelativeTo(null);// расположение
		frame.setResizable(false);// нельзя изменять размер

		panel_1 = new JPanel(); //создает панель
		panel_1.setSize(650, 765); // задаем разиеры панели
		panel_1.setBackground(Color.WHITE);//задаем цвет фона панели

		panel_2 = new JPanel();//создаем панель
		panel_2.setSize(340, 765);//задаем размеры панели

		panel = new JPanel();//создаем панель для объединения предыдущих панелей
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.add(panel_1); //добавляем панель 1 
		panel.add(panel_2); //добавляем панель 2

		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		panel_2.setBorder(BorderFactory.createEmptyBorder(20, 0, 320, 0));
		panel_2.setBackground(Color.WHITE);

		labelName = new JLabel("Enter your name:   ");
		labelSecondName = new JLabel("Enter your secondName:   ");
		labelPatronymic = new JLabel("Enter your patronymic :   ");
		labelAge = new JLabel("Enter age:   ");
		labelBirthday = new JLabel("Enter birthday:   ");
		labelPassport = new JLabel("Enter passport:   ");
		labelTariff = new JLabel("Enter tariff:   ");
		textName = new JTextField(20);
		textSecondName = new JTextField(20);
		textPatronymic = new JTextField(20);
		textAge = new JTextField(20);
		textBirthday = new JTextField(20);
		textPassport = new JTextField(20);
		textTariff = new JTextField(20);

		buttonAddRequest = new JButton("Add request"); //кнопка добавления заявки на тариф

		BufferedImage iconSanta = ImageIO.read(new File("src/images/заявка.png"));
		JLabel picLabel = new JLabel(new ImageIcon(iconSanta));
		panel_1.add(picLabel);

		panel_2.add(labelName);
		panel_2.add(textName);

		panel_2.add(labelSecondName);
		panel_2.add(textSecondName);

		panel_2.add(labelPatronymic);
		panel_2.add(textPatronymic);

		panel_2.add(labelAge);
		panel_2.add(textAge);

		panel_2.add(labelBirthday);
		panel_2.add(textBirthday);

		panel_2.add(labelPassport);
		panel_2.add(textPassport);

		panel_2.add(labelTariff);
		panel_2.add(textTariff);

		panel_2.add(buttonAddRequest);

		frame.add(panel);

		buttonAddRequest.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				while (!isEmpty) {
					if (!textName.getText().isEmpty() && !textSecondName.getText().isEmpty()
							&& !textPatronymic.getText().isEmpty() && !textAge.getText().isEmpty()
							&& !textBirthday.getText().isEmpty() && !textPassport.getText().isEmpty()
							&& !textTariff.getText().isEmpty()) {
					} else {
						JOptionPane.showMessageDialog(null, "Заполните все поля", "Error", 1);
						break;
					}

					try {
						AllTariff.valueOf(textTariff.getText());
						isEmpty = true;
					} catch (IllegalArgumentException a) {
						JOptionPane.showMessageDialog(null, "Нет такого тарифа", "Error", 1);
						break;
					}
					if (isEmpty) {
						JOptionPane.showMessageDialog(null, "Успешно добавлен", "Добавление", 1);

						request.add(new Request(textTariff.getText(), textName.getText(), textSecondName.getText(),
								textPatronymic.getText(), textAge.getText(), textBirthday.getText(),
								textPassport.getText()));
						try {
							oos.writeObject(new Request(textTariff.getText(), textName.getText(),
									textSecondName.getText(), textPatronymic.getText(), textAge.getText(),
									textBirthday.getText(), textPassport.getText()));

						} catch (IOException e1) {
							e1.printStackTrace();
						} finally {
							try {
								oos.flush();
								oos.close();
								fos.close();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}

					}

				}

			}
		});

		frame.setVisible(true);
	}

}
