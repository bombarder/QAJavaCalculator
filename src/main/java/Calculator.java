
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input math expression: ");
        String inputLine = scanner.nextLine();
        System.out.println(evaluate(inputLine));
    }

    private static double evaluate(String inputLine) {
        MathOperation operation = MathOperation.getOperation();

        double firstDigit;
        double secondDigit;
        String operator = null;

        if (inputLine.contains("+")) {
            operator = "+";
        } else if (inputLine.contains("-")) {
            operator = "-";
        } else if (inputLine.contains("*")) {
            operator = "*";
        } else if (inputLine.contains("/")) {
            operator = "/";
        }

        String[] result = inputLine.split("//+");
        Calculation mathCalculation = operation.getCalculation(operator);

        firstDigit = Double.parseDouble(result[0]);
        secondDigit = Double.parseDouble(result[1]);

        return mathCalculation.calculate(firstDigit, secondDigit);

    }
}
