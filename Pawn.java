import java.util.Scanner;

public class Pawn {
    Scanner scanner = new Scanner(System.in);
    int x_coords;
    int y_coords;
    boolean alive;
    public Pawn(int y, int x,boolean alive){
        this.x_coords =x;
        this.y_coords =y;
        this.alive = alive;
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
    public boolean isPawnOnThisField(int y, int x){
        return ((y == y_coords && x ==x_coords)&& alive);
    }
    public void setYXCoordsArray(int[] array){
        y_coords=array[0];
        x_coords=array[1];
    }
}
