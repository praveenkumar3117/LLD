package SnakeAndLadder;

import java.util.Queue;

public class Game {
    Board board;
    Utility utility;
    Dice dice;
    Queue<Player> playerQueue;
    Game(Board board, Utility utility, Dice dice, Queue<Player> playerQueue)
    {
        this.board = board;
        this.utility = utility;
        this.dice = dice;
        this.playerQueue = playerQueue;
    }

    public void start()
    {
        while(!playerQueue.isEmpty())
        {
            Player currentPlayer = playerQueue.poll();
            int currentPosition= currentPlayer.getPosition();
            System.out.println(currentPlayer.getName() + " current position is " + currentPosition);
            System.out.println(currentPlayer.getName() + " is playing");

            int consecutiveSixes=0;
            while(consecutiveSixes<3)
            {
                int diceRoll = dice.rollDice();
                System.out.println("Dice: "+ diceRoll);
                if(diceRoll ==6)
                {
                    consecutiveSixes++;
                    if(consecutiveSixes==3)
                    {
                        currentPlayer.setPosition(currentPosition);
                        break;
                    }
                    else
                    {
                        currentPlayer.setPosition(utility.calculateNextPosition(currentPlayer,diceRoll));
                        if(currentPlayer.getPosition()==100)
                        {
                            break;
                        }
                        System.out.println(currentPlayer.getName() + " hits a 6, roll again");
                    }
                }
                else
                {
                    currentPlayer.setPosition(utility.calculateNextPosition(currentPlayer,diceRoll));
                    break;
                }
            }
            if(currentPlayer.getPosition()==100)
            {
                System.out.println(currentPlayer.getName() + " won ");
                break;
            }
            else {
                playerQueue.add(currentPlayer);
            }
        }
    }
}
