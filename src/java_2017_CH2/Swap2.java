package java_2017_CH2;

public class Swap2 {
	public static void main(String[] args){
		Value i=new Value();
		i.val=10;
		
		Value j=new Value();
		j.val=20;
		
		System.out.println(i.val+":"+j.val);
		
		swap(i,j);
		System.out.println(i.val+":"+j.val);
		
	}
	
	public static void swap(Value a, Value b){ //주소값이 저장되있으니깐 그 주소를 찾아가서 저장된 숫자를 불러와서 계산을 한다.
		int temp=a.val;
		a.val=b.val;
		b.val=temp;
	}
	//객체로 불러와야 한다.
	
}
