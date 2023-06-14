package gmail.kymaxgen;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatricesTransposition10 {
    public static void main(String[] args) {
        System.out.print("Введіть кількість рядків  матриці (до 20): ");
        int linesNumber = inputCheck();
        System.out.print("Введіть кількість стовбчиків: ");
        int columnNumber = inputCheck();
        int[][] basicMatrix = new int[linesNumber][columnNumber];
        fillMatrix(basicMatrix);
        printMatrix(basicMatrix);
        int[][] transposedMatrix = transposition(basicMatrix, linesNumber, columnNumber);
        System.out.print("--- Після транспонування ---");
        printMatrix(transposedMatrix);
    }

    public static int[][] transposition(int[][] matrix, int lines, int columns) {
        int[][] transposedMatrix = new int[columns][lines];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static int inputCheck() {
        Scanner scanner = new Scanner(System.in);
        int parameter;
        if (scanner.hasNextInt()) {
            int tmp = scanner.nextInt();
            if (tmp < 21) {
                parameter = tmp;
                return parameter;
            } else {
                System.out.println("Введено некоректні дані. Автоматично задано заначення: 5");
                return 5;
            }
        } else {
            System.out.println("Введено некоректні дані. Автоматично задано заначення: 5");
            return 5;
        }
    }


    public static void fillMatrix(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }

        }
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int[] arrays : matrix) {
            System.out.println(Arrays.toString(arrays));
        }
    }
}
