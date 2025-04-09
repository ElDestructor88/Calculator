import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение (например, 2 + 2): ");
        String input = scanner.nextLine();

        try {
            int result = calculate(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static int calculate(String input) throws Exception {
        String[] parts = input.split(" ");

        if (parts.length != 3) {
            throw new Exception("Неверный формат ввода.  Используйте формат: число оператор число (например, 2 + 2)");
        }

        int a;
        int b;
        String operator = parts[1];

        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new Exception("Оба операнда должны быть целыми числами.");
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Числа должны быть от 1 до 10 включительно.");
        }

        int result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    throw new Exception("Деление на ноль недопустимо.");
                }
                result = a / b;
                break;
            default:
                throw new Exception("Недопустимая операция. Допустимые операции: +, -, *, /");
        }

        return result;
    }
}

