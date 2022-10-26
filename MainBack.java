public class MainBack {
    public MainBack(){

    }
    PlayerOne playerOne = new PlayerOne("Tobi");
    PlayerTwo playerTwo = new PlayerTwo("Tim");

    public void  test(){

    }

    public void printChessBoard(char[][] board){
        for(int i=0;i< board.length;i++){
            for(int o=0;o< board.length;o++){
                System.out.print(board[o][i]+"  ");
            }
            System.out.print("\n");
        }
        System.out.println("Legend:\nR is Rook K is Knight B is Bishop Q is Queen W is King P is Pawns");
    }
    public void setupChessBoard(char[][] board){
        for(int i=0;i< board.length;i++){
            for(int o=0;o< board.length;o++) {
                board[i][o]='◯';
            }
        }
        for(int i=0;i< board.length;i++){
            board[i][1]='P';
            board[i][6]='p';
        }
        board[0][0]='R';
        board[1][0]='K';
        board[2][0]='B';
        board[3][0]='Q';
        board[4][0]='W';
        board[5][0]='B';
        board[6][0]='K';
        board[7][0]='R';
        board[0][7]='r';
        board[1][7]='k';
        board[2][7]='b';
        board[3][7]='q';
        board[4][7]='w';
        board[5][7]='b';
        board[6][7]='k';
        board[7][7]='r';
    }

}