package SnakeAndLadder;

import java.util.Random;

public class Main {
    public static void main(String [] args) throws InterruptedException {
        Board board = new Board();
        Player player1 = new Player("Praveen Saini");
        Player player2 = new Player("Prem Dayal");
        System.out.println(player1.getName() + " position " + player1.getPosition());
        System.out.println(player2.getName() + " position " + player2.getPosition());
        Utility utility= new Utility(board);
        int turn=0;
        while(true)
        {
            Thread.sleep(1000);
            Random rand = new Random();
            int diceThrow = rand.nextInt(6)+1;
            System.out.println("Dice: "+ diceThrow);
            //turn==0 means player's turn
            if(turn==0)
            {
                utility.calculateNextPosition(player1,diceThrow);
                if(player1.getPosition()==100)
                {
                    System.out.println(player1.getName() + "won");
                    break;
                }

            }
            else
            {
                utility.calculateNextPosition(player2,diceThrow);
                if(player2.getPosition()==100)
                {
                    System.out.println(player2.getName() + "won");
                    break;
                }

            }
            System.out.println(player1.getName() + " position " + player1.getPosition());
            System.out.println(player2.getName() + " position " + player2.getPosition());
            turn = 1- turn;
        }
    }
}
