public class Main {
    public static void main(String[] args) {
        Point punkt = new Point(4.5,3.33);

        System.out.println("Współrzędne punktu:");
        System.out.println("x = " + punkt.getX());
        System.out.println("y = " + punkt.getY());

        punkt.setX(15.0);
        punkt.setY(10.5);

        System.out.println("\nNowe współrzędne punktu:");
        System.out.println("x = " + punkt.getX());
        System.out.println("y = " + punkt.getY());
        
        
    }
    
}
