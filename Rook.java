

public class Rook {

    private int x_coords;
    private int y_coords;
    private boolean alive;
    public Rook(int y, int x, boolean alive){
        this.x_coords =x;
        this.y_coords =y;
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

    public boolean isRookOnThisField(int y, int x){
        return ((y == y_coords && x ==x_coords)&& alive);
    }
    public void setYXCoordsArray(int[] array){
        y_coords=array[0];
        x_coords=array[1];
    }

}
