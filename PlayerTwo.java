public class PlayerTwo {
    King King = new King();
    Queen Queen = new Queen();
    Rook RookOne = new Rook(1,2);
    Rook RookTwo = new Rook(4,3);
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

    public PlayerTwo(String name) {
        this.playerName = name;
    }


}
