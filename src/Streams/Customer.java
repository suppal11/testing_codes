package Streams;

public class Customer 
{
	private int age;
	private String name;
	
	Customer(int age,String name)
	{
		this.name=name;
		this.age=age;

	}
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
	
}
