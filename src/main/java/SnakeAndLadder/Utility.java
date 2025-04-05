package SnakeAndLadder;

public class Utility {

    private Board board;
    Utility(Board board)
    {
        this.board=board;
    }

    public  int calculateNextPosition(Player player, int dice)
    {
        int nextPosition = player.getPosition() + dice;
        if(board.ladders.containsKey(nextPosition))
        {
            nextPosition=board.ladders.get(nextPosition);
            System.out.println(player.getName()  + " Climbs ladder ");

        }
        else {
            if(board.snakes.containsKey(nextPosition))
            {
                nextPosition= board.snakes.get(nextPosition);
                System.out.println("Snake bites " + player.getName());
            }
            else
            {
                if(nextPosition>100)
                {
                    return player.getPosition();
                }
            }
        }
        return nextPosition;
    }

}
