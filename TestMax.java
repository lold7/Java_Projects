public class TestMax{
    public static void main(String[] args) {
        int i =5;
        int j =2;
        int x =9;
        int y =7;
        int k =max(x, y);
        System.out.println("The maximum between " + x +" and " + y + " is " + k);
        System.out.println("The maximum between " + j +" and " + i + " is " + k);
    
    }
    public static int max(int num1,int num2){
        int result;
    if (num1 > num2)
        result = num1;
    else
        result = num2;

    return result;
    }


}
