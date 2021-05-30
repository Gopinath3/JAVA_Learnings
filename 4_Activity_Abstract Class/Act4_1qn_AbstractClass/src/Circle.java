
public class Circle extends Shape {
	final double pi = Math.PI; 
//	private static final double pi = 3.14;

	public double calculateArea(int value) {
		return  (pi * Math.pow(value, 2));
	}

}
