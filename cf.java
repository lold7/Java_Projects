import java.util.Scanner;

public class cf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double cel;
        double fah;

        System.out.println("Enter c for Fahrenheil to Celsius or Enter f for Celsius to Fahrenheil");
        System.out.print("Enter c or f: ");
        String ch_ar = input.next();

        if (ch_ar.equals("Celsius")) {
            System.out.print("Enter your Fahrenheil: ");
            fah = input.nextDouble();

            double f_to_c = (fah - 32) * 5.0 / 9;
            System.out.println("Celsius is " + f_to_c);
        } else if (ch_ar.equals("Fahrenheil")) {
            System.out.print("Enter your Celsius: ");
            cel = input.nextDouble();

            double c_to_f = ((9.0 * cel) / 5) + 32;
            System.out.println("Fahrenheil is " + c_to_f);
        } else {
            System.out.print("Error Try again");
        }

    }
}
