import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length;
        int width;

        System.out.print("Enter your length: ");
        length = input.nextInt();

        System.out.print("Enter your wild: ");
        width = input.nextInt();

        int area = length * width;
        System.out.println("Area is " + area);

    }

}
