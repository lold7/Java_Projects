import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fill your grade(0 - 100): ");
        int grade = input.nextInt();

        if (grade <= 100 && grade >= 0) {
            if (grade >= 90) {
                System.out.print("A");
            } else if (grade >= 80 && grade <= 89) {
                System.out.print("B");
            } else if (grade >= 70 && grade <= 79) {
                System.out.print("C");
            } else if (grade >= 60 && grade <= 69) {
                System.out.print("D");
            } else if (grade <= 59) {
                System.out.print("F");
            }
        } else {
            System.out.print("Please fill number 0 - 100");
        }
    }

}
