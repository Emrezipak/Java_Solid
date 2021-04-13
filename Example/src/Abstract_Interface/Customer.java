package Abstract_Interface;

public class Customer {
	
	private String name;
	private int Id;
	private String surname;
	private String Tc;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTc() {
		return Tc;
	}

	public void setTc(String tc) {
		Tc = tc;
	}
	public Customer(String name, int Id, String surname, String Tc,int age) {
		this.name = name;
		this.Id = Id;
		this.surname = surname;
		this.Tc = Tc;
		this.age=age;
	}
	
	

}
