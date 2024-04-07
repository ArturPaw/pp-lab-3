package geometry;

public class Rectangle {

    private double lenght;
    private double widht;

    public Rectangle(double lenght, double widht){
        this.lenght = lenght;
        this.widht = widht;
    }

    public double calculateArea(){
        return lenght * widht;

    }
    
    public double calculatePerimeter(){
    return 2 * (lenght + widht);
    }
}
