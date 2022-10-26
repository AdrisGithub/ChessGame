public class PlayerOne {
    King king = new King(4, 0,true);
    Queen queen = new Queen(3, 0,true);
    Rook rookOne = new Rook(0, 0,true);
    Rook rookTwo = new Rook(7, 0,true);
    Bishop bishopOne = new Bishop(2, 0,true);
    Bishop bishopTwo = new Bishop(5, 0,true);
    Knight knightOne = new Knight(1, 0,true);
    Knight knightTwo = new Knight(6, 0,true);
    Pawn pawnOne = new Pawn(0, 1,true);
    Pawn pawnTwo = new Pawn(1, 1,true);
    Pawn pawnThree = new Pawn(2, 1,true);
    Pawn pawnFour = new Pawn(3, 1,true);
    Pawn pawnFive = new Pawn(4, 1,true);
    Pawn pawnSix = new Pawn(5, 1,true);
    Pawn pawnSeven = new Pawn(6, 1,true);
    Pawn pawnEight = new Pawn(7, 1,true);
    String playerName;
    public PlayerOne(String name) {
        this.playerName = name;
    }

}
