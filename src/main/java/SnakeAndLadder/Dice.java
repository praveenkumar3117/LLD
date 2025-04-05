package SnakeAndLadder;

import java.util.Random;

public class Dice {
    private int diceRange;
    Dice(int diceRange)
    {
        this.diceRange=diceRange;
    }

    public int rollDice()
    {
        Random rand = new Random();
        return rand.nextInt(diceRange)+1;
    }
}
