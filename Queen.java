import java.util.Scanner;

public class Queen {
    Scanner scanner = new Scanner(System.in);
    int x_coords;
    int y_coords;
    boolean alive;
    public Queen(int y,int x, boolean alive){
        this.x_coords=x;
        this.y_coords=y;
        this.alive=alive;
    }
    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    public boolean isAlive() {
        return alive;
    }
    public int getXCoords() {
        return x_coords;
    }

    public int getYCoords() {
        return y_coords;
    }

    public void setXCoords(int x) {
        this.x_coords = x;
    }

    public void setYCoords(int y) {
        this.y_coords = y;
    }
    public void setYXCoords(int y, int x){
        setYCoords(y);
        setXCoords(x);
    }
    public boolean isQueenOnThisField(int y, int x){
        return ((y == y_coords && x ==x_coords)&& alive);
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
    public void setNewYXCoords(){
        setYCoords(newYLocation());
        setXCoords(newXLocation());
    }
}
