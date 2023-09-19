package gmail.kymaxgen.task18;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MathMatrixTest {
    @Test
    void isSquare() {
        //Given
        int[][] matrix = MathMatrix.generateMatrix(3, 3);
        boolean expected = true;
        //When
        boolean result = MathMatrix.isSquare(matrix);
        //Then
        assertEquals(expected, result);
    }
    @Test
    void isNotSquare() {
        //Given
        int[][] matrix = MathMatrix.generateMatrix(5, 3);
        boolean expected = false;
        //When
        boolean result = MathMatrix.isSquare(matrix);
        //Then
        assertEquals(expected, result);
    }
    @Test
    void isSquareForSteppedArrays() {
        //Given
        Random random = new Random();
        int[][] matrix = new int[5][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[random.nextInt(10)];
        }
        System.out.println("\tСтупічаста матриця: ");
        MathMatrix.printMatrix(matrix);
        boolean expected = false;
        //When
        boolean result = MathMatrix.isSquare(matrix);
        //Then
        assertEquals(expected, result);
    }

    @Test
    void emptyMatrix() {
        //When
        boolean result = MathMatrix.isSquare(new int[][]{});
        System.out.println(result);
        //Then
        assertFalse(result);
    }

    //Given
    //When
    //Then

}