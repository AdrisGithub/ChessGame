public class Knight {
    int x_coords;
    int y_coords;
    boolean alive;
    public Knight(int y, int x, boolean alive){
        this.x_coords=x;
        this.y_coords=y;
        this.alive= alive;
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
}
