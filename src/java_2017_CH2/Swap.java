package java_2017_CH2;

public class Swap {

	public static void main(String[] args) {
		int i=10;
		int j=20;
		
		System.out.println(i + " : "+ j);
		
		swap(i,j);
		
		System.out.println(i+" : "+j);
	}
	
	public static void swap(int a, int b){
		int temp=a;
		a=b;
		b=temp;
	}
	
	//이렇게 하면 함수 실행이 안된다. 함수를 벗어나버렸기 때문
	
}
