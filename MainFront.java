public class MainFront {
    public static void main(String[] args) {
        MainBack Game = new MainBack();
        char[][] chessBoard = new char[8][8];
        Game.setupChessBoard(chessBoard);
        Game.printChessBoard(chessBoard);

    }

}
