package geometry;

public class Main {

    public static void main(String[] args) {
        Point center = new Point(2.5, 3.14);
        Circle circle = new Circle(center, 5.0);

        System.out.println("Właściwości koła:");
        System.out.println("Środek: (" + circle.getCenter().getX() + ", " + circle.getCenter().getY() + ")");
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni: " + circle.getArea());
    }
}
