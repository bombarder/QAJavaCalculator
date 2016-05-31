
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
            } catch (CustomException e) {
                System.out.println("Please, input digits only");
                continue;
            }
        }
    }

    public static double evaluate(String inputLine) throws CustomException {
        double firstDigit;
        double secondDigit;
        String operator = null;

        CalculationFactory operation = CalculationFactory.getInstance();
        operator = operatorValidation(inputLine, operator);
        String[] result = inputLine.split("[-+/*]");
        Calculation mathCalculation = operation.getCalculation(operator);

        if (mathCalculation.equals(MathOperation.DIVISION)) {
            if (Double.parseDouble(result[1]) == 0.0) {
                System.out.println("Division by zero aren't allowed.");
                return 0.0;
            }
        }

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
