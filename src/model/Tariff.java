package model;
import java.util.Objects;

public class Tariff {
	private String name;
	private String operatorName;
	private double payroll;
	private double callPricesWithinTheNetwork;
	private double callPricesOutsideTheNetwork;
	private double callPricesеToHomeNetwork;
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
		this.callPricesеToHomeNetwork = callPricesеToHomeNetwork;
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
		return callPricesеToHomeNetwork;
	}

	public void setCallPricesеToHomeNetwork(double callPricesеToHomeNetwork) {
		this.callPricesеToHomeNetwork = callPricesеToHomeNetwork;
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
		return Objects.hash(callPricesOutsideTheNetwork, callPricesWithinTheNetwork, callPricesеToHomeNetwork, name,
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
				&& Double.doubleToLongBits(callPricesеToHomeNetwork) == Double
						.doubleToLongBits(other.callPricesеToHomeNetwork)
				&& Objects.equals(name, other.name) && Objects.equals(operatorName, other.operatorName)
				&& Objects.equals(parameters, other.parameters)
				&& Double.doubleToLongBits(payroll) == Double.doubleToLongBits(other.payroll)
				&& Double.doubleToLongBits(smsPrice) == Double.doubleToLongBits(other.smsPrice);
	}

	@Override
	public String toString() {
		return  "operatorName:" + operatorName+", Tariff name:" + name  + ", payroll:" + payroll
				+ ", callPricesWithinTheNetwork:" + callPricesWithinTheNetwork + ", callPricesOutsideTheNetwork:"
				+ callPricesOutsideTheNetwork + ", callPricesеToHomeNetwork:" + callPricesеToHomeNetwork + ", smsPrice:"
				+ smsPrice + ", parameters:" + parameters + "]";
	}

	
	
}
