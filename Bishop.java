public class Bishop {
    int x_coords;
    int y_coords;
    public Bishop(int y,int x){
        this.x_coords=x;
        this.y_coords=y;
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
