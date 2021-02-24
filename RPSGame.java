//RPSGame.java
//Alan Stoloff
//User vs Computer RPS
// 3 February 2020
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class RPSGame
{
  public static void main(String[] args)
  {
    //initializes variables
    int yourScore=0;
    int compScore=0;
    boolean keepGoing=true;
    String compChoice=" ";
    String userChoice=" ";
    //creates a loop to keep the simulation going
    //asks for users choice (rock paper scissors or quit)
    //Deals with all the possibilities based on user choice
    while (keepGoing==true)
    {
      userChoice = JOptionPane.showInputDialog("Enter rock paper scissors or quit");

      Random rand = new Random();
      int choice=rand.nextInt(3);
      if(userChoice.equals("quit"))
      {
        keepGoing=false;
        if(yourScore<compScore)
        {
          JOptionPane.showMessageDialog(null," The computer won and scored "+ compScore+ "and you scored "+ yourScore);
        }
        if(yourScore>compScore)
        {
          JOptionPane.showMessageDialog(null," You won!! the computer scored "+ compScore+ " and yous scored "+ yourScore);
        }
      }
      else if(choice==1)
      {
        compChoice="paper";
        if (userChoice.equals("rock"))
        {
          compScore+=1;
          JOptionPane.showMessageDialog(null,"Paper beats rock...you lose");
        }
        else if (userChoice.equals("scissors"))
        {
          yourScore+=1;
          JOptionPane.showMessageDialog(null,"Scissors beats paper...you win");
        }
        else if (userChoice.equals("paper"))
        {
          JOptionPane.showMessageDialog(null,"This round is a tie");
        }
        else
        {
          JOptionPane.showMessageDialog(null,"not valid input");
        }
      }
      else if(choice==2)
      {
        compChoice="scissors";
        if (userChoice.equals("paper"))
        {
          JOptionPane.showMessageDialog(null,"Scissors beats paper...you lose");
          compScore+=1;
        }
        else if (userChoice.equals("rock"))
        {
          JOptionPane.showMessageDialog(null,"Rock beats scissors...you win");
          yourScore+=1;
        }
        else if (userChoice.equals("scissors"))
        {
          JOptionPane.showMessageDialog(null,"This round is a tie");
        }
        else
        {
          JOptionPane.showMessageDialog(null,"not valid input");
        }
      }
      else if(choice==0)
      {
        compChoice="rock";
        if(userChoice.equals("scissors"))
        {
          JOptionPane.showMessageDialog(null,"Rock beats paper...you lose");
        }
        else if(userChoice.equals("paper"))
        {
          JOptionPane.showMessageDialog(null,"Paper beats rock...you win");
          yourScore+=1;
        }
        else if(userChoice.equals("rock"))
        {
          JOptionPane.showMessageDialog(null,"This round is a tie");
        }
        else
        {
          JOptionPane.showMessageDialog(null,"not valid input");
        }
      }

    }
    System.exit(0);
  }
}
