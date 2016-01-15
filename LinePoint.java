package Raza4;

public class LinePoint
{
	private final int point;
	private final int length;
	private final int direction;
	
	public LinePoint (int length)
	{
		this( length, 0 ,1 );
	}
	
	private LinePoint (int length, int point, int direction)
	{
		this.point = point;
		this.length = length;
		this.direction = direction;
	}
	public int getPoint()
	{
		return point;
	}
	
	public boolean isAtTheEndOfTheLine()
	{
		return point == 0 || point == length;
	}
	
	public LinePoint advanceOnePoint()
	{
		int newPoint = point + direction;
		int newDirection =  newPoint == 0 || newPoint == length 
							? -1 * direction 
							: direction;
		
		return new LinePoint(length, newPoint , newDirection);
	}
}
