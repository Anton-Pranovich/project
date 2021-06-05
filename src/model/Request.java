package model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Класс, представляющий модель заявки. Заявка наследует клиента(и имеет все его
 * поля), а также содержит название тарифного плана.
 */

public class Request extends Client implements Serializable {

	private static final long serialVersionUID = 317638065316930239L;
	private String tariff;

	public Request() {
		super();
	}

	public Request(String tariff, String firstName, String secondName, String patronymic, String age, String birthday,
			String passport) {
		super(firstName, secondName, patronymic, age, birthday, passport);
		this.tariff = tariff;
	}

	public String getTariff() {
		return tariff;
	}

	public void setTariff(String tariff) {
		this.tariff = tariff;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(tariff);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Request other = (Request) obj;
		return Objects.equals(tariff, other.tariff);
	}

	@Override
	public String toString() {
		return "Request (tariff=" + tariff + ", FirstName=" + getFirstName() + ", SecondName=" + getSecondName()
				+ ", Patronymic=" + getPatronymic() + ", Age=" + getAge() + ", Birthday=" + getBirthday()
				+ ", Passport=" + getPassport() + ")" + "\n";
	}
}
