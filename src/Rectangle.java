/**
 * Rectangle draws out a rectangle and finds the area based on user input 
 * height and width values.
 * @author Jonathan
 * @version 8-30-2015
 */
public class Rectangle {
	private int width;
	private int height;
	
	/**
	 * Constructs a rectangular shape.
	 * @param aWidth the width of the rectangle
	 * @param aHeight the height of the rectangle
	 */
	public Rectangle(int aWidth, int aHeight)
	{
		width = aWidth;
		height = aHeight;
	}
	
	/**
	 * Computes the area of the rectangle.
	 * @return the area
	 */
	public int getArea()
	{
		if (width <= 0 || height <= 0) { return 0; }
		else 
		{ 
			Rectangle smallerRectangle = new Rectangle(width - 1, height);
			int smallerArea = smallerRectangle.getArea();
			return smallerArea + height;
		}
	}
	
	/**
	 * Main method used for testing only.
	 * @param args
	 */
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(5, 10);
		int area = r.getArea();
		System.out.println("Area: " + area);
		System.out.println("Expected: 50");
	}
}