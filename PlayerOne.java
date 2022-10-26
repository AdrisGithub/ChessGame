public class PlayerOne {
    King King = new King();
    Queen Queen = new Queen();
    Rook RookOne = new Rook(0,0);
    Rook RookTwo = new Rook(0,3);
    Bishop BishopOne = new Bishop();
    Bishop BishopTwo = new Bishop();
    Knight KnightOne = new Knight();
    Knight KnightTwo = new Knight();
    Pawn PawnOne = new Pawn(1,2);
    Pawn PawnTwo = new Pawn(3,4);
    Pawn PawnThree = new Pawn(1,2);
    Pawn PawnFour = new Pawn(3,4);
    Pawn PawnFive = new Pawn(1,2);
    Pawn PawnSix = new Pawn(3,4);
    Pawn PawnSeven = new Pawn(1,2);
    Pawn PawnEight = new Pawn(3,4);


    String playerName;

    public PlayerOne(String name) {
        this.playerName = name;
    }
}