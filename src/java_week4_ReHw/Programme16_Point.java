package java_week4_ReHw;

public class Programme16_Point {
    //instance variable
    int x;
    int y;
    //Constructor with zero args
    Programme16_Point() {
    }
   //parameterised constructor
    Programme16_Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY() {
        return y;
    }
        public void setX(int a) {
            this.x = a;
        }

        public void setY(int b) {
            this.y = b;
        }

        public double distance() {
            return distance(0, 0);
        }

        public double distance(int x, int y) {
            return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
        }

        public double distance(Programme16_Point secondPoint) {
            return distance(secondPoint.x, secondPoint.y);
        }

        public static void main(String[] args) {
            Programme16_Point first = new Programme16_Point(6, 5);
           Programme16_Point second = new Programme16_Point(3,1);
            System.out.println("distance(0,0)= " + first.distance ());
            System.out.println("distance(second)= " + first.distance(second));
            System.out.println("distance(2,2)= " + first.distance(2, 2));
            Programme16_Point point = new Programme16_Point();
            System.out.println("distance()= " + point.distance());
        }
    }

