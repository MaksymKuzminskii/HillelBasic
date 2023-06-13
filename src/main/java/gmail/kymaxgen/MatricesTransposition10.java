package gmail.kymaxgen;

import java.util.Arrays;
public class MatricesTransposition10 {
    public static void main(String[] args) {
        int[] myArray = {3, 5, 1, 16, 3, 7, 9, 11};
        bubbleSort(myArray);
        printArray(myArray);
        int tmp;
        tmp = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = tmp;
        System.out.println();
        printArray(myArray);
    }

    public static void bubbleSort(int[] array) {
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j ++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
//        System.out.println();

    }

    public static void printArray (int[] array) {
        for (int element : array) {
            System.out.print(element + ", ");
        }
    }
}
