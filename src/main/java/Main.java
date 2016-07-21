
import java.util.Scanner;

public class Main extends Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input math expression: ");
        String inputLine = scanner.nextLine();

        while (true) {
            if (inputLine.equals("exit")) {
                break;
            } else if (!inputLine.contains("+") && !inputLine.contains("-")
                    && !inputLine.contains("*") && !inputLine.contains("/")) {
                System.out.println("Please enter math operation with +, -, * or /");
                inputLine = scanner.nextLine();
            }else {
                double result = execute(inputLine);
                System.out.println(result);
                inputLine = scanner.nextLine();
            }
        }
    }
}
