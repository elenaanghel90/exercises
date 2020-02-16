public class Punct { //(x,y)
    protected Double x;
    protected Double y;

    public Punct(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Double getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public void translatie(Double dx, Double dy) {
        this.x += dx;
        this.y += dy;
    }

    public void scalare(Double a) {
        this.x *= a;
        this.y *= a;
    }
    @Override
    public String toString(){
        return "punctul x = " + this.x + "" +
                " punctul y = " +this.y;
    }
}
