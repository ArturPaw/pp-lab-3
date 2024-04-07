package geometry;

public class Main {

    public static void main(String[] args) {

        Point punkt = new Point(5.5, 10.2);
        ColoredCircle kolo = new ColoredCircle(punkt, 4.7, "Czerwony");

        System.out.println("Właściwości koła:");
        System.out.println("Środek: (" + kolo.getCenter().getX() + ", " + kolo.getCenter().getY() + ")");
        System.out.println("Promień: " + kolo.getRadius());
        System.out.println("Kolor: " + kolo.getColor());
        System.out.println("Obwód: " + kolo.calculatePerimeter());
        System.out.println("Pole powierzchni: " + kolo.getArea());
    }
}
