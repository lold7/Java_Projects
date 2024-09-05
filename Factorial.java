import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();
        int x = 1;

        for (int i = num; i >= 1; i--) {
            x = x * i;

        }
        System.out.print(x);
    }

}
