
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input math expression: ");
        String inputLine = scanner.nextLine();
        System.out.println(evaluate(inputLine));
    }

    private static double evaluate(String inputLine){
        char [] inputToCharArray = inputLine.toCharArray();
        inputLine.
        double leftDigit = Double.valueOf(inputLine.substring(0,1));
        return leftDigit;
    }
}
