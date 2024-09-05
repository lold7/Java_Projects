import java.util.Scanner;

public class sphere {
    public static void main(String[] args) {
        final double radius = 2.57;
        final double pi = 3.1416;

        double volume = (4 / 3) * pi * Math.pow(radius, 3);
        double surface = 4 * pi * Math.pow(radius, 2);

        System.out.println("Volume is " + volume);
        System.out.println("Surface is " + surface);

    }
}
