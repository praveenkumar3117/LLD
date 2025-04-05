package SnakeAndLadder;


import java.util.HashMap;

public class Board {
    HashMap<Integer, Integer> snakes = new HashMap<Integer, Integer>();
    HashMap<Integer, Integer> ladders= new HashMap<Integer,Integer>();

    Board()
    {
        snakes.put(99,41);
        snakes.put(95,67);
        snakes.put(89,85);
        snakes.put(78,15);
        snakes.put(57,2);
        snakes.put(54,27);
        snakes.put(11,6);


        ladders.put(3,45);
        ladders.put(8,12);
        ladders.put(14,26);
        ladders.put(21,39);
        ladders.put(31,73);
        ladders.put(59,80);
        ladders.put(83,97);
        ladders.put(90,92);
    }
}
