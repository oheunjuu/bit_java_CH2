package java_2017_CH2;

public class Goods3Test {

	public static void main(String[] args) {
		Goods3 g=new Goods3();
		g.setName("Canon");
		g.setCountStock(100);
		g.setCountSold(200);
		g.setPrice(1250000);
		
		//위의 코드 대신에 다음 생성자로 객체를 생성하면서 초기화 
		//이렇게는 자동적으로 생성이 불가능하기 때문에 만들어줘야 한다. 
		Goods3 g1= new Goods3("Nikon",1000000,100,200);
		
		
		//객체 안의 데이터가 나오도록 해야한다. 
		
		System.out.println(g1);
		System.out.println(g);
	}

}
