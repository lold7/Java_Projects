import java.util.Scanner;

public class trigon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle: ");
        int angle = input.nextInt();

        if (angle > 360) {
            int anglerem = angle % 360;
            angle = anglerem;
        }

        if (angle < 0 && angle > -360) {
            int anglemi = angle + 360;
            angle = anglemi;
        }
        if (angle < -360) {
            int anglerem = angle % 360;
            int anglerem2 = anglerem + 360;
            angle = anglerem2;
        }

        if (angle > 0 && angle < 90) {
            System.out.println("Quadrant 1");
        } else if (angle > 90 && angle < 180) {
            System.out.println("Quadrant 2");
        } else if (angle > 180 && angle < 270) {
            System.out.println("Quadrand 3");
        } else if (angle > 270 && angle < 360) {
            System.out.println("Quadrant 4");
        } else {
            System.out.print("This angle lives on the line");
        }

    }

}
