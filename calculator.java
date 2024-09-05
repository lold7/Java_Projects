import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(": ");
        int num1 = input.nextInt();

        System.out.print(": ");
        String oper = input.next();

        switch (oper) {
            case "+":
                System.out.print(": ");
                int num2 = input.nextInt();
                int result = num1 + num2;
                System.out.print(result);
                break;
            case "-":
                System.out.print(": ");
                int num3 = input.nextInt();
                int result2 = num1 - num3;
                System.out.print(result2);
                break;
            case "*":
                System.out.print(": ");
                int num4 = input.nextInt();
                int result3 = num1 * num4;
                System.out.print(result3);
                break;
            case "/":
                System.out.print(": ");
                int num5 = input.nextInt();
                int result4 = num1 / num5;
                System.out.print(result4);
                break;
            default:
                System.out.print("Error");
                break;
        }

    }
}
