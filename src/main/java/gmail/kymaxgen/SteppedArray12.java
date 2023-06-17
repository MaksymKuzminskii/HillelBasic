package gmail.kymaxgen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SteppedArray12 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.print("Введіть кількість рядків  матриці (до 20): ");
        int linesNumber = inputCheck();
        System.out.print("Введіть максимальну кількість елементів в рядках: ");
        int elementsLimit = inputCheck();
        int[][] basicMatrix = new int[linesNumber][];
        for (int i = 0; i < basicMatrix.length; i++) {
            basicMatrix[i] = new int[random.nextInt(elementsLimit)];
        }
        fillMatrix(basicMatrix);
        System.out.print("Було створено ступінчасту матрицю на " + linesNumber + " рядків: ");
        printMatrix(basicMatrix);
        pairSort(basicMatrix);
        System.out.println("Сума всіх елементів масиву: " + sumAllElements(basicMatrix));
        findMinimumsInLines(basicMatrix);
        System.out.println("Мінімуми в кожному рядку такі: " + Arrays.toString(findMinimumsInLines(basicMatrix)));
        System.out.println("Абсолютний мінімум матриці: " + findAbsoluteMinimum(basicMatrix));
        divideByAbsoluteMinimum(basicMatrix);
    }

    public static int[] findMinimumsInLines(int[][] matrix) {
        int[] minimums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            bubbleSortToMax(matrix[i]);
            if (matrix[i].length == 0) {
                minimums[i] = 0;
            } else {
                minimums[i] = matrix[i][0];
            }
        }
        return minimums;
    }

    public static int findAbsoluteMinimum(int[][] matrix) {
        int[] tmp = findMinimumsInLines(matrix);
        bubbleSortToMax(tmp);
        return tmp[0];
    }

    public static void divideByAbsoluteMinimum(int[][] matrix) {
        int absoluteMinimum = findAbsoluteMinimum(matrix);
        if (absoluteMinimum == 0) {
            System.out.printf("Спроба поділити матрицю на її абсолютний мінімум...%n" +
                    "Неможливо провести ділення матриці на 0");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] /= absoluteMinimum;
                }
            }
            System.out.print("Матрицю було поділено націло на її абсолютний мінімум. Нижче надруковано результат: ");
            printMatrix(matrix);
        }
    }

    public static int sumAllElements(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            for (int element : array) {
                sum += element;
            }
        }
        return sum;
    }

    public static void pairSort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 != 0) {
                bubbleSortToMax(matrix[i]);
            } else {
                bubbleSortToMinimum(matrix[i]);
            }
        }
        System.out.print("Сортування. Парні рядки за зростанням, а непарні за спаданням: ");
        printMatrix(matrix);
    }

    public static void bubbleSortToMax(int[] array) {
        int tmp;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length - 1 - j; k++) {
                if (array[k] > array[k + 1]) {
                    tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
    }

    public static void bubbleSortToMinimum(int[] array) {
        int tmp;
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length - 1 - j; k++) {
                if (array[k] < array[k + 1]) {
                    tmp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = tmp;
                }
            }
        }
    }

    public static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
            }

        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int[] arrays : matrix) {
            System.out.println(Arrays.toString(arrays));
        }
    }

    public static int inputCheck() {
        Scanner scanner = new Scanner(System.in);
        int parameter;
        if (scanner.hasNextInt()) {
            parameter = scanner.nextInt();
            if (parameter < 21) {
                return parameter;
            } else {
                System.out.println("Введено некоректні дані. Автоматично задано заначення: 7");
                return 7;
            }
        } else {
            System.out.println("Введено некоректні дані. Автоматично задано заначення: 7");
            return 7;
        }
    }
}
