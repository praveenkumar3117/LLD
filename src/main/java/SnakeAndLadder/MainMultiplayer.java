package SnakeAndLadder;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainMultiplayer {

    public static void main(String [] args) throws InterruptedException {
        Board board = new Board();
        Utility utility = new Utility(board);
        Dice dice = new Dice(6);
        Queue<Player> playerQueue= new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int totalPlayers = scanner.nextInt();
        for(int i=0;i<totalPlayers;i++)
        {
            String playerName = scanner.next();
            Player player = new Player(playerName);
            playerQueue.add(player);
        }
        Game game = new Game(board,utility,dice,playerQueue);
        game.start();

    }
}
