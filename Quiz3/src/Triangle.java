public class Triangle extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(double side1, double side2, double side3)
	{
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	 
	public double getSide1()
	{
		return this.side1;
	}
	
	public double getSide2()
	{
		return this.side2;
	}
	
	public double getSide3()
	{
		return this.side3;
	}
	
	public double getArea()
	{
		double halfPerimeter = ((side1 + side2 + side3) / 2);
		double triangleArea = (Math.sqrt(halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3)));
		return triangleArea;
	}

	public double getPerimeter()
	{
		double trianglePerimeter = (side1 + side2 + side3);
		return trianglePerimeter;
	}
	
	public String toString()
	{
		return("The triangle has an area of " + getArea() + "and a perimeter of " + getPerimeter() + ".");
	}
}