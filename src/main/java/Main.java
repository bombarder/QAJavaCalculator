
import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input math expression: ");

        while (true) {
            String inputLine = scanner.nextLine();
            if (inputLine.equals("exit")) {
                break;
            } else if (!inputLine.contains("+") && !inputLine.contains("-")
                    && !inputLine.contains("*") && !inputLine.contains("/")) {
                System.out.println("Please enter math operation with +, -, * or /");
                inputLine = scanner.nextLine();
            }
            try {
                double result = execute(inputLine);
                System.out.println(result);
            } catch (MathOperationException e) {
                e.printStackTrace();
            }
        }
    }
}
