import java.util.Scanner;

// Реализовать простой калькулятор
// сложение
// вычитание
// умножение
// деление
public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Первое число: ");
        int x = iScanner.nextInt();
        System.out.printf("Операция (+, -, *, /): ");
        char operation = iScanner.next().charAt(0);
        System.out.printf("Второе число: ");
        int y = iScanner.nextInt();
        iScanner.close();

        int result = 0;
        if (operation == '+') {
            result = x + y;
            System.out.println("Результат = " + result);
        } else if (operation == '-') {
            result = x - y;
            System.out.println("Результат = " + result);
        } else if (operation == '*') {
            result = x * y;
            System.out.println("Результат = " + result);
        } else if (operation == '/') {
            result = x / y;
            System.out.println("Результат = " + result);
        } else {
            System.out.println("Неизвестная операция");
        }
    }
}
