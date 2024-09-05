import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("principal amount: ");
        double P = input.nextDouble();

        System.out.print("rate of interest: ");
        double R = input.nextDouble();

        System.out.print("time in years: ");
        double T = input.nextDouble();

        double SI = (P * R * T) / 100;
        System.out.print("Simple Interest: " + SI);
    }
}
