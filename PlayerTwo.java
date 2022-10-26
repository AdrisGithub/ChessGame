public class PlayerTwo {
    King king = new King(4, 7,true);
    Queen queen = new Queen(3,7,true);
    Rook rookOne = new Rook(0,7,true);
    Rook rookTwo = new Rook(7,7,true);
    Bishop bishopOne = new Bishop(2,7,true);
    Bishop bishopTwo = new Bishop(5,7,true);
    Knight knightOne = new Knight(1,7,true);
    Knight knightTwo = new Knight(6,7,true);
    Pawn pawnOne = new Pawn(0,6,true);
    Pawn pawnTwo = new Pawn(1,6,true);
    Pawn pawnThree = new Pawn(2,6,true);
    Pawn pawnFour = new Pawn(3,6,true);
    Pawn pawnFive = new Pawn(4,6,true);
    Pawn pawnSix = new Pawn(5,6,true);
    Pawn pawnSeven = new Pawn(6,6,true);
    Pawn pawnEight = new Pawn(7,6,true);



    String playerName;

    public PlayerTwo(String name) {
        this.playerName = name;
    }


}
