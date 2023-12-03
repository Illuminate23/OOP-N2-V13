import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение для проверки скобок:");
        String expression = scanner.nextLine();

        if (isBalanced(expression)) {
            System.out.println("Выражение правильное.");
        } else {
            System.out.println("Выражение неправильное.");
        }

        scanner.close();
    }

    private static boolean isBalanced(String expression) {
        int openBrackets = 0, closeBrackets = 0;
        Pattern pattern = Pattern.compile("[()]");
        Matcher matcher = pattern.matcher(expression);

        while (matcher.find()) {
            if (matcher.group().equals("(")) {
                openBrackets++;
            } else {
                closeBrackets++;
            }
        }

        return openBrackets == closeBrackets;
    }
}

