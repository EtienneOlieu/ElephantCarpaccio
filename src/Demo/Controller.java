package Demo;

import java.util.InputMismatchException;

public class Controller {
    public void start() {

            Calculation calc = new Calculation();
            UserInterface ui = new UserInterface();

            ui.welcomeMessage();

            boolean running = true;
            while (running) {
                try {
                    int amount = ui.amountQuery();
                    double price = ui.priceQuery();
                    String state = ui.stateQuery();

                    if (state.equals("UT") || state.equals("NV") || state.equals("TX") || state.equals("AL") || state.equals("CA")) {
                        Double result = calc.totalPrice(amount, price, state);
                        ui.printResult(result);
                    } else {
                        ui.statusMessage(state, Status.ILLEGAL_ARGUMENT);
                    }
                } catch (NumberFormatException e) {
                    ui.statusMessage("", Status.WRONG_VALUE);
                } catch (InputMismatchException f) {
                    ui.statusMessage("", Status.WRONG_NUMBER);
                }

                String answer = ui.exitQuery();
                if (answer.equals("Q")) {
                    ui.exitMessage();
                    running = false;
                }
            }
        }
    }


