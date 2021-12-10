package Demo;

public class Calculation {

    public double totalPrice(int amount, double price, String state){

        double disc = 0;
        double sum = 0;
        double totalPrice = price * amount;
        if (totalPrice <= 1000){
            disc = 0.97;
        }else if (totalPrice <= 5000){
            disc = 0.95;
        }else if (totalPrice <= 7000){
            disc = 0.93;
        }else if (totalPrice <= 10000){
            disc = 0.90;
        }else if (totalPrice > 50000){
            disc = 0.85;
        }

        double taxRate = 0;

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

        sum = (totalPrice * disc) * taxRate;

        return sum;

    }

}
