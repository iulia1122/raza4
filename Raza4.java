package raza4;

import java.util.Scanner;

public class Raza4 {
	
	private static final Scanner scanner = new Scanner( System.in );

	public static void main(String[] args)
	{	
		int n = readN();
		int m = readM();
		LinePoint linePointX = new LinePoint(n);
		LinePoint linePointY = new LinePoint(m);
		writeCurrentPosition( linePointX, linePointY );
		
		do
		{
			linePointX = linePointX.advanceOnePoint();		
			linePointY = linePointY.advanceOnePoint();
			writeCurrentPosition( linePointX, linePointY );
		}
		while( !(linePointX.isAtTheEndOfTheLine() && linePointY.isAtTheEndOfTheLine()) );
				
		System.out.println( "A ajuns intr-un colt! " );	
	}

	private static int readN()
	{
		System.out.println( "n= " );
		return scanner.nextInt();
	}
	
	private static int readM()
	{
		System.out.println( "m= " );
		return scanner.nextInt();
	}
	
	private static void writeCurrentPosition( LinePoint linePointX, LinePoint linePointY)
	{
		System.out.println( "Coordonatele sunt : (" + linePointX.getPoint() + "," + linePointY.getPoint() + ")" );
	}
	
}
