import java.util.Scanner;

public class Three_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int largest = 0;

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        largest = num3;

        if (num1 >= num3 && num1 >= num2) {
            largest = num1;
        } else if (num2 >= num3 && num2 >= num1) {
            largest = num2;
        }

        System.out.print("Largest number is " + largest);
    }

}
