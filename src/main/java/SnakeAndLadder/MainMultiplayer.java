package SnakeAndLadder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class MainMultiplayer {

    public static void main(String [] args)
    {
        Board board = new Board();
        Utility utility = new Utility(board);
        Dice dice = new Dice(6);
        Queue<Player> playerQueue= new LinkedList<>();
        Player player1 = new Player("Praveen Saini");
        Player player2 = new Player("Prem Dayal");
        Player player3 = new Player("Aditya Seth");
        playerQueue.add(player1);
        playerQueue.add(player2);
        playerQueue.add(player3);
        Game game = new Game(board,utility,dice,playerQueue);
        game.start();

    }
}
