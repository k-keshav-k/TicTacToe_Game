public abstract class Game {

    protected int [][] matrix = new int[3][3];
    protected int[][] r = new int[3][2];
    protected int[][] c = new int[3][2];
    protected int[][] d = new int[2][2];
    protected int count;
    protected int turn;
    protected boolean game_over;
    protected int winner;
    protected boolean validInput;

    public Game(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matrix[i][j] = 0;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                r[i][j] = 0;
                c[i][j] = 0;
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                d[i][j] = 0;
            }
        }
        game_over = false;
        winner = 0;
        count = 0;
        turn = 1;
        validInput = true;
    }

    public void setValue(int num){
        validInput = true;
        int rc;
        rc = num/3;
        int cc = num%3;
        if (rc>2 || cc>2 || matrix[rc][cc] != 0) {validInput = false;return;} 
        matrix[rc][cc] = turn;
        r[rc][turn-1]++;
        c[cc][turn-1]++;
        if (rc == cc) d[0][turn-1]++;
        if (rc + cc == 2) d[1][turn-1]++;
        if (r[rc][turn-1] == 3 || c[cc][turn-1] == 3 || d[0][turn-1] == 3 || d[1][turn-1] == 3) {
            game_over = true;
            winner = turn;
        }
        count++;
        if (count == 9) game_over = true;  
        if (turn == 1) turn = 2;
        else turn = 1;
    }

    public boolean checkInput(){
        return validInput;
    }

    public int getPlayer(){
        return turn;
    }

    /*public void Winner(){
        endGame(winner);
    }*/

    public int getWinner(){
        return winner;
    }

    public boolean checkGameOver(){
        return game_over;
    }

    /*public void endGame(int p){
        if (p == 0){
            System.out.println("Game is over. It is a draw");
        }
        else{
            System.out.println(p + " player won the match");
        }
    }*/

    public void displayMatrix(){
        int countDM = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(matrix[i][j] == 0){
                    System.out.print("| " + countDM + " |");
                }
                else if (matrix[i][j] == 1){
                    System.out.print("| X |");
                }
                else if (matrix[i][j] == 2){
                    System.out.print("| O |");
                }
                countDM++;
            }
            System.out.println();
        }
    }

    public void defaultMatrix(){
        int val = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("| " + val + " |");
                val++;
            }
            System.out.println();
        }
    }
}