package TP3.ar.edu.unq.po2;

public class Rectangulo {
	private Point start;
    private int heigth;
    private int length;
    //Builder
    public Rectangulo(Point start,int heigth,int length) {
        this.setStartPoint(start);
        this.setHeigth(heigth);
        this.setLength(length);
    }
    //Gets/Sets
    protected void setStartPoint(Point s) {
    	this.start = s;
    }
    protected void setHeigth(int h) {
        this.heigth = h;
    }
    protected void setLength(int l) {
    	this.length = l;
    }
    public Point getStartPoint() {
    	return this.start;
    }
   	public int getHeigth() {
    	return this.heigth;
    }
    public int getLength() {
    	return this.length;
    }
    //Methods
    public float area() {
        float r = this.getHeigth() * this.getLength();
        return r;
    }
    public float perimeter() {
        float r = (this.getHeigth() * 2)+(this.getLength() * 2);
        return r;
    }
    public boolean isHorizontal() {
        return this.getHeigth() < this.getLength();
    }
    public boolean isVertical() {
        return this.getHeigth() > this.getLength();
    }
}