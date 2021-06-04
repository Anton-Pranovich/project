package model;

import java.util.Objects;

/**
 * Класс, представляющий модель тарифного плана. Тарифный план содержит название
 * тарифного плана, название оператора, к которому он принадлежит, стоимость
 * абонентской платы, стоимость звонков внутри сети, а также в другие сети и на
 * домашнюю сеть, стоимость смс-сообщений.
 */
public class Tariff {
	private String name;
	private String operatorName;
	private double payroll;
	private double callPricesWithinTheNetwork;
	private double callPricesOutsideTheNetwork;
	private double callPricesToHomeNetwork;
	private double smsPrice;
	private String parameters;

	public Tariff() {
	}

	public Tariff(String name, String operatorName, double payroll, double callPricesWithinTheNetwork,
			double callPricesOutsideTheNetwork, double callPricesеToHomeNetwork, double smsPrice, String parameters) {
		super();
		this.name = name;
		this.operatorName = operatorName;
		this.payroll = payroll;
		this.callPricesWithinTheNetwork = callPricesWithinTheNetwork;
		this.callPricesOutsideTheNetwork = callPricesOutsideTheNetwork;
		this.callPricesToHomeNetwork = callPricesеToHomeNetwork;
		this.smsPrice = smsPrice;
		this.parameters = parameters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public double getPayroll() {
		return payroll;
	}

	public void setPayroll(double payroll) {
		this.payroll = payroll;
	}

	public double getCallPricesWithinTheNetwork() {
		return callPricesWithinTheNetwork;
	}

	public void setCallPricesWithinTheNetwork(double callPricesWithinTheNetwork) {
		this.callPricesWithinTheNetwork = callPricesWithinTheNetwork;
	}

	public double getCallPricesOutsideTheNetwork() {
		return callPricesOutsideTheNetwork;
	}

	public void setCallPricesOutsideTheNetwork(double callPricesOutsideTheNetwork) {
		this.callPricesOutsideTheNetwork = callPricesOutsideTheNetwork;
	}

	public double getCallPricesеToHomeNetwork() {
		return callPricesToHomeNetwork;
	}

	public void setCallPricesеToHomeNetwork(double callPricesToHomeNetwork) {
		this.callPricesToHomeNetwork = callPricesToHomeNetwork;
	}

	public double getSmsPrice() {
		return smsPrice;
	}

	public void setSmsPrice(double smsPrice) {
		this.smsPrice = smsPrice;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	@Override
	public int hashCode() {
		return Objects.hash(callPricesOutsideTheNetwork, callPricesWithinTheNetwork, callPricesToHomeNetwork, name,
				operatorName, parameters, payroll, smsPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tariff other = (Tariff) obj;
		return Double.doubleToLongBits(callPricesOutsideTheNetwork) == Double
				.doubleToLongBits(other.callPricesOutsideTheNetwork)
				&& Double.doubleToLongBits(callPricesWithinTheNetwork) == Double
						.doubleToLongBits(other.callPricesWithinTheNetwork)
				&& Double.doubleToLongBits(callPricesToHomeNetwork) == Double
						.doubleToLongBits(other.callPricesToHomeNetwork)
				&& Objects.equals(name, other.name) && Objects.equals(operatorName, other.operatorName)
				&& Objects.equals(parameters, other.parameters)
				&& Double.doubleToLongBits(payroll) == Double.doubleToLongBits(other.payroll)
				&& Double.doubleToLongBits(smsPrice) == Double.doubleToLongBits(other.smsPrice);
	}

	@Override
	public String toString() {
		return "operatorName:" + operatorName + ", Tariff name:" + name + ", payroll:" + payroll
				+ ", callPricesWithinTheNetwork:" + callPricesWithinTheNetwork + ", callPricesOutsideTheNetwork:"
				+ callPricesOutsideTheNetwork + ", callPricesеToHomeNetwork:" + callPricesToHomeNetwork + ", smsPrice:"
				+ smsPrice + ", parameters:" + parameters + "]";
	}
}
