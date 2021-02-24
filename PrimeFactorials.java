//PrimeFactorials.java
//Alan Stoloff
//Produces a list of prime factorials
// 3 February 2020
import java.util.Scanner;

public class PrimeFactorials
{
  public static void main(String[] args)
  {
    //loop tests numbers 1-100
    double currentFac=0;
    for(int i=1;i`<101;i++)
    {
      boolean compareValue=isPrime(i);
      if (compareValue==true)
      {
        currentFac=factorial(i);
        System.out.printf("The original number is %d and its factorial is %.0f \n", i,currentFac);
      }
    }
  }
  //method checks if number is prime
  public static boolean isPrime(int num){
    if(num <=1)
    {
      return false;
    }
    for(int i=2;i<num;i++)
    {
      if(num%i==0)
      {
        return false;
      }
    }
    return true;
  }
  //method produces the factorial of the number
  public static double factorial(int num){
    double numFac=1;
    for(int i=2;i<=num;i++)
    {
      numFac*=i;
    }
    return numFac;
  }
}
