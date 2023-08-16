class Circle
{
	private int radius;
	
	// Constructor
	public Circle(int radius)
	{
		setRadius(radius);
	}
	// Setter or Mutator
	public void setRadius(int radius)
	{
		if(radius >= 0)
			this.radius = radius;
		else
			this.radius = 1;
	}
	// Getter or Accessor
	public int getRadius()
	{
		return this.radius;
	}
	
	public String toString()
	{
		return "This is a circle of radius:  " + this.getRadius();
	}
}

class Test
{
	public static void main(String[] args)
	{
		Circle a, b, c;
		
		a= new Circle(3);
		b = new Circle(5);
		c= combinedCircle(a,b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static Circle combinedCircle(Circle x, Circle y)
	{
		Circle z = new Circle(x.getradius(), y.getRadius());
		x.setRadius(10);
		
	return x;
	}
}