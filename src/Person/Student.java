package Person;

public class Student extends Person {
	public Student(){
		System.out.println("Student() colled");
	}
	public Student(String name){
		// 명시하지 않으면 기본생성자가 자동으로 호
		//super();
		super(name);
		this.name=name;
		System.out.println("Student(String) called");
		
		//부모 생성자를 명시할 경우에는 반드시 맨 앞에 적어야 한다.
		
	}
	
	public void test(){
		
		//부모의 public속성 접근 (0)
		name = "둘리";
		
		//부모의 protected속성 접근 (0)
		height=97;
		
		//부모의 default속성 접근 (0) (단 같은 패키지에서만!!)
		age=30;
		
		//부모의 private속성 접근 (X)
		//weight=100; 
		
	}
}
