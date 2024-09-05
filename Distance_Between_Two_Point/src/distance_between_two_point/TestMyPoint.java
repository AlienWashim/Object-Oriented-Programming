package distance_between_two_point;

import java.util.Scanner;


public class TestMyPoint {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of x1: ");
        int x1=sc.nextInt();
        System.out.print("Enter value of y1: ");
        int y1=sc.nextInt();
        
        MyPoint point1=new MyPoint(x1,y1);
        MyPoint point2=new MyPoint();
        System.out.print("Enter value of x2: ");
        int x2=sc.nextInt();
        System.out.print("Enter value of y2: ");
        int y2=sc.nextInt();
        point2.setX(x2);
        point2.setY(y2);

        System.out.print("Enter value of x3: ");
        int x3=sc.nextInt();
        System.out.print("Enter value of y3: ");
        int y3=sc.nextInt();
        
        System.out.println(""+point1.toString("Point1"));
        System.out.println(""+point2.toString("Point2"));
        System.out.println("Distance1 = "+String.format("%.3f", point1.distance(point2))); 
        System.out.println("Distance2 = "+String.format("%.3f", point1.distance(x3,y3)));
        System.out.println("Distance3 = "+String.format("%.3f", point1.distance()));
        
    }
}
