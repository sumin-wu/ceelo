public class Ceelo
  {
   public void run()
	{
		char choice;
		do
		{
			System.out.println();
			choice = Jin.readChar("Do you want to play again?  ");
		} while(choice == 'y' || choice == 'Y');
	}

    	public int getDiceRoll()
	{
		Jin.pause("Press Enter to roll the dice.");
		int roll = Dice.rollDie();
		System.out.println("You rolled a(n) " + roll + ".");
		return roll;
	}

    public int takeTurn(Roller currentRoller)
    { 
          int roll1 = 0;
          int roll2 = 0;
          int roll3 = 0;
         roll1 = Dice.rollDie();
      System.out.println(roll1);
         roll2 = Dice.rollDie();
      System.out.println(roll2);
         roll3 = Dice.rollDie();
      System.out.println(roll3);
          int rollAll = roll1 + roll2 + roll3;
          int currentRollerScore = 0;
        
      if (rollAll == 15)
       {
          if (roll1 != 3 && roll2 != 3 && roll3 != 3)
          {
           System.out.println(currentRoller.rollerName + "rolled a 4,5,6");
			  return 8;
          }
       }

	
      if (rollAll ==6) 
       {
          if(roll1 != 4 && roll2 != 4 && roll3 != 4)
          {
            System.out.println(currentRoller.rollerName + "rolled 1,2,3.");
			  return -1;
          }
       } 
          if (roll1 == roll2 && roll2 == roll3)
      {
        System.out.println(currentRoller.rollerName + "rolled a triple of" + roll1 + "." );
        return 7; 
      }
        if (roll1 == roll2 && roll2 != roll3 )
      {
         currentRollerScore = roll3;
        System.out.println(currentRoller.rollerName + "has a score of" + currentRollerScore + ".");
        return roll3;
      }

        if (roll2 == roll3 && roll2 != roll1)
      {
         currentRollerScore = roll1;
        System.out.println(currentRoller.rollerName + "has a score of" + currentRollerScore + ".");
        return roll1;
      }

        if (roll3 == roll1 && roll2 != roll1)
      {
         currentRollerScore = roll2;
        System.out.println(currentRoller.rollerName + "has a score of" + currentRollerScore + ".");
         return roll2; 
      }
        else {
          return 0;  
            }  
      }
	
  public void checkScores(Roller currentRoller)
    { 
    if (currentRoller.rollerScore == 8)
    {
      currentRollerWon(currentRoller);
    }

    if (currentRoller.rollerScore == -1)
    {
      currentRollerLost(currentRoller);
    }
    }
    

  public void currentRollerWon(Roller currentRoller)
	{
		System.out.println( currentRoller.rollerName + "won!");
	}

	public void currentRollerLost(Roller currentRoller)
	{
		System.out.println(currentRoller.rollerName + " lost!");
	}
  }