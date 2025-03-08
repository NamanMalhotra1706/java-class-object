import java.util.Scanner;

public class Circle {
    double radius;

    // Constructor
    Circle(double radius){
        this.radius = radius;
    }

    // Func to calculate area of the circle
    public double areaOfCircle(){
        return Math.PI*Math.pow(radius,2);
    }

    // Func to calculate circumference of the circle
    public double circumferenceOfCircle(){
        return 2*Math.PI*radius;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        Circle c1 = new Circle(radius);

        System.out.println("Radius of Circle: "+c1.areaOfCircle());
        System.out.println("Circumference of Circle: "+c1.circumferenceOfCircle());
        
        
    }
}
