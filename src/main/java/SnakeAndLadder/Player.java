package SnakeAndLadder;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private int position;

    Player (String name)
    {
        this.setName(name);
        this.setPosition(1);
    }
}
