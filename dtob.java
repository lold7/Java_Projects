import java.util.Scanner;

public class dtob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double dollar;
        double bath = 31.125;

        System.out.print("Enter your dollar: ");
        dollar = input.nextDouble();

        double total_bath = dollar * bath;
        System.out.println(total_bath + " bath");

    }

}
