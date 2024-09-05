import java.util.Scanner;

public class finding_divi_5or7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        int i = 0;
        int line = 0;
        while (i <= num) {
            if (i % 5 == 0 ^ i % 7 == 0) {
                System.out.print(i + " ");
                line++;
                if (line == 10) {
                    System.out.println("");
                    line = 0;
                }
            }
            i++;
        }
        System.out.println("End of number.");
    }
}
