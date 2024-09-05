import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.print("Area of Circle is " + area);
    }

}
