package entities;

public class rectangle {
	
	double width;
	double height;
	
	double area() {
		double area = width * height;
		return area;
	}
	
	double perimeter() {
		double perimeter = 2*(width + height);
		return perimeter;
	}
	
	double diagonal() {
		double x = Math.sqrt((width * width) + (height * height));
		return x;
	}
	

}
