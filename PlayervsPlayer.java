public class PlayervsPlayer extends Game{

    public void Winner(){
        endGame(winner);
    }

    public void endGame(int p){
        if (p == 0){
            System.out.println("Game is over. It is a draw");
        }
        else{
            System.out.println(p + " player won the match");
        }
    }
}
