import java.util.Scanner;

public class wtf_method {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = input.nextInt();
        
        String number = String.valueOf(x);
        for(int i = 0; i<number.length();i++){
            int j = Character.digit(number.charAt(i),10);
            printnumber(j);
        }
    
                

        }
    static void printnumber(int j){
        if(j==0){
            System.out.println("0000000\n00   00\n00   00\n00   00\n0000000");
            System.out.println(" ");
        }
        else if(j==1){
            System.out.println("1111\n  11\n  11\n  11");
            System.out.println(" ");
        }
        else if(j==2){
            System.out.println("222222\n    22\n   22\n  22\n222222");
            System.out.println(" ");
        }
        else if(j==3){
            System.out.println("333333\n    33\n 33333\n    33\n333333");
            System.out.println(" ");
        }
        else if(j==4){
            System.out.println("44   44\n44   44\n4444444\n     44\n     44");
            System.out.println(" ");
        }
        else if(j==5){
            System.out.println("5555555\n55\n5555555\n     55\n5555555");
            System.out.println(" ");
        }
        else if(j==6){
             System.out.println("6666666\n66\n66\n666666\n66  66\n66  66\n666666");
             System.out.println(" ");
        }
        else if(j==7){
            System.out.println("7777777\n     77\n    77\n   77\n  77");
            System.out.println(" ");
        }
        else if(j==8){
            System.out.println("8888888\n88   88\n88   88\n88   88\n8888888\n88   88\n88   88\n88   88\n8888888");
            System.out.println(" ");
        }
        else if(j==9){
            System.out.println("9999999\n99   99\n99   99\n99   99\n9999999\n     99\n     99\n  99999");
            System.out.println(" ");
        }
        
        
        
        
        
       
        
        
        

    }
}        

    
