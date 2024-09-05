import java.util.Scanner;

public class payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.next();

        System.out.print("Enter your hour: ");
        double hour = input.nextDouble();

        System.out.print("Enter your pay rate: ");
        double pay_rate = input.nextDouble();

        double grosspay = hour * pay_rate;
        double federal = grosspay * (20.0 / 100);
        double state = grosspay * (9.0 / 100);
        double total = federal + state;
        double netpay = grosspay - total;

        System.out.println("Employee name " + name);
        System.out.println("Gross pay " + grosspay);
        System.out.println("Federal withholding " + federal);
        System.out.println("State withholding " + state);
        System.out.println("Total Deduction " + total);
        System.out.println("Net pay " + netpay);

    }

}
