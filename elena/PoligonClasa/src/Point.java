public class Point {
    private Double x;
    private Double y;

    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    public void scale(Double s){
        this.x *=s;
        this.y *=s;
    }

    public void translate (Double dx, Double dy){
        this.x +=dx;
        this.y +=dy;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
