import helper.AppState;
import operations.Operations;
import operations.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {

    AppState appState = new AppState();

    public void startCalculation() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#####");
        while (true) {
            System.out.println("Enter Operation: ");
            String input = scanner.nextLine();
            String operation = getOperator(input);
            appState.setInputString(input);
            Operations result = switch (operation) {
                case "+" -> new Add();
                case "-" -> new Substract();
                case "reset" -> new Reset();
                default -> new InvalidOperator();
            };

            result.calculate(appState);

            System.out.println(df.format(appState.getLastResult()));
        }
    }

    private String getOperator(String input) {
        if (input.contains("+")) {
            return "+";
        } else if (input.contains("-")) {
            return "-";
        }else if(input.equals("reset")){
            return "reset";
        }
        return "";
    }
}
