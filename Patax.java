//"Patax"
//Calculates the tax in PA
//Alan Stoloff
//21 January 2020
import java.util.Scanner;

public class Patax
{
  public static void main(String[] args)
  {
    final double PA_SALES_TAX =.06;
    System.out.println("Enter Item");
    System.out.println("Enter cost(on next line)");
    Scanner purchase = new Scanner (System.in);
    String item;
    double cost;
    double salesTax;
    double total;
    item = purchase.nextLine();
    cost = purchase.nextDouble();

    salesTax= (cost * PA_SALES_TAX);
    total= salesTax+cost;

    System.out.print("The item purchased was:");
    System.out.println(item);
    System.out.print("Cost before tax:");
    System.out.println(cost);
    System.out.print("The sales tax was:");
    System.out.println(salesTax);
    System.out.print("The total price was:");
    System.out.println(total);




  }
}
