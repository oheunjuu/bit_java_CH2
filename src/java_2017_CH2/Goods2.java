package java_2017_CH2;

public class Goods2 {
	
	public static int countOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	//기본 생성자 
	public Goods2(){//파라미터 없고 그냥 기본만 있는거 --> 기본 생성자 
		System.out.println("기본 생성자 호출 ");
		Goods2.countOfGoods++;
	}
	//인스턴스 변수와 구분짓기 위해 this사용한다. 
	public void setName(String name){ //우선순위는 파라미터 
		this.name=name; // 객제로 접근  , 우측이 파라미터 
	}
	public String getName(){
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if (price <0){
			price=0;
		}
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	//source --> general getters and setters 들어가서 select all하고 finish하면 저절로 생성된다!
	
	//return값이 없고 파라미터도 없는 메소드 
	public void showInfo(){
		System.out.println("name: "+name+", price: "+price+", countStock: "+countStock+", countSold: "+countSold);
	}
	
	//return값이 있고,파라미터도 있는 메소드
	public double calcDiscountPrice(double rate){
		double discountPrice=price*rate;
		return discountPrice;
		
	}
	
}
