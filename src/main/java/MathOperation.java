import java.util.HashMap;
import java.util.Map;

public class MathOperation {

    private static MathOperation operation = new MathOperation();

    private MathOperation() {
    }

    public static MathOperation getInstance() {
        return operation;
    }

    public Calculation getCalculation(String operator) {

        Map<String, Calculation> map = new HashMap<>();
        map.put("+", new Addition());
        map.put("-", new Subtraction());
        map.put("*", new Multiplication());
        map.put("/", new Division());

        return map.get(operator);
    }
}


