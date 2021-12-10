package Demo;

import java.text.DecimalFormat;

public class Calculation {

    public String totalPrice(int amount, double price, String state){
        DecimalFormat df = new DecimalFormat("0.00");

        double disc = 1;
        double totalPrice = price * amount;
        if (totalPrice >= 1000 && totalPrice <5000){
            disc = 0.97; //3% rabat
        }else if (totalPrice >= 5000 && totalPrice < 7000){
            disc = 0.95; //5% rabat
        }else if (totalPrice >= 7000 && totalPrice < 10000){
            disc = 0.93; //7% rabat
        }else if (totalPrice >= 10000 && totalPrice < 50000){
            disc = 0.90; //10% rabat
        }else if (totalPrice >= 50000){
            disc = 0.85; //15% rabat
        }

        double taxRate = 1;

        if (state.equals("UT")){
            taxRate =  1.0685;
        }else if (state.equals("NV")){
            taxRate = 1.08;
        }else if (state.equals("TX")){
            taxRate = 1.0625;
        }else if (state.equals("AL")){
            taxRate = 1.04;
        }else if (state.equals("CA")){
            taxRate = 1.0825;
        }

        double sum = (totalPrice * disc) * taxRate;

        return "The total value of your order is: " + df.format(sum);

    }

}
