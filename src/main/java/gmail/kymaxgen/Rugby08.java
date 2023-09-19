/*
package gmail.kymaxgen;

import java.util.Arrays;
import java.util.Random;

public class Rugby08 {
    public static void main(String[] args) {
        int[] firstTeamAges = new int[25];
        int[] secondTeamAges = new int[25];
        fillArray(firstTeamAges);
        fillArray(secondTeamAges);
        System.out.print("У першій команді грають істоти такого віку: " + Arrays.toString(firstTeamAges));
        System.out.printf("%nСередній вік гравців першої команди: %d;%n", countAverage(firstTeamAges));
        System.out.print("Друга команда має гравців такого віку: " + Arrays.toString(secondTeamAges));
        System.out.printf("%nСередній вік гравців другої команди: %d;%n", countAverage(secondTeamAges));
    }

    public static void fillArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(18, 40);
        }
    }

    public static int countAverage(int[] array) {
        int teamTotalAge = 0;
        for (int i : array) {
            teamTotalAge += i;
        }
        return teamTotalAge / 25;
    }
}
*/
