package model;
import java.util.Objects;

public class Client {
	private String firstName;
	private String secondName;
	private String patronymic;
	private String age;
	private String birthday;
	private String passport;

	public Client() {

	}

	public Client(String firstName, String secondName, String patronymic, String age, String birthday, String passport) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.patronymic = patronymic;
		this.age = age;
		this.birthday = birthday;
		this.passport = passport;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, birthday, firstName, passport, patronymic, secondName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(age, other.age) && Objects.equals(birthday, other.birthday)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(passport, other.passport)
				&& Objects.equals(patronymic, other.patronymic) && Objects.equals(secondName, other.secondName);
	}

	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", secondName=" + secondName + ", patronymic=" + patronymic + ", age="
				+ age + ", birthday=" + birthday + ", passport=" + passport + "]";
	}

}
