
public class MathOperation {

    private static MathOperation operation = new MathOperation();

    private MathOperation() {
    }

    public static MathOperation getOperation() {
        return operation;
    }

    public Calculation getCalculation(String operation) {
        switch (operation) {
            case "/":
                return new Division();
            case "+":
                return new Addition();
            case "-":
                return new Sutraction();
            case "*":
                return new Multiplication();
            default:
                return null;
        }
    }
}


