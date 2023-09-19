package gmail.kymaxgen.task19;

import java.util.Scanner;

public class DrinksMachineRunner {
    static Scanner scanner = new Scanner(System.in);

    //    private static final String YES = "y";
    public static void main(String[] args) {
        DrinksMachine drinksMachine = new DrinksMachine();
        String answer;
        do {
            drinksMachine.showMenu();
            Drinks userChoice = drinksMachine.chooseDrink();
            drinksMachine.makeDrink(userChoice);
            answer = askOneMoreDrink();
        } while (answer.equalsIgnoreCase("так"));
        drinksMachine.orderInfo();
        System.out.println("Дякуємо за замовлення!");
    }

    private static String askOneMoreDrink() {
        String answer = null;
        do {
            System.out.print("Бажаєте замовити ще один напій? (так/ні): ");
            if (scanner.hasNextLine()) {
                answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("так") && !answer.equalsIgnoreCase("ні")) {
                    System.out.println("Відповідь не розпізнано. Будь ласка, спробуйте ще раз: ");
                    answer = null;
                }
            } else {
                System.out.println("Відповідь не розпізнано. Будь ласка, спробуйте ще раз: ");
            }
        } while (answer == null);
        return answer;
    }


}
