import Demo.Calculation;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculation calc = new Calculation();


        System.out.println("Hello World!");
        boolean running = true;
        while (running) {
            System.out.println("Please input how many items you want:");
            try {
                int amount = 0;
                amount = sc.nextInt();

                System.out.println("Please input the price");

                double price = 0;
                price = sc.nextDouble();
                sc.nextLine();

                System.out.println("Which state are you in?");
                System.out.println("""
                        UT
                        NV
                        TX
                        AL
                        CA
                        """);

                String state = "";
                state = sc.nextLine().toUpperCase().trim();

                if (state.equals("UT") || state.equals("NV") || state.equals("TX") || state.equals("AL") || state.equals("CA")) {
                    String result = calc.totalPrice(amount, price, state);
                System.out.println(result);
                } else {
                    System.out.println(state + " is not a legal argument");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please write a number.");
            }catch (InputMismatchException f){
                System.out.println("Please input a legal value.");
            }

            System.out.println("Exit calculation? Y/N");
            String answer = "";
            answer = sc.nextLine().toUpperCase().trim();
            if (answer.equals("Y")){
                running = false;
            }
        }


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
