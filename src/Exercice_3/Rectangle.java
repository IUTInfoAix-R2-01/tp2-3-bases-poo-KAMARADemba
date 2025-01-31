package Exercice_3;

public class Rectangle {
	private float length;
	private float width;
	
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getWidth( ) {
		return width;
	}
	
	public void setLength(float newLength) {
		this.length = newLength;
	}
	
	public void setWidth(float newWidth) {
		this.length = newWidth;
	}
	
	public float getArea() {
		return this.length * this.width;
	}
	
	public float getPerimeter() {
		return (this.length + this.width) * 2;
	}
	
	public String toString() {
		   return "Circle[length=" + this.length + " width=" + this.width + "]";
		}
	
	
}
