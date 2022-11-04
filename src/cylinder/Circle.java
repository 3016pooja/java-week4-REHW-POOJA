package cylinder;

import static java.lang.Math.PI;

public class Circle {
    double radius;

    public Circle(double radius) {
        if (radius < 0)
            this.radius = 0;
        else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return (getRadius() * getRadius() * PI);
    }

}
