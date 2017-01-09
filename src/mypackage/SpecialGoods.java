package mypackage;

import java_2017_CH2.Goods;  
//cmd+shift+o 누르면 맞는 패키지들이 import된다. 

public class SpecialGoods extends Goods{
	void test(){
//		프라이빗은 자식에서도 접근할 수 없다.
//		name="Canon";
		//private은 내부에서만 사용 가능하다. 
		
		
		//protected는 자식클래스에서 접근할 수 있다.+같은 패키지 
		price=2000000;
		
		//public은 외부에서도 접근할수 있다.
		countStock=100;
		
		//default는 접근제어(public, protected, private 로 접근 지시자를 명시하지 않은 경우 )
		//countSold=20;	
		//default는 같은 패키지 내에서만 접근 가능. 
		
		//주로 public,private,protected 사용 
		//
	}
}
