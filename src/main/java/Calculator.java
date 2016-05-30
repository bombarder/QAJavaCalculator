
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input math expression: ");

        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.equals("exit")) {
                break;
            }
            try {
                System.out.println(evaluate(inputLine));
            } catch (NumberFormatException e) {
                System.out.println("Please, input digits only");
                continue;
            }
        }
    }

    private static double evaluate(String inputLine) {
        double firstDigit;
        double secondDigit;
        String operator = null;

        CalculationFactory operation = CalculationFactory.getInstance();
        operator = operatorValidation(inputLine, operator);
        String[] result = inputLine.split("[-+/*]");
        Calculation mathCalculation = operation.getCalculation(operator);

        firstDigit = Double.parseDouble(result[0]);
        secondDigit = Double.parseDouble(result[1]);

        return mathCalculation.calculate(firstDigit, secondDigit);
    }

    private static String operatorValidation(String inputLine, String operator) {
        if (inputLine.contains("+")) {
            operator = "+";
        } else if (inputLine.contains("-")) {
            operator = "-";
        } else if (inputLine.contains("*")) {
            operator = "*";
        } else if (inputLine.contains("/")) {
            operator = "/";
        }
        return operator;
    }
}
