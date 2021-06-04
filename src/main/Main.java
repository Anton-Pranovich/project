package main;

import java.io.IOException;

import GUI.MainGUI;
import model.Tariff;

/**
 * Главный класс для запуска приложения
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		MainGUI<Tariff> grafic = new MainGUI<Tariff>();
		grafic.run();
	}
}
