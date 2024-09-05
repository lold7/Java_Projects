import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter work hour: ");
        int work_hour = input.nextInt();

        int money = 0;
        if (work_hour <= 40) {
            money = work_hour * 8;
            System.out.println("Salary is " + money);
        } else {
            int hourthan = work_hour - 40;
            money = (hourthan * 12) + 320;
            System.out.println("Salary is " + money);
        }

    }
}
