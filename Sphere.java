//Sphere.java
//calculates various formulas given radius
//Alan Stoloff
//21 January 2020

import java.util.Scanner;

public class Sphere
{
  public static void main(String[] args)
  {
    System.out.println("enter the radius of the sphere");
    Scanner forRadius = new Scanner (System.in);
    double radius;
    double surfaceArea;
    double volume;
    double diameter;
    radius = forRadius.nextDouble();
    diameter= radius*2;
    surfaceArea=4*Math.PI*Math.pow(radius,2);
    volume=(float)4/3*Math.PI*Math.pow(radius,3);

    System.out.print("The radius was ");
    System.out.println(radius);
    System.out.print("The diameter was ");
    System.out.println(diameter);
    System.out.print("The Surface Area was ");
    System.out.println(surfaceArea);
    System.out.print("The volume was ");
    System.out.println(volume);
  }
}
