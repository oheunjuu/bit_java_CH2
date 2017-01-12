package Person;

public class Person {
	public String name;
	protected int height;
	int age;
	private int weight;
	//접근 어려운 순서
	
	public Person(){
		System.out.println("Person() called");
	}
	
	public Person(String name){
		this.name=name;
		System.out.println("Person(String) called");
	}
}
