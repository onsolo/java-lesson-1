//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int n: ");
        int n = iScanner.nextInt();
        iScanner.close();

        int sum = 0;
        int mult = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            mult = mult * i;
        }
        System.out.println("Треугольное число " + sum);
        System.out.println("Факториал " + mult);
    }
}