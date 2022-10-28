import java.util.Scanner;

public class MainFront {
    public static void main(String[] args) {
        MainBack Game = new MainBack();
        Scanner scanner = new Scanner(System.in);
        int moves=0;
        String leftInputString;
        String rightInputString;
        Game.setupChessBoard();
        Game.printChessBoard();
        System.out.println("Legend:\nR is Rook K is Knight B is Bishop Q is Queen W is King P is Pawn\nLeft Side is Black Right Side is White");

        while(Game.playerOne.king.isAlive()&&Game.playerTwo.king.isAlive()){
            if((moves % 2) ==0){
                //Player 1
                System.out.println("Links du bist dran \nWelche Figur willst du bewegen ");
                leftInputString = scanner.next();
                Game.playerOne.inputToFigureOptions(leftInputString);




            } else{
                //Player 2
                System.out.println("Rechts du bist dran\nWelche Figur willst du bewegen ");
                rightInputString = scanner.next();
                Game.playerTwo.inputToFigureOptions(rightInputString);
            }
            moves++;
            Game.setupChessBoard();
            Game.printChessBoard();
        }


    }

}
