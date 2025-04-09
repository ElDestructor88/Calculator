import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            int result = calculate(input);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("throws Exception");
        }
    }

    public static int calculate(String input) throws Exception {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception("Ошибка: неверный формат ввода");
        }

        int a;
        int b;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new Exception("Ошибка: неверный формат ввода чисел");
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("Ошибка: превышен числовой диапазон");
        }

        String operator = parts[1];

        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b == 0) {
                    throw new Exception("Ошибка: ноль в качестве делителе");
                }
                return a / b;
            default:
                throw new Exception("Ошибка: неизвестная операция");
        }
    }
}
