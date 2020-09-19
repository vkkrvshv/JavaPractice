package rtu.mirea.lab3;

public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(String color, boolean filled, double side) {
        this.color=color;
        this.filled=filled;
        this.side = side;
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width){
        super.setWidth(side);
    }

    @Override
    public void setLength(double length){
        super.setLength(side);
    }

    public String toString() {
        return "Shape: square, side: " + super.getLength() +" , color: " + this.color;
    }
}
