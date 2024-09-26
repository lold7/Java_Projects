import java.util.Scanner;
public class AnalyzeNumbers2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter the number of items: ");
        int n = input.nextInt();

        int[] numbers = new int[n];
        
        System.out.print("Enter the numbers: ");
        for (int i = 0; i<n;i++){
            numbers[i] = input.nextInt();
        }
        System.out.println("All numbers: "+ printArray(numbers));
        System.out.println("Maximum is  "+findMax(numbers));
        System.out.println("Minimum is "+ findMin(numbers));
    }
    public static String printArray(int[] numbers) {
        String result = new String();
        for (int i : numbers){
            result += " " + i;
        }
            return result;
    }

    public static int findMax(int[] numbers){
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i]>max){
                max = numbers[i];
            }
        }
        return max;
        
    }

    public static int findMin(int[] numbers) {
        int min= numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
        
    }

}