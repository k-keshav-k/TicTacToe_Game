import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Game g = new Game();
        System.out.println("Tic Tac Toe");
        System.out.println("Player 1 <X> - Player 2 <O>");
        System.out.println("What to do want to play : ");
        System.out.println("Type 1 for Player vs Player");
        System.out.println("Type 2 for Player vs Computer");
        int comp = sc.nextInt();
        //g.defaultMatrix();
        if (comp == 1){
            PlayervsPlayer g = new PlayervsPlayer();
            g.defaultMatrix();
            while(g.checkGameOver() == false){
                int p = g.getPlayer();
                System.out.println("Player "+ p + ", enter a number: ");
                int num = sc.nextInt();
                g.setValue(num);
                if(g.checkInput() == false){
                    System.out.println("Enter valid Input");
                    continue;
                }
                g.displayMatrix();
            }
            g.Winner();
        }
        else{
            PlayervsComputer g = new PlayervsComputer();
            g.defaultMatrix();
            while(g.checkGameOver() == false){
                int p = g.getPlayer();
                if (p == 2){
                    System.out.println("Computer makes the following move:");
                    g.makeMove();
                    g.displayMatrix();
                }
                else{
                    System.out.println("Player "+ p + ", enter a number: ");
                    int num = sc.nextInt();
                    g.setValue(num);
                    if(g.checkInput() == false){
                        System.out.println("Enter valid Input");
                        continue;
                    }
                    g.displayMatrix();
                }
            }
            g.Winner();
        }
        sc.close();
    }
}
