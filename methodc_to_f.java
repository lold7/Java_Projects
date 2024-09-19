import java.util.Scanner;

public class methodc_to_f {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter C for find Celcius or F for find Fahrenheit: ");
        char choose = input.next().toUpperCase().charAt(0);

        System.out.println("(Enter E for exit program)");
        while (true){
            if (choose == 'C'){
                System.out.print("Enter Fahrenheit: ");
                double F = input.nextDouble();
                System.out.print(f_to_c(F) + " Celcius");

        }
            else if (choose == 'F'){
                System.out.print("Enter Celcius: ");
                double C = input.nextDouble();
                System.out.print(c_to_f(C) + " Fahrenheit");
        }
            else if (choose == 'E'){
                break;
            }
        }
        System.out.print("Exit Program");
        
        
    }
    
    
    
    
    
    
    
    
    public static double f_to_c(double F){
        double celcius;
        celcius = (F-32)*(5/9.0);
            return celcius;
    }
    public static double c_to_f(double C){
        double fahrenheit;
        fahrenheit = ((9*C)/5.0)+32;
            return fahrenheit;
    }
    
}
