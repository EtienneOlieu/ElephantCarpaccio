import Demo.Calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculation calc = new Calculation();

        System.out.println("Hello World!");
        System.out.println("Please input how many items you want");

        int amount = sc.nextInt();
        sc.nextLine();

        System.out.println("Please input the price");

        double price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Which state are you in?");
        System.out.println("""
                UT
                NV
                TX
                AL
                CA
                """);
        String state = sc.nextLine().toUpperCase();

        double result = calc.totalPrice(amount,price,state);
        System.out.println(result);



        /*double result1 = calc.totalPrice(1000,10, "UT");
        System.out.println(result1);

        double result2 = calc.totalPrice(1000,10, "NV");
        System.out.println(result2);

        double result3 = calc.totalPrice(1000,10, "TX");
        System.out.println(result3);

        double result4 = calc.totalPrice(1000,10, "AL");
        System.out.println(result4);

        double result5 = calc.totalPrice(1000,10, "CA");
        System.out.println(result5);*/
    }
}
