package TP3.ar.edu.unq.po2;

public class Point {
	private float x = 0;
	private float y = 0;
	//Builder
	public Point(float x, float y){
		this.setX(x);
		this.setY(y);
	} 
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	//Gets/Sets
	public float getX(){	
		return this.x;
	}
	public float getY(){	
		return this.y;
	}
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	//Methods
	public void moveTo(float x, float y) {	
		this.setX(x);
		this.setY(y);
	}
	public Point addPoint(Point p) {
		float valorX = p.getX() + getX();
		float valorY = p.getX() + getY();	
		Point newPoint = new Point(valorX,valorY);
		return newPoint;	
	}	
}