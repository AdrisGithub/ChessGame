public class PlayerOne {
    King King = new King(4,0);
    Queen Queen = new Queen(3,0);
    Rook RookOne = new Rook(0,0);
    Rook RookTwo = new Rook(7,0);
    Bishop BishopOne = new Bishop(2,0);
    Bishop BishopTwo = new Bishop(5,0);
    Knight KnightOne = new Knight(1,0);
    Knight KnightTwo = new Knight(6,0);
    Pawn PawnOne = new Pawn(0,1);
    Pawn PawnTwo = new Pawn(1,1);
    Pawn PawnThree = new Pawn(2,1);
    Pawn PawnFour = new Pawn(3,1);
    Pawn PawnFive = new Pawn(4,1);
    Pawn PawnSix = new Pawn(5,1);
    Pawn PawnSeven = new Pawn(6,1);
    Pawn PawnEight = new Pawn(7,1);


    String playerName;

    public PlayerOne(String name) {
        this.playerName = name;
    }
}