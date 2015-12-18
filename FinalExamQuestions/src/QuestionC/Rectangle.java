package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) {
		super(newx, newy);
	}
	try{
		if (newx <= 0){
			throw new IllegalRectangleException();
		}
		if  (newy <= 0){
			throw new IllegaRectangleException();
		}
	
	}
	
	
	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}
	
}
