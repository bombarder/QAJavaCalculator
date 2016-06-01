
public class Calculator {

    public static double execute(String inputLine) {

        CalculationFactory operation = CalculationFactory.getInstance();
        String operator = operatorValidation(inputLine);
        String[] result = inputLine.split("[-+/*]");
        Calculation mathCalculation = operation.getCalculation(operator);

        if (mathCalculation.equals(MathOperation.DIVISION)) {

            Double userInput = Double.parseDouble(result[1]);
            boolean comparison = Double.compare(0.0, userInput) == 0.0;

            if (comparison) {
                System.out.println("Division by zero isn't allowed.");
                return 0.0;
            }
        }
        try {
            double firstDigit = Double.parseDouble(result[0]);
            double secondDigit = Double.parseDouble(result[1]);
            return mathCalculation.calculate(firstDigit, secondDigit);
        } catch (NumberFormatException e) {
            throw new MathOperationException("Please, input digits only");
        }
    }

    private static String operatorValidation(String inputLine) {

        String operator = null;

        while (!inputLine.contains("+") && !inputLine.contains("-")
                && !inputLine.contains("*") && !inputLine.contains("/")) {
            System.out.println("Invalid input please enter a valid operator +, -, * or /");
            break;
        }

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
