public class Queen {
    int x_coords;
    int y_coords;
    public Queen(int y,int x){
        this.x_coords=y;
        this.y_coords=x;
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
