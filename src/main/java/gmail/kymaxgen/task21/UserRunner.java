package gmail.kymaxgen.task21;

import java.util.Scanner;

public class UserRunner {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int MAX_ATTEMPTS = 3;
    public static void main(String[] args) {

        User user;
        int attempts = 0;
        try {
            while (attempts < MAX_ATTEMPTS) {
                attempts++;
                user = createUser();
                if (user != null) {
                    return; // завершує виконання програми, але файналі всеодно відпрацює
                }
            }
        } finally {
            System.out.println("Thanks for using our service!)");
        }
        System.out.println("Unfortunately user hasn't been created((");
    }

    private static User createUser() {
        System.out.println("login:");
        String login = SCANNER.nextLine();
        System.out.println("password");
        String password = SCANNER.nextLine();
        System.out.println("confirmation of password");
        String passConfirmation = SCANNER.nextLine();

        try {
            return new User(login, password, passConfirmation);
        } catch (WrongLoginException | WrongPasswordException exception) {
            System.out.println("ERROR!! " + exception.getMessage());
        }
        return null;
    }
}
