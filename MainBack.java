public class MainBack {
    public MainBack() {

    }

    PlayerOne playerOne = new PlayerOne("Tobi");
    PlayerTwo playerTwo = new PlayerTwo("Tim");
    char[][] chessBoard = new char[8][8];


    public void printChessBoard() {
        for (int y = 0; y < chessBoard.length; y++) {
            for (int x = 0; x < chessBoard.length; x++) {
                System.out.print(chessBoard[y][x] + "  ");
            }
            System.out.print("\n");
        }
    }

    public void setupChessBoard() {
        for (int y = 0; y < chessBoard.length; y++) {
            for (int x = 0; x < chessBoard.length; x++) {
                if ((y == playerOne.bishopOne.getYCoords() && x == playerOne.bishopOne.getXCoords()) || (y == playerOne.bishopTwo.getYCoords() && x == playerOne.bishopTwo.getXCoords())) {
                    chessBoard[y][x] = 'B';
                } else if (y == playerOne.king.getYCoords() && x == playerOne.king.getXCoords()) {
                    chessBoard[y][x] = 'W';
                } else if ((y == playerOne.knightOne.getYCoords() && x == playerOne.knightOne.getXCoords()) || (y == playerOne.knightTwo.getYCoords() && x == playerOne.knightTwo.getXCoords())) {
                    chessBoard[y][x] = 'K';
                } else if (y == playerOne.queen.getYCoords() && x == playerOne.queen.getXCoords()) {
                    chessBoard[y][x] = 'Q';
                } else if ((y == playerOne.rookOne.getYCoords() && x == playerOne.rookOne.getXCoords()) || (y == playerOne.rookTwo.getYCoords() && x == playerOne.rookTwo.getXCoords())) {
                    chessBoard[y][x] = 'R';
                } else if (isPawnPOneOnThisField(y,x)) {
                    chessBoard[y][x] = 'P';
                }else if ((y == playerTwo.bishopOne.getYCoords() && x == playerTwo.bishopOne.getXCoords()) || (y == playerTwo.bishopTwo.getYCoords() && x == playerTwo.bishopTwo.getXCoords())) {
                    chessBoard[y][x] = 'b';
                } else if (y == playerTwo.king.getYCoords() && x == playerTwo.king.getXCoords()) {
                    chessBoard[y][x] = 'w';
                } else if ((y == playerTwo.knightOne.getYCoords() && x == playerTwo.knightOne.getXCoords()) || (y == playerTwo.knightTwo.getYCoords() && x == playerTwo.knightTwo.getXCoords())) {
                    chessBoard[y][x] = 'k';
                } else if (y == playerTwo.queen.getYCoords() && x == playerTwo.queen.getXCoords()) {
                    chessBoard[y][x] = 'q';
                } else if ((y == playerTwo.rookOne.getYCoords() && x == playerTwo.rookOne.getXCoords()) || (y == playerTwo.rookTwo.getYCoords() && x == playerTwo.rookTwo.getXCoords())) {
                    chessBoard[y][x] = 'r';
                } else if (isPawnPTwoOnThisField(y,x)) {
                    chessBoard[y][x] = 'p';
                } else {
                    chessBoard[y][x] = '◯';
                }
            }
        }
    }
    public boolean isPawnPOneOnThisField(int y, int x){
        return (y == playerOne.pawnOne.getYCoords() && x == playerOne.pawnOne.getXCoords()) || (y == playerOne.pawnTwo.getYCoords() && x == playerOne.pawnTwo.getXCoords()) || (y == playerOne.pawnThree.getYCoords() && x == playerOne.pawnThree.getXCoords()) || (y == playerOne.pawnFour.getYCoords() && x == playerOne.pawnFour.getXCoords()) || (y == playerOne.pawnFive.getYCoords() && x == playerOne.pawnFive.getXCoords()) || (y == playerOne.pawnSix.getYCoords() && x == playerOne.pawnSix.getXCoords()) || (y == playerOne.pawnSeven.getYCoords() && x == playerOne.pawnSeven.getXCoords()) || (y == playerOne.pawnEight.getYCoords() && x == playerOne.pawnEight.getXCoords());
    }
    public boolean isPawnPTwoOnThisField(int y, int x){
        return ((y == playerTwo.pawnOne.getYCoords() && x == playerTwo.pawnOne.getXCoords()) || (y == playerTwo.pawnTwo.getYCoords() && x == playerTwo.pawnTwo.getXCoords()) || (y == playerTwo.pawnThree.getYCoords() && x == playerTwo.pawnThree.getXCoords()) || (y == playerTwo.pawnFour.getYCoords() && x == playerTwo.pawnFour.getXCoords()) || (y == playerTwo.pawnFive.getYCoords() && x == playerTwo.pawnFive.getXCoords()) || (y == playerTwo.pawnSix.getYCoords() && x == playerTwo.pawnSix.getXCoords()) || (y == playerTwo.pawnSeven.getYCoords() && x == playerTwo.pawnSeven.getXCoords()) || (y == playerTwo.pawnEight.getYCoords() && x == playerTwo.pawnEight.getXCoords()));
    }

}