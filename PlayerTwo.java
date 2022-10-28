

import java.util.Scanner;

public class PlayerTwo {
    Scanner scanner = new Scanner(System.in);
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
    public void showOptionsKnight(){
        if(knightOne.isAlive()&& knightTwo.isAlive()){
            System.out.println(" Welchen Knight willst du bewegen?\n" +
                    "1) Koords (Y X): "+knightOne.getYCoords()+" "+knightTwo.getXCoords()+"\n"+
                    "2) Koords (Y X): "+knightTwo.getYCoords()+" "+knightTwo.getXCoords());
            int inputKnight = scanner.nextInt();
            switch(inputKnight){
                case(1):
                    knightOne.setNewYXCoords();
                case(2):
                    knightTwo.setNewYXCoords();
                default:
                    System.out.println("Falsche Eingabe");
                    inputKnight = scanner.nextInt();
            }
        }
        else if(knightOne.isAlive()){
            knightOne.setNewYXCoords();
        }
        else if(knightTwo.isAlive()){
            knightTwo.setNewYXCoords();
        }else{
            System.out.println("Es sind keine Knight mehr auf dem Feld");
        }
    }
    public void showOptionsRook(){
        if(rookOne.isAlive()&& rookTwo.isAlive()) {
            System.out.println(" Welchen Rook willst du bewegen?\n" +
                    "1) Koords (Y X): " + rookOne.getYCoords() + " " + rookOne.getXCoords() + "\n" +
                    "2) Koords (Y X): " + rookTwo.getYCoords() + " " + rookTwo.getXCoords());
            int inputRook = scanner.nextInt();
            switch (inputRook) {
                case (1):
                    rookOne.setNewYXCoords();
                    break;
                case (2):
                    rookTwo.setNewYXCoords();
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputRook = scanner.nextInt();
            }
        }
        else if(rookOne.isAlive()){
            rookOne.setNewYXCoords();
        }
        else if(rookTwo.isAlive()){
            rookTwo.setNewYXCoords();
        }else{
            System.out.println("Es sind keine Rooks mehr auf dem Feld");
        }
    }
    public void showOptionsBishop(){
        if(bishopOne.isAlive()&& bishopTwo.isAlive()) {
            System.out.println(" Welchen Bishop willst du bewegen?\n" +
                    "1) Koords (Y X): " + bishopOne.getYCoords() + " " + bishopOne.getXCoords() + "\n" +
                    "2) Koords (Y X): " + bishopTwo.getYCoords() + " " + bishopTwo.getXCoords());
            int inputBishop = scanner.nextInt();
            switch (inputBishop) {
                case (1):
                    bishopOne.setNewYXCoords();
                    break;
                case (2):
                    bishopTwo.setNewYXCoords();
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputBishop = scanner.nextInt();
            }
        }
        else if(bishopOne.isAlive()){
            bishopOne.setNewYXCoords();
        }
        else if(bishopTwo.isAlive()){
            bishopTwo.setNewYXCoords();
        }else{
            System.out.println("Es sind keine Bishops mehr auf dem Feld");
        }
    }
    public void showOptionsPawn(){
        System.out.println(" Welchen Pawn willst du bewegen?");
        if(pawnOne.isAlive()){
            System.out.println("1) Koords (Y X): " + pawnOne.getYCoords() + " " + pawnOne.getXCoords());
        } if(pawnTwo.isAlive()) {
            System.out.println("2) Koords (Y X): " + pawnTwo.getYCoords() + " " + pawnTwo.getXCoords());
        } if(pawnThree.isAlive()){
            System.out.println("3) Koords (Y X): " + pawnThree.getYCoords() + " " + pawnThree.getXCoords());
        } if(pawnFour.isAlive()){
            System.out.println("4) Koords (Y X): " + pawnFour.getYCoords() + " " + pawnFour.getXCoords());
        } if(pawnFive.isAlive()){
            System.out.println("5) Koords (Y X): " + pawnFive.getYCoords() + " " + pawnFive.getXCoords());
        } if(pawnSix.isAlive()){
            System.out.println("6) Koords (Y X): " + pawnSix.getYCoords() + " " + pawnSix.getXCoords());
        } if(pawnSeven.isAlive()){
            System.out.println("7) Koords (Y X): " + pawnSeven.getYCoords() + " " + pawnSeven.getXCoords());
        } if(pawnEight.isAlive()) {
            System.out.println("8) Koords (Y X): " + pawnEight.getYCoords() + " " + pawnEight.getXCoords());
        }
        int inputPawn = scanner.nextInt();
        switch (inputPawn) {
            case (1):
                pawnOne.setNewYXCoords();
                break;
            case (2):
                pawnTwo.setNewYXCoords();
                break;
            case (3):
                pawnThree.setNewYXCoords();
                break;
            case (4):
                pawnFour.setNewYXCoords();
                break;
            case (5):
                pawnFive.setNewYXCoords();
                break;
            case (6):
                pawnSix.setNewYXCoords();
                break;
            case (7):
                pawnSeven.setNewYXCoords();
                break;
            case (8):
                pawnEight.setNewYXCoords();
                break;
            default:
                System.out.println("Falsche Eingabe");
                inputPawn = scanner.nextInt();
        }
    }
    public void inputToFigureOptions(String input) {
        int counter = 0;
        do{
            char inputChar = input.toUpperCase().charAt(0);
            counter = 0;
            switch (inputChar) {
                case ('W'):
                    if(king.isAlive()){
                        king.setNewYXCoords();
                    }
                    else{
                        System.out.println("Kein King mehr auf dem Feld");
                        input = scanner.next();
                        counter--;
                    }
                    break;
                case ('K'):
                    if(knightOne.isAlive()||knightTwo.isAlive()){
                        showOptionsKnight();
                    }else{
                        System.out.println("Keine Knights mehr auf dem Feld");
                        input = scanner.next();
                        counter--;
                    }
                    break;
                case ('P'):
                    if(pawnOne.isAlive()||pawnTwo.isAlive()||pawnThree.isAlive()
                            ||pawnFour.isAlive() ||pawnFive.isAlive()||pawnSix.isAlive()
                            ||pawnSeven.isAlive()||pawnEight.isAlive()){
                        showOptionsPawn();
                    }else{
                        System.out.println("Keine Pawns mehr auf dem Feld");
                        input = scanner.next();
                        counter--;
                    }
                    break;
                case ('Q'):
                    if(queen.isAlive()){
                        queen.setNewYXCoords();
                    }else{
                        System.out.println("Keine Queen mehr auf dem Feld");
                        input = scanner.next();
                        counter--;
                    }
                    break;
                case ('R'):
                    if(knightOne.isAlive()||knightTwo.isAlive()){
                        showOptionsRook();
                    }else{
                        System.out.println("Keine Rooks mehr auf dem Feld");
                        input = scanner.next();
                        counter--;
                    }

                    break;
                case ('B'):
                    if(knightOne.isAlive()||knightTwo.isAlive()){
                        showOptionsBishop();
                    }else{
                        System.out.println("Keine Bishops mehr auf dem Feld");
                        input = scanner.next();
                        counter--;
                    }
                    break;
                default:
                    System.out.println("Falsche Eingabe\nBitte erneut eingeben");
                    input = scanner.next();
                    counter--;
            }
        }while(counter !=0);
    }


}
