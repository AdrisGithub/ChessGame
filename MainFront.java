public class MainFront {
    public static void main(String[] args) {
        MainBack Game = new MainBack();

        Game.setupChessBoard();
        Game.printChessBoard();
        System.out.println("Legend:\nR is Rook K is Knight B is Bishop Q is Queen W is King P is Pawn\nLeft Side is Black Right Side is White");
        Game.playerOne.pawnEight.setXCoords(5);
        Game.playerOne.pawnEight.setYCoords(6);
        Game.playerOne.king.setYXCoords(5,6);
        Game.setupChessBoard();
        Game.printChessBoard();

    }

}
