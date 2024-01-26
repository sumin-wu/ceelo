# ceelo

#Overview:
#Ceelo is played with 3 dice.
#Scoring occurs in 4 ways:
#A roll of triples (the same result on all 3 dice) is an automatic win.
#A roll of 4 5 6 is an automatic win.
#A roll of 1 2 3 is an automatic loss.
#The players consist of “The Banker” who rolls first and “The Rollers” who try to beat the Banker.
#For example, a roll of 6 6 2 generates a score of 2. Any other roll is invalid, and the player needs to roll again. A roll of doubles generates a score from the result of the 3rd die.

#Starting the Game:
#First, the computer should ask how many Rollers are playing against the banker (1 – 4).
#The user decides the number and enters a name for each of the rollers.
#The Banker’s Turn
#The Banker starts by rolling all 3 dice.
#If the banker rolls a triple or a 4 5 6, they win, and all other Rollers lose.
#If the banker rolls a 1 2 3, they lose, and all other Rollers win.
#If the banker rolls doubles, the unmatched die represents the banker’s score.
#If the banker rolls anything else (3 unmatched dice), they must roll again.
#If the banker wins or loses on their roll, the game is over. Otherwise, the players get to roll.

#The Players’ Turns:
Players lose if they roll 1 2 3 and beat the banker with a roll of 4 5 6 or triples.
The game should include 1 - 4 players who take their turns in any order, competing against the banker, not each other.
If a player rolls doubles, their score is determined by the unmatched die. They beat the banker if their score meets or exceeds the banker’s score. If a player rolls anything else, they must roll again.

#Class Structure:
#Roller Class: Represents each player, knowing its name and score (starting at 0).
#Dice Class: Can be reused from Craps shot on goal or a new method for rolling dice can be created.
#Ceelo Class: Manages the game, needing a banker and up to 4 rollers.
#The banker is considered a special roller and is managed by the Ceelo class, which also decides whether the rollers get to roll.

This project outlines a game simulation that incorporates user interaction, object-oriented programming principles, and enhancements for extended gameplay.
