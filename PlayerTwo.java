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
    public boolean areBishopsOnThisField(int y, int x){
        return (bishopOne.isBishopOnThisField(y,x)||bishopTwo.isBishopOnThisField(y,x));
    }
    public boolean areKingsOnThisField(int y, int x){
        return (king.isKingOnThisField( y, x));
    }
    public boolean arePawnsOnThisField(int y, int x){
        return (pawnOne.isPawnOnThisField(y,x)||pawnTwo.isPawnOnThisField(y,x)||pawnThree.isPawnOnThisField(y,x)
                ||pawnFour.isPawnOnThisField(y,x)||pawnFive.isPawnOnThisField(y,x)||pawnSix.isPawnOnThisField(y,x)
                ||pawnSeven.isPawnOnThisField(y,x)||pawnEight.isPawnOnThisField(y,x));
    }
    public boolean areKnightsOnThisField(int y, int x){
        return (knightOne.isKnightOnThisField(y,x) || knightTwo.isKnightOnThisField(y,x));
    }
    public boolean areQueensOnThisField(int y, int x){
        return (queen.isQueenOnThisField(y,x));
    }
    public boolean areRooksOnThisField(int y, int x){
        return (rookOne.isRookOnThisField(y,x)|| rookTwo.isRookOnThisField(y,x));
    }


}
