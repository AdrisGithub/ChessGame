import java.util.Scanner;

public class MainBack {
    public MainBack() {

    }
    Scanner scanner = new Scanner(System.in);
    PlayerOne playerOne = new PlayerOne("Tobi");
    PlayerTwo playerTwo = new PlayerTwo("Tim");
    char[][] chessBoard = new char[8][8];

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




}