package Demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    public UserInterface(){}

    public void welcomeMessage (){
        System.out.println("""
    Welcome to TAXHANDLER 40K
    Your one-stop partner for all things tax related in up to five states.
    """);
    }

    public String exitQuery(){
        System.out.println("""
                Press "Q" to exit the application.
                Press any key to continue.
                """);
        return sc.nextLine().toUpperCase();
    }

    public void exitMessage () {
        System.out.println("""
                Thank you for using TAXHANDLER 40K
                We appreciate your patronage.
                """);
    }

    public int amountQuery(){
        System.out.println("Please input how many items you want:");
        return Integer.parseInt(sc.nextLine());
    }

    public double priceQuery(){
        System.out.println("Please input the price");
        return Double.parseDouble(sc.nextLine());
    }

    public String stateQuery (){
        System.out.println("""
                        Which state of the USA are you currently in?
                        
                        UT - Utah
                        NV - Nevada
                        TX - Texas
                        AL - Alabama
                        CA - California
                        """);
        return sc.nextLine().toUpperCase().trim();
    }

    public void statusMessage(String s, Status status){
        switch (status){
            case WRONG_VALUE -> System.out.println("Please write a number.");
            case WRONG_NUMBER -> System.out.println("Please input a legal value.");
            case ILLEGAL_ARGUMENT -> System.out.println(s + " is not a legal argument");
        }
    }

    public void printResult (Double result){
        System.out.println("The total price for your items is: " + df.format(result));
    }

    public void printString(String s){
        System.out.println(s);
    }
}

