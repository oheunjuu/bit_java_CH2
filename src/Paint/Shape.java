package Paint;

public abstract class Shape { //abstract 메소드를 가지고 있으면 써줘야 한다. 
	private String color;

	public Shape(){
		
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
