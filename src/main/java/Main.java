
import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, input math expression: ");
            String inputLine = scanner.nextLine();
            if (inputLine.equals("exit")) {
                break;
            }
            try {
                double result = execute(inputLine);
                System.out.println(result);
            } catch (MathOperationException e) {
                System.out.println(e);
            }
        }
    }
}
