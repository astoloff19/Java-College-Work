//BarChart.java
//Alan Stoloff
//Produces a bar chart based on sales
// 27 January 2020
import java.util.Scanner;

public class BarChart
{
  public static void main(String[] args)
  {
    //creates stores
    int storeOne;
    int storeTwo;
    int storeThree;
    int storeFour;
    int storeFive;
    //Gets sales from each store
    System.out.println("enter the sales of store 1");
    Scanner forSales = new Scanner (System.in);
    storeOne=forSales.nextInt();
    System.out.println("enter the sales of store 2");
    storeTwo=forSales.nextInt();
    System.out.println("enter the sales of store 3");
    storeThree=forSales.nextInt();
    System.out.println("enter the sales of store 4");
    storeFour=forSales.nextInt();
    System.out.println("enter the sales of store 5");
    storeFive=forSales.nextInt();
    //Calculates the number of hastags necessary
    int oneMulti=storeOne/100;
    int twoMulti=storeTwo/100;
    int threeMulti=storeThree/100;
    int fourMulti=storeFour/100;
    int fiveMulti=storeFive/100;

    //actually prints the bar graphs
    System.out.printf("Store 1:   $ %,d ", storeOne);
    for(int i =0;i<oneMulti;i++)
    {
      System.out.print("#");
    }
    System.out.println(" ");
    System.out.printf("Store 2:   $ %,d ", storeTwo);
    for(int i =0;i<twoMulti;i++)
    {
      System.out.print("#");
    }
    System.out.println(" ");
    System.out.printf("Store 3:   $ %,d ", storeThree);
    for(int i =0;i<threeMulti;i++)
    {
      System.out.print("#");
    }
    System.out.println(" ");
    System.out.printf("Store 4:   $ %,d ", storeFour);
    for(int i =0;i<fourMulti;i++)
    {
      System.out.print("#");
    }
    System.out.println(" ");
    System.out.printf("Store 5:   $ %,d ", storeFive);
    for(int i =0;i<fiveMulti;i++)
    {
      System.out.print("#");
    }
    System.out.println(" ");
  }
}
