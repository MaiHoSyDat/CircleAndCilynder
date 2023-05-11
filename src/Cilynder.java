import java.awt.geom.Area;

public class Cilynder extends Circle{
    private double height;

    public Cilynder(double height,double radius) {
        super(radius);
        this.height = height;
    }

    public Cilynder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double theTich(){
        return super.area() * height;
    }
}
