import java.util.Scanner;

public class PlayerOne {
    Scanner scanner = new Scanner(System.in);
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
    public void showOptionsKnight(){
        if(knightOne.isAlive()&& knightTwo.isAlive()) {
            System.out.println(" Welchen Knight willst du bewegen?\n" +
                    "1) Koords (Y X): " + knightOne.getYCoords() + " " + knightOne.getXCoords() + "\n" +
                    "2) Koords (Y X): " + knightTwo.getYCoords() + " " + knightTwo.getXCoords());
            int inputKnight = scanner.nextInt();
            switch (inputKnight) {
                case (1):
                    //
                    break;
                case (2):
                    //
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputKnight = scanner.nextInt();
            }
        }
        else if(knightOne.isAlive()){
            System.out.println("");
        }
        else if(knightTwo.isAlive()){
            System.out.println("");
        }else{
            System.out.println("Es sind keine Knights mehr auf dem Feld");
        }
    }
    public void showOptionsRook(){
        if(rookOne.isAlive()&& rookTwo.isAlive()) {
            System.out.println(" Welchen Knight willst du bewegen?\n" +
                    "1) Koords (Y X): " + rookOne.getYCoords() + " " + rookOne.getXCoords() + "\n" +
                    "2) Koords (Y X): " + rookTwo.getYCoords() + " " + rookTwo.getXCoords());
            int inputRook = scanner.nextInt();
            switch (inputRook) {
                case (1):
                    //
                    break;
                case (2):
                    //
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputRook = scanner.nextInt();
            }
        }
        else if(rookOne.isAlive()){
            System.out.println("");
        }
        else if(rookTwo.isAlive()){
            System.out.println("");
        }else{
            System.out.println("Es sind keine Knights mehr auf dem Feld");
        }
    }
    public void showOptionsBishop(){
        if(bishopOne.isAlive()&& bishopTwo.isAlive()) {
            System.out.println(" Welchen Knight willst du bewegen?\n" +
                    "1) Koords (Y X): " + bishopOne.getYCoords() + " " + bishopOne.getXCoords() + "\n" +
                    "2) Koords (Y X): " + bishopTwo.getYCoords() + " " + bishopTwo.getXCoords());
            int inputBishop = scanner.nextInt();
            switch (inputBishop) {
                case (1):
                    //
                    break;
                case (2):
                    //
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputBishop = scanner.nextInt();
            }
        }
        else if(bishopOne.isAlive()){
            System.out.println("");
        }
        else if(bishopTwo.isAlive()){
            System.out.println("");
        }else{
            System.out.println("Es sind keine Knights mehr auf dem Feld");
        }
    }

}
