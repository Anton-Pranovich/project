package main;

import java.io.IOException;

import GUI.Grafic;
import model.Tariff;
/**
 * 
 * @author Anton
 *Идея данного проекта является в выборе тарифного плана мобильных операторов и оставления заявки на подключение.
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {

		Grafic<Tariff> grafic = new Grafic<Tariff>();
		grafic.run();

	}

}
