package Paint;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(){
		
	}
	
	public ColorPoint(int x ,int y ,String color){
//		setX(x);
//		setY(y);
		//부모 생성자로 가서 폼이 있으니깐 super로 불러온다. 
		super(x,y);
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override //마크 
	public void show() {
		System.out.println("x: "+getX()+" , y: "+getY()+" , color: "+color+"로 점을 찍었습니다. ");
		//super.show(); // this는 자기자신을 가리키고 super는 부모를 가리킨다.
	}
}
