package java_2017_CH2;

public class GoodsApp2 {

	public static void main(String[] args) {
		//Goods2 camera=new Goods2();
		//camera.name="Canon"; //private으로 접근 불가 
		//camera.setName("Canon");
		//System.out.println(camera.getName());
		//정보를 은닉화하기 위해서 -->변수들을 private으로 지정한 후 메인에서 get,set으로 불러온다.
		
		
		Goods2 goods=new Goods2();
		System.out.println(Goods2.countOfGoods);
		 
		//JVM에서 자동으로 생성자 만들어주기 때문에 Goods2에서 생성자 안 만들어도 오류가 생기지 않음
		
		
		//객체 변수에 바로 접근하면 잘못된 데이터를 세팅할수 있는 가능성 생김.
		//goods.price=-1; 객체변수에 바로 접근하면 잘못된 접근 방식이다. 
		
		goods.setPrice(-1); //가격이 -1이 없으니깐 0으로 세팅해줌 
//		System.out.println(goods.getPrice());
		
		//static 변수 test
		Goods2 goods1=new Goods2();
		System.out.println(Goods2.countOfGoods);
		Goods2 goods2=new Goods2();
		System.out.println(Goods2.countOfGoods);
		Goods2 goods3=new Goods2();
		System.out.println(Goods2.countOfGoods);
		
		goods2.setName("Canon");
		goods2.setPrice(500000);
		goods2.setCountStock(100);
		goods2.setCountSold(500);
		
		//메소드 호출 
		goods2.showInfo();
		
		goods3.setPrice(10000);
		double discountPrice=goods3.calcDiscountPrice(0.8);
		System.out.println(discountPrice);
	}

}
