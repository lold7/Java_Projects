import java.util.Scanner;

public class inches_to_centimeter {
    public static void main(String[] args) {
        System.out.println("Inches" + "\t\t\t" + "Centimeter");
        int inches = 1;
        double Cen;
        while (inches <= 199) {
            Cen = inches * 2.54;
            System.out.println(inches + "\t\t\t" + Cen);
            inches += 2;
        }
    }
}
