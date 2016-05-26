import java.util.InputMismatchException;

public class MathOperation {

    private static MathOperation operation = new MathOperation();

    private MathOperation() {
    }

    public static MathOperation getOperation() {
        return operation;
    }

    public Calculation getCalculation(String operation) {
        try {
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

        } catch (InputMismatchException e){
            System.out.println("Wrong input, input again, please");
        }
        return null;
    }

}


