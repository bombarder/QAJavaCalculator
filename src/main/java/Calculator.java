public class Calculator {

    static double execute(String inputLine) {

        CalculationFactory operation = CalculationFactory.getInstance();
        String operator = CalculationFactory.operatorDetermination(inputLine);
        Calculation mathCalculation = operation.getCalculation(operator);

        String[] result = inputLine.split("[-+/*]");

        if (mathCalculation.equals(MathOperation.DIVISION)) {
            Double userInput = Double.parseDouble(result[1]);
            boolean comparison = Double.compare(0.0, userInput) == 0.0;

            if (comparison) {
                System.out.println("Division by zero isn't allowed.");
                return 0.0;
            }
        }

        try {
            if (result[0].equals("")) {
                double firstDigit = Double.parseDouble(result[1]) * -1;
                double secondDigit = Double.parseDouble(result[2]);
                return mathCalculation.calculate(firstDigit, secondDigit);
            } else {
                double firstDigit = Double.parseDouble(result[0]);
                double secondDigit = Double.parseDouble(result[1]);
                return mathCalculation.calculate(firstDigit, secondDigit);
            }
        } catch (NumberFormatException e) {
            throw new MathOperationException("Please, input digits only!!!!!");
        }
    }
}
