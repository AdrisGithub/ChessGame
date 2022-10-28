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
            System.out.println("Welchen Knight willst du bewegen?\n" +
                    "1) Koords (Y X): " + knightOne.getYCoords() + " " + knightOne.getXCoords() + "\n" +
                    "2) Koords (Y X): " + knightTwo.getYCoords() + " " + knightTwo.getXCoords());
            int inputKnight = scanner.nextInt();
            switch (inputKnight) {
                case (1):
                    knightOne.setYXCoordsArray(setNewXYCoords());
                    break;
                case (2):
                    knightTwo.setYXCoordsArray(setNewXYCoords());
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputKnight = scanner.nextInt();
            }
        }
        else if(knightOne.isAlive()){
            knightOne.setYXCoordsArray(setNewXYCoords());
        }
        else if(knightTwo.isAlive()){
            knightTwo.setYXCoordsArray(setNewXYCoords());
        }else{
            System.out.println("Es sind keine Knights mehr auf dem Feld");
        }
    }
    public void showOptionsRook(){
        if(rookOne.isAlive()&& rookTwo.isAlive()) {
            System.out.println("Welchen Rook willst du bewegen?\n" +
                    "1) Koords (Y X): " + rookOne.getYCoords() + " " + rookOne.getXCoords() + "\n" +
                    "2) Koords (Y X): " + rookTwo.getYCoords() + " " + rookTwo.getXCoords());
            int inputRook = scanner.nextInt();
            switch (inputRook) {
                case (1):
                    rookOne.setYXCoordsArray(setNewXYCoords());
                    break;
                case (2):
                    rookTwo.setYXCoordsArray(setNewXYCoords());
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputRook = scanner.nextInt();
            }
        }
        else if(rookOne.isAlive()){
            rookOne.setYXCoordsArray(setNewXYCoords());
        }
        else if(rookTwo.isAlive()){
            rookTwo.setYXCoordsArray(setNewXYCoords());
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
                    bishopOne.setYXCoordsArray(setNewXYCoords());
                    break;
                case (2):
                    bishopTwo.setYXCoordsArray(setNewXYCoords());
                    break;
                default:
                    System.out.println("Falsche Eingabe");
                    inputBishop = scanner.nextInt();
            }
        }
        else if(bishopOne.isAlive()){
            bishopOne.setYXCoordsArray(setNewXYCoords());
        }
        else if(bishopTwo.isAlive()){
            bishopTwo.setYXCoordsArray(setNewXYCoords());
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
                pawnOne.setYXCoordsArray(setNewXYCoords());
                break;
            case (2):
                pawnTwo.setYXCoordsArray(setNewXYCoords());
                break;
            case (3):
                pawnThree.setYXCoordsArray(setNewXYCoords());
                break;
            case (4):
                pawnFour.setYXCoordsArray(setNewXYCoords());
                break;
            case (5):
                pawnFive.setYXCoordsArray(setNewXYCoords());
                break;
            case (6):
                pawnSix.setYXCoordsArray(setNewXYCoords());
                break;
            case (7):
                pawnSeven.setYXCoordsArray(setNewXYCoords());
                break;
            case (8):
                pawnEight.setYXCoordsArray(setNewXYCoords());
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
                        king.setYXCoordsArray(setNewXYCoords());
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
                        queen.setYXCoordsArray(setNewXYCoords());
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


    public int[] setNewXYCoords(){
        int[] result = new int[2];
        int yKoords = newYLocation();
        int xKoords = newXLocation();
        while(checkIfBoxIsntValid(yKoords,xKoords)){
            System.out.println("Einer der Werte ist falsch");
            yKoords = newYLocation();
            xKoords = newXLocation();
        }
        result[0]=yKoords;
        result[1]=xKoords;
        return result;
    }


    public int newXLocation(){
        System.out.println("Neue X Koordinate:");
        int newX = scanner.nextInt();
        while(newX<0  || newX>7){
            System.out.println("Falsche Eingabe");
            newX = scanner.nextInt();
        }
        return newX;
    }
    public int newYLocation(){
        System.out.println("Neue Y Koordinate:");
        int newY = scanner.nextInt();
        while(newY<0  || newY>7){
            System.out.println("Falsche Eingabe");
            newY = scanner.nextInt();
        }
        return newY;

    }
    public boolean checkIfBoxIsntValid(int y,int x){
        return(areBishopsOnThisField(y,x)||areKingsOnThisField(y,x)||areKnightsOnThisField(y,x)||areQueensOnThisField(y,x)||areRooksOnThisField(y,x)||arePawnsOnThisField(y,x));
    }

}
