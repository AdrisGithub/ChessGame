import java.util.Scanner;

public class King {
    Scanner scanner = new Scanner(System.in);
    private int x_coords;
    private int y_coords;
    private boolean alive;
    public King(int y, int x, boolean alive){
        this.x_coords=x;
        this.y_coords=y;
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
    public boolean isKingOnThisField(int y, int x){
        return ((y == y_coords && x ==x_coords)&& alive);
    }

    public void setYXCoords(int y, int x){
        setYCoords(y);
        setXCoords(x);
    }
    public void setYXCoordsArray(int[] array){
        y_coords=array[0];
        x_coords=array[1];
    }
}
