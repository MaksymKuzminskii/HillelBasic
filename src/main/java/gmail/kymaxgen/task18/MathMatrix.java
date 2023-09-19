package gmail.kymaxgen.task18;

import java.util.Arrays;
import java.util.Random;

public class MathMatrix {

    public static void main(String[] args) {
        int[][] matrix = generateMatrix(5, 5);
        printMatrix(matrix);
        System.out.println("Середнє арифметичне: " + average(matrix));
        System.out.println(isSquare(matrix));
    }

    public static int[][] generateMatrix(int height, int width) {
        Random random = new Random();
        int[][] matrix = new int[height][width];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
        return matrix;
    }

    private static double average(int[][] matrix) {
        double sum = 0;
        int counter = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
                counter++;
            }
        }
        return sum/counter;
    }

    public static boolean isSquare(int[][] matrix) {
        int tmp = matrix.length;
        for (int[] array : matrix) {
            if (array.length != tmp) return false;
        }
        return true;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println();
        for (int[] arrays : matrix) {
            System.out.println(Arrays.toString(arrays));
        }
    }
}
