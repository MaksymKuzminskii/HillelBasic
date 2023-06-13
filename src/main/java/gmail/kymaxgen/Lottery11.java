package gmail.kymaxgen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lottery11 {
    public static void main(String[] args) {
        System.out.println("Вітаємо в лотереї!!");
        int[] winNumbers = new int[7];
        int[] userNumbers = new int[7];
        fillRandomlyArray(winNumbers);
        fillByUserArray(userNumbers);
        bubbleSort(winNumbers);
        bubbleSort(userNumbers);
        System.out.println("Числа користувача: " + Arrays.toString(userNumbers));
        System.out.println("Виграшні числа:    " + Arrays.toString(winNumbers));
        countMatches(winNumbers, userNumbers);
    }

    public static void bubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void fillRandomlyArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public static void fillByUserArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть числа лотереї від 0 до 9; ");
        int input;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введіть ваше число: ");
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
            } else {
                input = 0;
            }
            array[i] = input;
        }
    }

    public static void countMatches(int[] firstArray, int[] secondArray) {
        int counter = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                counter++;
            }
        }
        System.out.println("Кількість збігів: " + counter);
    }
}
