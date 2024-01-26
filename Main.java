public class Main 
{
  public static void main(String[] args) 
  {
	  Ceelo c = new Ceelo();
    
    System.out.println("It's you (and your friends) against the Banker.");

      int playerAmt = Jin.readInt("Let's begin. How many players are playing right now?");

    Roller banker = new Roller();
    Roller roller1 = new Roller();
    Roller roller2 = new Roller();
    Roller roller3 = new Roller();
    Roller roller4 = new Roller();
    
    banker.rollerName = "banker";
    int bankerScore = -2;

        while (bankerScore == -2 || bankerScore == 0)
		    {
  			bankerScore = c.takeTurn(banker);
        }
      
    int roller2Score = 0;
    int roller1Score = 0;
    int roller3Score = 0;
    int roller4Score = 0;
    roller1.rollerName = "roller1";
    roller2.rollerName = "roller2";
    roller3.rollerName = "roller3";
    roller4.rollerName = "roller4";

if (bankerScore != 8 && bankerScore != -1)
{ 
    if (playerAmt == 1 || playerAmt == 2 || playerAmt == 3 || playerAmt ==4)
      {
         while ( roller1Score == 0)
         {
           roller1Score = c.takeTurn(roller1);
         }
         if (roller1Score > bankerScore)
         {
           c.currentRollerWon(roller1);
         }
      }
          else 
        {
          System.out.println("Not a valid number of players.");
        }

      if (playerAmt ==2 || playerAmt ==4 || playerAmt ==3)
      {
      roller2Score = c.takeTurn(roller2);
         while ( roller2Score == 0)
         {
           roller2Score = c.takeTurn(roller2);
         }
         if (roller2Score > bankerScore)
         {
           c.currentRollerWon(roller2);
         }
      }


      if (playerAmt ==4 || playerAmt ==3)
      {
      roller3Score = c.takeTurn(roller3);
         while ( roller3Score == 0)
         {
           roller3Score = c.takeTurn(roller3);
         }
         if (roller3Score > bankerScore)
         {
           c.currentRollerWon(roller3);
         }
      }

      if (playerAmt ==4)
      {
      roller4Score = c.takeTurn(roller4);
         while ( roller4Score == 0)
         {
           roller4Score = c.takeTurn(roller4);
         }
         if (roller4Score > bankerScore)
         {
           c.currentRollerWon(roller4);
         }
      }

}
}
}