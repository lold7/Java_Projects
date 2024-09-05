import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Fahrenheil: ");
        double fah = input.nextDouble();

        double cel = (fah - 32) * 5 / 9;

        System.out.print("Celsius is " + cel);
    }
}
