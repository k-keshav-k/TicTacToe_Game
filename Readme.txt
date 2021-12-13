Keshav Krishna 2019CSB1224

README

HOW TO PLAY
Upon executing TicTacToe.java, the following option appear:

Tic Tac Toe
Player 1 <X> - Player 2 <O>
What to do want to play :
Type 1 for Player vs Player
Type 2 for Player vs Computer
 
Out of the two options, the user selects 1 or 2 to play with player or computer, respectively.
If he chooses 1 or 2, the following option appears:

1
| 0 || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
 
Out of the nine numbers, the player chooses a number to place his X on.
In case of player vs Player, the following screen appears on choosing the position of X by player 1:

Player 1, enter a number:
4
| 0 || 1 || 2 |
| 3 || X || 5 |
| 6 || 7 || 8 |
Player 2, enter a number:

Then player 2 chooses a number and the game continues.
In player vs computer, the following screen appears after player 1 enters the number:

What to do want to play :
Type 1 for Player vs Player
Type 2 for Player vs Computer
2
| 0 || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
0
| X || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Computer makes the following move:
| X || 1 || 2 |
| 3 || O || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
 
After the player makes a move, the computer responds with a move, which is displayed. Then player makes the move, followed by computer and this continues till the end of game.

GAME OVER
The game ends in a tie or a win.
The following screen appears in case of tie:

Tic Tac Toe
Player 1 <X> - Player 2 <O>
What to do want to play :
Type 1 for Player vs Player
Type 2 for Player vs Computer
2
| 0 || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
0
| X || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Computer makes the following move:
| X || 1 || 2 |
| 3 || O || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
6
| X || 1 || 2 |
| 3 || O || 5 |
| X || 7 || 8 |
Computer makes the following move:
| X || 1 || 2 |
| O || O || 5 |
| X || 7 || 8 |
Player 1, enter a number:
5
| X || 1 || 2 |
| O || O || X |
| X || 7 || 8 |
Computer makes the following move:
| X || 1 || O |
| O || O || X |
| X || 7 || 8 |
Player 1, enter a number:
1
| X || X || O |
| O || O || X |
| X || 7 || 8 |
Computer makes the following move:
| X || X || O |
| O || O || X |
| X || 7 || O |
Player 1, enter a number:
7
| X || X || O |
| O || O || X |
| X || X || O |
Game is over. It is a draw
 
The following appears in case of a win:

Tic Tac Toe
Player 1 <X> - Player 2 <O>
What to do want to play :
Type 1 for Player vs Player
Type 2 for Player vs Computer
1
| 0 || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
0
| X || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Player 2, enter a number:
1
| X || O || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
3
| X || O || 2 |
| X || 4 || 5 |
| 6 || 7 || 8 |
Player 2, enter a number: 
4
| X || O || 2 |
| X || O || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
6
| X || O || 2 |
| X || O || 5 |
| X || 7 || 8 |
1 player won the match
 
EXCEPTION HANDLING
Two types of exceptions may occur, the user may enter the same number twice or he may enter a number greater than 8.
In both the cases, the following screen appears instructing the user to enter input again:
 
Tic Tac Toe
Player 1 <X> - Player 2 <O>
What to do want to play :
Type 1 for Player vs Player
Type 2 for Player vs Computer
1
| 0 || 1 || 2 |
| 3 || 4 || 5 |
| 6 || 7 || 8 |
Player 1, enter a number:
9
Enter valid Input
Player 1, enter a number: