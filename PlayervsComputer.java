public class PlayervsComputer extends Game{
    
    public void Winner(){
        endGame(winner);
    }

    public void endGame(int p){
        if (p == 0){
            System.out.println("Game is over. It is a draw");
        }
        else if (p == 1){
            System.out.println(p + " player won the match");
        }
        else {
            System.out.println("Computer won! You lost");
        }
    }

    public void makeMove(){
        count++;
        for(int i=0;i<3;i++){
            if (r[i][1] == 2){
                boolean ch = false;
                if (matrix[i][0] == 0) {matrix[i][0] = 2;ch = true;}
                else if (matrix[i][1] == 0) {matrix[i][1] = 2;ch = true;}
                else if (matrix[i][2] == 0) {matrix[i][2] = 2;ch = true;}
                if (ch == true){
                    game_over = true;
                    winner = turn;
                    //System.out.println("y");
                    return;
                }
            }
        }
        for(int i=0;i<3;i++){
            if (c[i][1] == 2){
                boolean ch = false;
                if (matrix[0][i] == 0) {matrix[0][i] = 2;ch = true;}
                else if (matrix[1][i] == 0) {matrix[1][i] = 2;ch = true;}
                else if (matrix[2][i] == 0) {matrix[2][i] = 2;ch = true;}
                if (ch == true){
                    game_over = true;
                    winner = turn;
                    return;
                }
            }
        }
        if (d[0][1] == 2){
            boolean ch = false;
            if (matrix[0][0] == 0) {matrix[0][0] = 2;ch = true;}
            else if (matrix[1][1] == 0) {matrix[1][1] = 2;ch = true;}
            else if (matrix[2][2] == 0) {matrix[2][2] = 2;ch = true;}
            if (ch == true){
                game_over = true;
                winner = turn;
                return;
            }
        }
        else if (d[1][1] == 2){
            boolean ch = false;
            if (matrix[2][0] == 0) {matrix[2][0] = 2;ch = true;}
            else if (matrix[1][1] == 0) {matrix[1][1] = 2;ch = true;}
            else if (matrix[0][2] == 0) {matrix[0][2] = 2;ch = true;}
            if (ch == true){
                game_over = true;
                winner = turn;
                return;
            }
        }
        for(int i=0;i<3;i++){
            if (r[i][0] == 2){
                boolean ch = false;
                if (matrix[i][0] == 0) {
                    matrix[i][0] = 2;
                    ch = true;
                    r[i][1]++;
                    c[0][1]++;
                    if (i == 0){
                        d[0][1]++;
                    }
                    if (i == 2){
                        d[1][1]++;
                    }
                }
                else if (matrix[i][1] == 0) {
                    matrix[i][1] = 2;
                    ch = true;
                    r[i][1]++;
                    c[1][1]++;
                    if (i == 1){
                        d[0][1]++;
                        d[1][1]++;
                    }
                }
                else if (matrix[i][2] == 0) {
                    matrix[i][2] = 2;
                    ch = true;
                    r[i][1]++;
                    c[2][1]++;
                    if (i == 0){
                        d[1][1]++;
                    }
                    if (i == 2){
                        d[0][1]++;
                    }
                }
                if (ch == true){
                    turn = 1;
                    return;
                }
            }
        }
        for(int i=0;i<3;i++){
            if (c[i][0] == 2){
                boolean ch = false;
                if (matrix[0][i] == 0) {
                    matrix[0][i] = 2;
                    ch = true;
                    r[0][1]++;
                    c[i][1]++;
                    if (i == 0){
                        d[0][1]++;
                    }
                    if (i == 2){
                        d[1][1]++;
                    }
                }
                else if (matrix[1][i] == 0) {
                    matrix[1][i] = 2;
                    ch = true;
                    r[1][1]++;
                    c[i][1]++;
                    if (i == 1){
                        d[0][1]++;
                        d[1][1]++;
                    }
                }
                else if (matrix[2][i] == 0) {
                    matrix[2][i] = 2;ch = true;
                    r[2][1]++;
                    c[i][1]++;
                    if (i == 0){
                        d[1][1]++;
                    }
                    if (i == 2){
                        d[0][1]++;
                    }
                }
                if (ch == true){
                    turn = 1;
                    return;
                }
            }
        }
        if (d[0][0] == 2){
            boolean ch = false;
            if (matrix[0][0] == 0) {
                matrix[0][0] = 2;
                ch = true;
                r[0][1]++;
                c[0][1]++;
                d[0][1]++;
            }
            else if (matrix[1][1] == 0) {
                matrix[1][1] = 2;
                ch = true;
                r[1][1]++;
                c[1][1]++;
                d[0][1]++;
                d[1][1]++;
            }
            else if (matrix[2][2] == 0) {
                matrix[2][2] = 2;
                ch = true;
                r[2][1]++;
                c[2][1]++;
                d[0][1]++;
            }
            if (ch == true){
                turn = 1;
                return;
            }
        }
        if (d[1][0] == 2){
            boolean ch = false;
            if (matrix[2][0] == 0) {
                matrix[2][0] = 2;
                ch = true;
                r[2][1]++;
                c[0][1]++;
                d[1][1]++;
            }
            else if (matrix[1][1] == 0) {
                matrix[1][1] = 2;
                ch = true;
                r[1][1]++;
                c[1][1]++;
                d[0][1]++;
                d[1][1]++;
            }
            else if (matrix[0][2] == 0) {
                matrix[0][2] = 2;
                ch = true;
                r[0][1]++;
                c[2][1]++;
                d[1][1]++;
            }
            if (ch == true){
                turn = 1;
                return;
            }
        }
        if (matrix[1][1] == 0){
            matrix[1][1] = 2;
            r[1][1]++;
            c[1][1]++;
            d[0][1]++;
            d[1][1]++;
        }
        else if (matrix[0][0] == 0){
            matrix[0][0]= 2;
            r[0][1]++;
            c[0][1]++;
            d[0][1]++;
        }
        else if (matrix[0][2] == 0){
            matrix[0][2]= 2;
            r[0][1]++;
            c[2][1]++;
            d[1][1]++;
        }
        else if (matrix[2][0] == 0){
            matrix[2][0]= 2;
            r[2][1]++;
            c[0][1]++;
            d[1][1]++;
            
        }
        else if (matrix[2][2] == 0){
            matrix[2][2]= 2;
            r[2][1]++;
            c[2][1]++;
            d[0][1]++;
        }
        else{
            for(int i=0;i<3;i++){
                boolean endloop = false;
                for(int j=0;j<3;j++){
                    if (matrix[i][j] == 0){
                        matrix[i][j]=2;
                        r[i][1]++;
                        c[j][1]++;
                        if (i == j) d[0][1]++;
                        if (i+j == 2) d[1][1]++;
                        endloop = true;
                    }
                    if (endloop == true) break;
                }
            }
        }
        turn = 1;
    }
}
