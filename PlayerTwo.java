public class PlayerTwo {
    King king = new King(4, 7);
    Queen queen = new Queen(3,7);
    Rook rookOne = new Rook(0,7);
    Rook rookTwo = new Rook(7,7);
    Bishop bishopOne = new Bishop(2,7);
    Bishop bishopTwo = new Bishop(5,7);
    Knight knightOne = new Knight(1,7);
    Knight knightTwo = new Knight(6,7);
    Pawn pawnOne = new Pawn(0,6);
    Pawn pawnTwo = new Pawn(1,6);
    Pawn pawnThree = new Pawn(2,6);
    Pawn pawnFour = new Pawn(3,6);
    Pawn pawnFive = new Pawn(4,6);
    Pawn pawnSix = new Pawn(5,6);
    Pawn pawnSeven = new Pawn(6,6);
    Pawn pawnEight = new Pawn(7,6);



    String playerName;

    public PlayerTwo(String name) {
        this.playerName = name;
    }


}
