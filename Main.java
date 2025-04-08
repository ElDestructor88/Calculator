import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Пожалуйста, представьтесь: ");
        String username = scan.nextLine();
        System.out.println("Здравствуйте, " + username);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();

        System.out.println("Выберите алгебраическое действие: +, -, *, /;");
        String action = scan.nextLine();
        action = scan.nextLine();
        int res;

        switch (action){

            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if (num2 == 0)
                System.out.println("Недопустимый делитель!");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                break;
                }

        }
    }
}