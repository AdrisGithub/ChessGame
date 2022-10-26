public class PlayerTwo {
    King King = new King(4, 7);
    Queen Queen = new Queen(3,7);
    Rook RookOne = new Rook(0,7);
    Rook RookTwo = new Rook(7,7);
    Bishop BishopOne = new Bishop(2,7);
    Bishop BishopTwo = new Bishop(5,7);
    Knight KnightOne = new Knight(1,7);
    Knight KnightTwo = new Knight(6,7);
    Pawn PawnOne = new Pawn(0,6);
    Pawn PawnTwo = new Pawn(1,6);
    Pawn PawnThree = new Pawn(2,6);
    Pawn PawnFour = new Pawn(3,6);
    Pawn PawnFive = new Pawn(4,6);
    Pawn PawnSix = new Pawn(5,6);
    Pawn PawnSeven = new Pawn(6,6);
    Pawn PawnEight = new Pawn(7,6);



    String playerName;

    public PlayerTwo(String name) {
        this.playerName = name;
    }


}
