package gmail.kymaxgen.task21;

public class User {
    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MAX_PASSWORD_LENGTH = 25;
    private static final int MIN_PASSWORD_LENGTH = 6;

    private String login;
    private String password;

    protected User(String login, String password, String confirmPassword) {
        loginValidation(login);
        passwordValidation(password, confirmPassword);
        this.login = login;
        this.password = password;

    }

    private void loginValidation(String login) {
        if (login == null || login.length() == 0) {
            throw new WrongLoginException("Login is null or empty");
        }
        if (login.length() > MAX_LOGIN_LENGTH) {
            throw new WrongLoginException("login is too long");
        }
        for (int i = 0; i < login.length(); i++) {
            char character = login.charAt(i);
            if (('A' > character || character > 'Z') && ('a' > character || character > 'z')) {
                throw new WrongLoginException("Login contains illegal character: " + character);
            }
        }
    }

    private void passwordValidation(String password, String confirmPassword) {
        if (password == null || password.length() == 0) {
            throw new WrongPasswordException("Password is null or empty");
        }
        if (password.length() > MAX_PASSWORD_LENGTH) {
            throw new WrongPasswordException("Pass is too long. Max length is " + MAX_PASSWORD_LENGTH);
        }
        if (password.length() < MIN_PASSWORD_LENGTH) {
            throw new WrongPasswordException("Pass is too short. Minimum length is " + MIN_PASSWORD_LENGTH);
        }
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if (('0' > character || character > '9')
                    && ('A' > character || character > 'Z')
                    && ('a' > character || character > 'z')) {
                throw new WrongPasswordException("Login must contain only numbers and letters");
            }
        }
        if (!hasNumber(password) && !hasLatter(password)) {
            throw new WrongPasswordException("login is wrong");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("login is wrong");
        }
    }

    public static Boolean hasNumber(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ('0' <= c && c <= '9') {
                return true;
            }
        }
        return false;
    }

    public static Boolean hasLatter(String string) {
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if ('A' <= c && c <= 'z') {
                return true;
            }
        }
        return false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User's login: " + login;
    }
}