public class Square extends Rectangle{
    protected double side;
    public Square(){}
    public Square(double s){
        side = s;
    }
    public Square(double s, String c, boolean f){
        side = s;
        color = c;
        filled = f;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "wit = " +getSide() + ";" + "len = " + getSide();
    }
}
