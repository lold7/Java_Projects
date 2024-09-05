import java.util.Scanner;

public class trigon2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double value;
        double result;

        System.out.println("Choose 1 for sine");
        System.out.println("Choose 2 for cosine");
        System.out.println("Choose 3 for tangent");
        System.out.println("Choose 4 for hyperbolic sine");
        System.out.println("Choose 5 for hyperbolic cosine");
        System.out.println("Choose 6 for hyperbolic tangent");

        System.out.print("Enter number: ");
        int num = input.nextInt();

        switch (num) {
            case 1:
                System.out.print("Enter sin ");
                value = input.nextDouble();

                result = Math.sin(value);
                System.out.print(result);
                break;

            case 2:
                System.out.print("Enter cos ");
                value = input.nextDouble();

                result = Math.cos(value);
                System.out.print(result);
                break;
            case 3:
                System.out.print("Enter tan ");
                value = input.nextDouble();

                result = Math.tan(value);
                System.out.print(result);
                break;
            case 4:
                System.out.print("Enter hsin ");
                value = input.nextDouble();

                result = Math.sinh(value);
                System.out.print(result);
                break;
            case 5:
                System.out.print("Enter hcos ");
                value = input.nextDouble();

                result = Math.cosh(value);
                System.out.print(result);
                break;
            case 6:
                System.out.print("Enter htan ");
                value = input.nextDouble();

                result = Math.tanh(value);
                System.out.print(result);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
// sdfjlsjfjsdlfjslkdfjlksjflksdjfjsdflsdjfl