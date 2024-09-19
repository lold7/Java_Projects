public class AreaCalculator {
    static int calculateArea(int x){
        int result = x * x;
            return result;
    }
    static double calculateArea(double x , double y){
        double result = x * y;
            return result;
    }
    static double calculateArea(double x){
        double result = 3.14 * (Math.pow(x,2));
            return result;
    }
    public static void main(String[] args){
        System.out.println("Area of square " + calculateArea(5));
        System.out.println("Area of rectangle " + calculateArea(4.0 , 6.0));
        System.out.println("Area of circle " + calculateArea(3.0));
    }


    
}
