package Paint;

public class PaintApp {

	public static void main(String[] args) {
		
		Point pt1=new Point();
		pt1.setX(100);
		pt1.setY(200);
		
		
		Point pt2=new Point(50,100);
//		point1.show();
		
//		pt1.disappear();
//		pt2.show(false);
//		pt2.show(true);
		
		
		Point pt3 = new ColorPoint(500,400,"red");
		//ColorPoint pt3 = new ColorPoint(500,400,"yellow"); ColorPoint로 객체를 생성하면 이거 하나밖에 만들지 못한다.
		//Point로 하면 색깔을 입력하지 않아도 생성이 가능 (확장성 위해서)
		//부모꼴로 해두면 편하다. 
		//확장에는 열려있고 수정에는 닫혀있다 .!!!
		

		
		Rectangle rectangle = new Rectangle();
//		drawShape(rectangle);
		
		Circle circle = new Circle();
//		drawShape(circle);
		
		Triangle triangle = new Triangle();
//		drawShape(triangle);
		
		draw(rectangle);
		draw(circle);
		draw(triangle);
		
		
		//그리기 
		drawPoint(pt1);
		drawPoint(pt2);
//		drawPoint(pt3);
		
		Point p =pt3;
		drawPoint(p); //부모의 객체로 자식을 가리킬 수 있다. 
		//자식 show()를 가리킴 
		
	}
	
	public static void draw(Drawable drawable){
		drawable.draw();
	}
	
	 public static void drawPoint(Point point){
		 point.show(); 
	 }
	 
//	 public static void drawShape(Shape shape){
//		 shape.draw();
//	 }
//	 
//	 public static void drawRectangle(Rectangle rectangle){
//		 rectangle.draw();
//	 }
//	 
//	 public static void drawCircle(Circle circle){
//		 circle.draw();
//	 }
}
