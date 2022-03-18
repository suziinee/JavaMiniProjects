package model.dto;

public class Pet {

	private String name;
	private String type;
	private int age;
	private char vaccine;	//y or n
	
	public Pet () {}

	public Pet(String name, String type, int age, char vaccine) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.vaccine = vaccine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getVaccine() {
		return vaccine;
	}

	public void setVaccine(char vaccine) {
		this.vaccine = vaccine;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", type=" + type + ", age=" + age + ", vaccine=" + vaccine + "]";
	}
	
}
