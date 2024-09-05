import java.util.Scanner;

public class midtermex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coke = 15;
        int water = 10;
        int tea = 20;
        int orenge_juice = 25;
        int ice_cream = 25;
        int bingsu = 40;
        int cake = 30;

        System.out.println("Menu list");

        System.out.println("1.coke 15 bath");
        System.out.println("2.water 10 bath");
        System.out.println("3.tea 20 bath");
        System.out.println("4.orenge juice 25 bath");
        System.out.println("5.ice cream 25 bath");
        System.out.println("6.bingsu 40 bath");
        System.out.println("7.cake 30 bath");

        System.out.print("Choose menu: ");
        int menu = input.nextInt();

        System.out.print("Enter your money: ");
        int money = input.nextInt();

        switch (menu) {
            case 1:
                if (money >= coke) {
                    int change = money - coke;
                    System.out.print("Change is " + change);
                } else {
                    int require = coke - money;
                    System.out.print("Money not enough , required " + require);
                }
                break;

            case 2:
                if (money >= water) {
                    int change = money - water;
                    System.out.print("Change is " + change);

                } else {
                    int require = water - money;
                    System.out.print("Money not enough , required " + require);
                }
                break;

            case 3:
                if (money >= tea) {
                    int change = money - tea;
                    System.out.print("Change is " + change);

                } else {
                    int require = tea - money;
                    System.out.print("Money not enough , required " + require);
                }
                break;

            case 4:
                if (money >= orenge_juice) {
                    int change = money - orenge_juice;
                    System.out.print("Change is " + change);

                } else {
                    int require = orenge_juice - money;
                    System.out.print("Money not enough , required " + require);
                }
                break;

            case 5:
                if (money >= ice_cream) {
                    int change = money - ice_cream;
                    System.out.print("Change is " + change);
                } else {
                    int require = ice_cream - money;
                    System.out.print("Money not enough , required " + require);
                }
                break;

            case 6:
                if (money >= bingsu) {
                    int change = money - bingsu;
                    System.out.print("Change is " + change);

                } else {
                    int require = bingsu - money;
                    System.out.print("Money not enough , required " + require + " bath");
                }
                break;

            case 7:
                if (money >= cake) {
                    int change = money - cake;
                    System.out.print("Change is " + change);

                } else {
                    int require = cake - money;
                    System.out.print("Money not enough , required " + require);
                }
                break;

        }
    }

}
