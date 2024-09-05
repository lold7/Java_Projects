import java.util.Scanner;

public class cylender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Enter you length: ");
        double length = input.nextDouble();

        System.out.print("Enter your radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * pi;
        double valume = area * length;

        System.out.println("Area is " + area);
        System.out.println("Volume is " + valume);

    }

}
