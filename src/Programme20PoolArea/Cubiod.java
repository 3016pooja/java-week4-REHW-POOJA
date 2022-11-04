package Programme20PoolArea;

public class Cubiod extends Rectangle{
    double height;

    public Cubiod(double width, double length, double height) {
        super(width, length);
        this.height = height;
        if (this.height < 0) {
            this.height = 0;
        }
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return (getArea() * getHeight());
    }
}

