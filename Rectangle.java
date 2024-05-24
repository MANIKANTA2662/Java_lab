import java.util.*;
public class Rectangle{
    double length;
    double width;
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    public double calculateArea() {
        return length * width;
    }
    public void readAttributes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        this.length = scanner.nextDouble();
        System.out.print("Enter width: ");
        this.width = scanner.nextDouble();
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); 
        rectangle.readAttributes(); 
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + rectangle.calculateArea());
    }

}