package mypackage;

public class GoodsApp {
	static int i;

	public static void main(String[] args) {
		SpecialGoods camera = new SpecialGoods();
		
//		private은 외부에서 접근 불가
//		camera.name = "Nikon";

		//protected는 같은 패키지 내에서 접근 가능 
		//자식 클래스 내에서도 접근 가능
		
		//camera.price = 4000000; protected
		//camera.countSold = 100; default
		camera.countStock = 20; //public

	}

}
