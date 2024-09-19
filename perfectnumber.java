import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter number: ");
        int x = input.nextInt();

        System.out.print(mynum(x));
    }
    public static boolean mynum(int x){
        int sum = 0 ;
        for(int i = 1 ; i<x-1 ; i++){
            if(x%i == 0){
                sum += i;
            }
        }
        if (sum == x){
            return true;
        }
        else{
            return false;
        }
    }
}
