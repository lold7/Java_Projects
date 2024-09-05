import java.util.Scanner;

public class caltime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int day;
        int dayrem;
        int hour;
        int hourrem;
        int min;
        int minrem;
        int second;

        System.out.print("Enter the total second: ");
        int t_second = input.nextInt();

        day = t_second / 86400;
        dayrem = t_second % 86400;

        hour = dayrem / 3600;
        hourrem = dayrem % 3600;

        min = hourrem / 60;

        second = hourrem % 60;

        System.out.println(day + " day");
        System.out.println(hour + " hour");
        System.out.println(min + " min");
        System.out.println(second + " second");

    }
}
