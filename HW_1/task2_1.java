//Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.
package HW_1;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2_1 {
    public static void main(String[] args) throws IOException {
        int[] arr = { 678, 12, 6, 4, 1, 15, 10, -1, 0, 21, 24, -10 };
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) throws IOException {
        Logger loger = Logger.getLogger(task2_1.class.getName());
        FileHandler fHandler = new FileHandler("Task2_1.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            loger.info(Arrays.toString(arr));
        }
    }
}
