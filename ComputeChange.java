import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount
    System.out.print(
        "Enter an amount in double, for example, 11.56: ");
    int amount = input.nextInt();

    int dollar;
    int cent;

    dollar = amount / 100;
    // dollarremain
    cent = amount % 100;

    System.out.println(dollar + " dollar");
    System.out.println(cent + " cent");

  }
}
