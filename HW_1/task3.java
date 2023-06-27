//Реализовать простой калькулятор
package HW_1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        double num1 = scan.nextDouble();

        System.out.printf("Введите второе число: ");
        double num2 = scan.nextDouble();

        System.out.printf("Введите арифметический оператор: ");
        char operation = scan.next().charAt(0);
        double res = 0;
        switch (operation) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.err.println("Неверный оператор ");
                break;
        }
        System.out.printf("Результат операции: " + res);
        scan.close();
    }
}
