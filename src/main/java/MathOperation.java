
public class MathOperation implements Calculation {

    private static MathOperation operation = new MathOperation();

    private MathOperation() {
    }

    public static MathOperation getOperation() {
        return operation;
    }

    public double calculate(double firstValue, double secondValue) {
        return 0;
    }


}
