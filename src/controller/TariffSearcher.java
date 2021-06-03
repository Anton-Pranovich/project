package controller;
import java.util.ArrayList;
import java.util.List;
import model.Tariff;

public class TariffSearcher {
	
	public static List<Tariff> searchByOperatorName(List<Tariff> tariffs, String operatorName) {
		List<Tariff> byOperatorName = new ArrayList<>();
		for (Tariff tariff : tariffs) {
			if (tariff.getOperatorName().equals(operatorName)) {
				byOperatorName.add(tariff);
			}
		}
		return byOperatorName;
	}

	public static List<Tariff> searchByPayroll(List<Tariff> tariffs, double payroll) {
		List<Tariff> byPayroll = new ArrayList<>();
		for (Tariff tariff : tariffs) {
			if (tariff.getPayroll() <= (payroll)) {
				byPayroll.add(tariff);
			}
		}
		return byPayroll;
	}

	public static List<Tariff> searchByCallPricesWithinTheNetwork(List<Tariff> tariffs,
			double callPricesWithinTheNetwork) {
		List<Tariff> byCallPricesWithinTheNetwork = new ArrayList<>();
		for (Tariff tariff : tariffs) {
			if (tariff.getCallPricesWithinTheNetwork() <= (callPricesWithinTheNetwork)) {
				byCallPricesWithinTheNetwork.add(tariff);
			}
		}
		return byCallPricesWithinTheNetwork;
	}
}
