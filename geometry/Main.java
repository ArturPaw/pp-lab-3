public class Main {

    public static void main(String[] args) {
        Point punkt = new Point(2.5, 3.14);

        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + punkt.getX());
        System.out.println("y = " + punkt.getY());

        punkt.setX(10.0);
        punkt.setY(5.5);

        System.out.println("\nNowe współrzędne punktu:");
        System.out.println("x = " + punkt.getX());
        System.out.println("y = " + punkt.getY());
    }
}
