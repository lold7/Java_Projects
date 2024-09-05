import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.print(num + " is Even number");
        } else {
            System.out.print(num + " is Odd number");
        }
    }

}
