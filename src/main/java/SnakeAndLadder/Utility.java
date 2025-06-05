package SnakeAndLadder;

public class Utility {

    private Board board;
    Utility(Board board)
    {
        this.board=board;
    }

    public  void calculateNextPosition(Player player, int dice)
    {
        int nextPosition = player.getPosition() + dice;
        if(board.ladders.containsKey(nextPosition))
        {
            nextPosition=board.ladders.get(nextPosition);
            System.out.println(player.getName()  + " Climbs ladder from " + player.getPosition() + " to "+ nextPosition);

        }
        else {
            if(board.snakes.containsKey(nextPosition))
            {
                nextPosition= board.snakes.get(nextPosition);
                System.out.println("Snake bites " + player.getName() + " at " + (player.getPosition() + dice) + " to " + nextPosition);
            }
            else
            {
                if(nextPosition>100)
                {
                    return;
                }
            }
        }
        player.setPosition(nextPosition);

    }

}
