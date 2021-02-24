//TempConversion.java
//Alan Stoloff
//Converts betweeThe Story of Farmer Green’s Reaper n Celsius and Fahrenheit
// 27 January 2020
import java.util.Scanner;

public class TempConversion
{
  public static void main(String[] args)
  {
    //initializes variables
    int startCelsius = -20;
    int startFahrenheit= -20;
    double tempCelsius;
    double tempFahrenheit;
    int i = 1;
    String upDown="|";

    //creates the table
    System.out.println("Celsius  |   Fahrenheit      Fahrenheit  |   Celsius");
    System.out.println("---------+-------------      ------------+----------");
    while (i<26)
    {
      tempFahrenheit=1.8*startCelsius+32;
      tempCelsius=(double)5/9*(startFahrenheit-32);
      System.out.printf("%8d %1s %5.1f %23d %1s %6.1f \n", startCelsius,upDown, tempFahrenheit,startFahrenheit,upDown, tempCelsius);


      i=i+1;
      startCelsius=startCelsius+5;
      startFahrenheit=startFahrenheit+10;

    }
    System.out.println("---------+-------------      ------------+----------");
  }
}
