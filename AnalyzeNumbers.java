import java.util.Scanner;
public class AnalyzeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        
        System.out.print("Enter the numbers: ");
        for (int i = 0; i<n;i++){
            numbers[i] = input.nextInt();
        }
        String alltext = "";
        for (int i : numbers){
            alltext += "  "+i;
        }


        int max = numbers[0];
        for (int i = 0 ; i<numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }


        int min = numbers[0];
        for (int i = 0 ; i<numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("All numbers " + alltext);
        System.out.println("Maximum is  " + max);
        System.out.println("Minimum is "+ min);
    }
}
