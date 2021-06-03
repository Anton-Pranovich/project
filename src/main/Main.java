package main;

import java.io.IOException;

import GUI.Grafic;
import model.Tariff;

public class Main {

	public static void main(String[] args) throws IOException {
		// List<Tariff> tariffs;
//		tariffs = createTariff ();

		Grafic<Tariff> grafic = new Grafic<Tariff>();
		grafic.run();

	}
//	private static List<Tariff >createTariff() {
//		List<Tariff> tariffs = new ArrayList<>(Arrays.asList(
//				new Tariff("name", "operator name", 10, 0.1,0.8,0.8,0.2,"parameters"),
//				new Tariff("name", "A1", 12, 0.1,0.6,0.6,0.2,"")
//				));
//		
//		
//	
//		return tariffs;
//	}
}
