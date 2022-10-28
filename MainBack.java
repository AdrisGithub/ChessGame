import java.util.Locale;
import java.util.Scanner;

public class MainBack {
    public MainBack() {

    }

    PlayerOne playerOne = new PlayerOne("Tobi");
    PlayerTwo playerTwo = new PlayerTwo("Tim");
    char[][] chessBoard = new char[8][8];
    Scanner scanner = new Scanner(System.in);

    public void printChessBoard() {
        System.out.print("    0  1  2  3  4  5  6  7  X");
        for (int y = 0; y < chessBoard.length; y++) {
            System.out.print("\n ");
            System.out.print(" " + y + " ");
            for (int x = 0; x < chessBoard.length; x++) {
                System.out.print(chessBoard[y][x] + "  ");
            }

        }
        System.out.println("\n  Y");
    }

    public void setupChessBoard() {
        for (int y = 0; y < chessBoard.length; y++) {
            for (int x = 0; x < chessBoard.length; x++) {
                if (playerOne.areBishopsOnThisField(y, x)) {
                    chessBoard[y][x] = 'B';
                } else if (playerOne.areKingsOnThisField(y, x)) {
                    chessBoard[y][x] = 'W';
                } else if (playerOne.areKnightsOnThisField(y, x)) {
                    chessBoard[y][x] = 'K';
                } else if (playerOne.areQueensOnThisField(y, x)) {
                    chessBoard[y][x] = 'Q';
                } else if (playerOne.areRooksOnThisField(y, x)) {
                    chessBoard[y][x] = 'R';
                } else if (playerOne.arePawnsOnThisField(y, x)) {
                    chessBoard[y][x] = 'P';
                } else if (playerTwo.areBishopsOnThisField(y, x)) {
                    chessBoard[y][x] = 'b';
                } else if (playerTwo.areKingsOnThisField(y, x)) {
                    chessBoard[y][x] = 'w';
                } else if (playerTwo.areKnightsOnThisField(y, x)) {
                    chessBoard[y][x] = 'k';
                } else if (playerTwo.areQueensOnThisField(y, x)) {
                    chessBoard[y][x] = 'q';
                } else if (playerTwo.areRooksOnThisField(y, x)) {
                    chessBoard[y][x] = 'r';
                } else if (playerTwo.arePawnsOnThisField(y, x)) {
                    chessBoard[y][x] = 'p';
                } else {
                    chessBoard[y][x] = '◯';
                }
            }
        }
    }

    public void inputToFigureOptionsPlayerOne(String input, int moves) {
        int counter = 0;
        do{
            char inputChar = input.toUpperCase().charAt(0);
            counter = 0;
            switch (inputChar) {
                case ('W'):
                    if(playerOne.king.isAlive()){

                    }
                    else{
                        counter--;
                    }
                    break;
                case ('K'):
                    if(playerOne.knightOne.isAlive()||playerOne.knightTwo.isAlive()){
                        playerOne.showOptionsKnight();
                    }else{
                        counter--;
                    }
                    break;
                case ('P'):
                    break;
                case ('Q'):
                    break;
                case ('R'):
                    playerOne.showOptionsRook();
                    break;
                case ('B'):
                    playerOne.showOptionsBishop();
                    break;
                default:
                    System.out.println("Falsche Eingabe\nBitte erneut eingeben");
                    input = scanner.next();
                    counter--;
            }
        }while(counter !=0);
    }
    public void inputToFigureOptionsPlayerTwo(String input, int moves) {
        int counter = 0;
        while (counter != 1) {
            char inputChar = input.toUpperCase().charAt(0);
            counter = 0;
            switch (inputChar) {
                case ('W'):
                    //Spezial Fall
                    break;
                case ('K'):
                    playerTwo.showOptionsKnight();
                    break;
                case ('P'):
                    break;
                case ('Q'):
                    //Spezial Fall
                    break;
                case ('R'):
                    playerTwo.showOptionsRook();
                    break;
                case ('B'):
                    playerTwo.showOptionsBishop();
                    break;
                default:
                    System.out.println("Falsche Eingabe\nBitte erneut eingeben");
                    input = scanner.next();
                    counter--;
            }


        }
    }
}