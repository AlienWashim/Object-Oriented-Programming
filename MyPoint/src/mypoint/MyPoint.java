package mypoint;

import java.util.Scanner;
public class MyPoint
{
	private int x = 0;
	private int y = 0;
	
	public MyPoint()
	{
		
	}
	
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public double distance(int x, int y)
	{
		int xDiff = this.x - x;
		int yDiff = this.y - y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public double distance(MyPoint obj)
	{
		int xDiff = this.x - obj.x;
		int yDiff = this.y - obj.y;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
        public double distance()
	{
		int xDiff = this.x - 0;
		int yDiff = this.y - 0;
		return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
	}
	
	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
        }
	
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}

public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("x1: ");
        int x1=sc.nextInt();
        System.out.print("y1: ");
        int y1=sc.nextInt();
        
        MyPoint point1=new MyPoint(x1,y1);
        MyPoint point2=new MyPoint();
        System.out.print("x2: ");
        int x2=sc.nextInt();
        System.out.print("y2: ");
        int y2=sc.nextInt();
        point2.setX(x2);
        point2.setY(y2);

        MyPoint point3=new MyPoint();
        System.out.print("x3: ");
        int x3=sc.nextInt();
        System.out.print("y3: ");
        int y3=sc.nextInt();
        System.out.println("ID: 202002035");
        System.out.println("Distance1 = "+String.format("%.3f", point1.distance(point2))); 
        System.out.println("Distance2 = "+String.format("%.3f", point1.distance(x3,y3)));
        System.out.println("Distance3 = "+String.format("%.3f", point1.distance()));
        
}
}