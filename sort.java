import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        System.out.print("Enter num3: ");
        int num3 = input.nextInt();

        if (num1 > num2) {
            int dep = num1;
            num1 = num2;
            num2 = dep;
        }

        if (num1 > num3) {
            int dep = num3;
            num3 = num1;
            num1 = dep;
        }
        if (num2 > num3) {
            int dep = num2;
            num2 = num3;
            num3 = dep;

        }
        System.out.println(num1 + " <= " + num2 + " <= " + num3);
    }

}
