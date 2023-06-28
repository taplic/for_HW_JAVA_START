//К калькулятору из предыдущего дз добавить логирование.
package HW_1;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2_2 {
    public static void main(String[] args) throws IOException {
        Scanner scaner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        double num1 = scaner.nextDouble();

        System.out.printf("Введите второе число: ");
        double num2 = scaner.nextDouble();

        System.out.printf("Введите арифметический оператор: ");
        String operation = scaner.next();

        resOperation(num1, num2, operation);

        scaner.close();
    }

    public static void resOperation(double a, double b, String operation) throws IOException {
        Logger loger = Logger.getLogger(task2_2.class.getName());
        FileHandler fHandler = new FileHandler("Task2_2.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);
        double res = 0;
        switch (operation) {
            case "+":
                res = a + b;
                break;
            case "-":
                res = a - b;
                break;
            case "*":
                res = a * b;
                break;
            case "/":
                res = a / b;
                break;
            default:
                System.err.println("Неверный оператор ");
                loger.log(Level.WARNING, "unsupported operator " + operation);
        }
        System.out.printf("Результат операции: " + res);
        loger.info(Double.toString(res));
    }
}
