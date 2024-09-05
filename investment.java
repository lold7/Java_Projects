import java.util.Scanner;

public class investment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Investment amount: ");
        double inamo = input.nextDouble();

        System.out.print("Monthly interest rate: ");
        double moin_rate = input.nextDouble();

        System.out.print("Number of year: ");
        double numyear = input.nextDouble();

        double feinves_value = inamo * Math.pow(1 + (moin_rate / 100), numyear);

        System.out.println("Future investment java " + feinves_value);

    }

}
