package geometry;

public class Main {

    public static void main(String[] args) {

        Circle[] circles = new Circle[3];

        circles[0] = new Circle(new Point(1.0, 2.0), 3.0);
        circles[1] = new ColoredCircle(new Point(4.0, 5.0), 6.0, "Niebieski");
        circles[2] = new Circle(new Point(7.0, 8.0), 9.0);

        for (Circle circle : circles) {
            System.out.println("Pole powierzchni: " + circle.calculateArea());
            if (circle instanceof ColoredCircle) {
                ColoredCircle coloredCircle = (ColoredCircle) circle;
                System.out.println("Kolor: " + coloredCircle.getColor());
            }
        }
    }
}
