public class PlayerOne {
    King king = new King(4, 0);
    Queen queen = new Queen(3, 0);
    Rook rookOne = new Rook(0, 0);
    Rook rookTwo = new Rook(7, 0);
    Bishop bishopOne = new Bishop(2, 0);
    Bishop bishopTwo = new Bishop(5, 0);
    Knight knightOne = new Knight(1, 0);
    Knight knightTwo = new Knight(6, 0);
    Pawn pawnOne = new Pawn(0, 1);
    Pawn pawnTwo = new Pawn(1, 1);
    Pawn pawnThree = new Pawn(2, 1);
    Pawn pawnFour = new Pawn(3, 1);
    Pawn pawnFive = new Pawn(4, 1);
    Pawn pawnSix = new Pawn(5, 1);
    Pawn pawnSeven = new Pawn(6, 1);
    Pawn pawnEight = new Pawn(7, 1);
    String playerName;
    public PlayerOne(String name) {
        this.playerName = name;
    }

}
