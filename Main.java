

import geometry.Square;

public class Main {

    public static void main(String[] args) {

        Square kwadrat = new Square(4.7);

        System.out.println("Właściwości kwadratu:");
        System.out.println("Bok: " + kwadrat.length);
        System.out.println("Pole powierzchni: " + kwadrat.calculateArea());
        System.out.println("Obwód: " + kwadrat.calculatePerimeter());
    }
}
