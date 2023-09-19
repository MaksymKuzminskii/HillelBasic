package gmail.kymaxgen.task19;

import java.util.Scanner;

public class DrinksMachine {
    public static final Scanner SCANNER = new Scanner(System.in);
    static int counter;
    static int totalSum;

    //do while, в цьому циклі розмістити метод order та вихід якщо користувач каже "перейти до сплати"
    public void order() {
        Scanner scanner = new Scanner(System.in);
// Відпрактикувати використання enum в свіч кейс
        do {
            System.out.println("Який напій бажаєте замовити?");
            showMenu();
            System.out.println("Введіть номер бажаного напою: ");
            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1: {

                }
            }
            counter++;
        } while (true);

    }

    public void showMenu() {
        System.out.println("Який напій бажаєте замовити?");
        System.out.println(" - tea \n - coffee \n - lemonade \n - mohito \n - sparkling_water \n - cola");
    }

    public Drinks chooseDrink() {
        Drinks drink = null;
        System.out.print("Введіть назву бажаного напою: ");
        do {
            String userInput = SCANNER.nextLine();
            if (userInput == null) {
                System.out.print("Назву напою не розпізнано. Будь ласка, спробуйте ще раз: ");
                continue;
            }
            drink = Drinks.valueOf(userInput.toUpperCase());
        } while (drink == null);
        return drink;
    }

    public void makeDrink(Drinks drink) {
        switch (drink) {
            case TEA: {
                Drinks.TEA.make();
                counter++;
                totalSum += drink.getPrice();
                break;
            }
            case COFFEE:{
                Drinks.COFFEE.make();
                counter++;
                totalSum += drink.getPrice();
                break;
            }
            case LEMONADE:{
                Drinks.LEMONADE.make();
                counter++;
                totalSum += drink.getPrice();
                break;
            }
            case MOHITO:{
                Drinks.MOHITO.make();
                counter++;
                totalSum += drink.getPrice();
                break;
            }
            case SPARKLING_WATER:{
                Drinks.SPARKLING_WATER.make();
                counter++;
                totalSum += drink.getPrice();
                break;
            }
            case COLA:{
                Drinks.COLA.make();
                counter++;
                totalSum += drink.getPrice();
                break;
            }
        }
    }
    public void orderInfo() {
        System.out.println("У замовленні напоїв: " + counter + "; Сума до сплати: " + totalSum);
    }
}
