import java.util.HashMap;
import java.util.Map;

public class CalculationFactory {

    private static CalculationFactory operation = new CalculationFactory();

    private CalculationFactory() {
    }

    public static CalculationFactory getInstance() {
        return operation;
    }

    public Calculation getCalculation(String operator) {

        Map<String, Calculation> map = new HashMap<>();
        map.put("+", MathOperation.ADDITION);
        map.put("-", MathOperation.SUBTRACTION);
        map.put("*", MathOperation.MULTIPLICATION);
        map.put("/", MathOperation.DIVISION);

        return map.get(operator);
    }

    public static String operatorDetermination(String inputLine) {

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
        return operator;
    }
}


