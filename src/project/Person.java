package project;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public boolean isAdult() {
		if (age >= 18) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Je m'appelle " + firstName + " " + lastName + " et j'ai " + age + " ans.";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

}
