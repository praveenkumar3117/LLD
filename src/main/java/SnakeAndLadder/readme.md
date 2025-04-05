This is a game of snake and ladders
We have Board, Dice, Game, Player, Utility classes. All are simple and self-explanatory

We are initializing the ladders and snakes in Board constructor, for now I have hardcoded it. Later on I will inject them using constructor injection

Dice contains the diceRange, and RollDice function

Game contains the logic of the game. Every player gets it's turn in round-robin manner. If a player hits 6, he gets another chance.
If he hits 3 sixes consecutively, then this turn is skipped and player had to return the initial position.
The first player to reach 100 wins.

Utility contains a function that calculated the position of the player on the basis of dice roll, if snakes bites, if he climbs ladder



SRP is strongly used here. Each class has a single reason to change.
Constructor dependency injection is used in Game class.
We have made util functions also.
Later on i will enhance it

Enhancement that can be made
1. Live console board
2. Results after game finishes
3. Configuring players dynamically. (reading some json files or something else)
4. Support multiple dice.