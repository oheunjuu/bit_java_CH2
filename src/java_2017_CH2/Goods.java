package java_2017_CH2;

public class Goods {
	private String name;
	protected int price;
	public int countStock;
	int countSold;
	
	String getName(){
		return name;
	}
	void discount(int percentage){
		price=price-(price*percentage);
	}
}
