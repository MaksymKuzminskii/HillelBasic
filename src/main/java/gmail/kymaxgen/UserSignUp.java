package gmail.kymaxgen;

class User {
    private static final int CURRENT_YEAR = 2023;
    private final String name;
    private final int dayBirth;
    private final int monthBirth;
    private final int yearBirth;
    private final String email;
    private final int phoneNumber;
    private int age;
    private String surname;
    private double weight;
    private String pressure;
    private int steps;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDayBirth() {
        return dayBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    User(String name, String surname, int dayBirth, int monthBirth, int yearBirth, String email, int phoneNumber,
         double weight, String pressure, int steps) {
        this.name = name;
        this.surname = surname;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.age = CURRENT_YEAR - yearBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }
    void printAccountInfo() {
        System.out.println("Користувач " + name + " " + surname + " має такі дані:");
        System.out.printf("Дата народження: %d.%02d.%d \n" +
                "Вік: %d \n" +
                "E-mail: %s \n" +
                "Phone number: %d \n" +
                "Weight: %f \n" +
                "Pressure: %s \n" +
                "Steps: %d \n",
                dayBirth, monthBirth, yearBirth, age, email, phoneNumber, weight, pressure, steps);
    }
}
class UserMain {
    public static void main(String[] args) {
        User[] users = {
                new User("Will",
                        "Smith",
                        13,
                        8,
                        1976,
                        "hismail@gmail.usa",
                        594698491,
                        76.8,
                        "140/90",
                        12981),
                new User("Sara",
                        "Bloom",
                        13,
                        4,
                        1999,
                        "sarabloom@gmail.ir",
                        156195198,
                        65.5,
                        "120/82",
                        8961),
                new User("Gregor",
                        "Storm",
                        15,
                        11,
                        2006,
                        "storm2006@company.com",
                        25618181,
                        69.7,
                        "130/85",
                        15877)
        };
        for (User user : users) {
            user.printAccountInfo();
            System.out.println("=====");
        }
        User will = users[0];
        will.setPressure("190/100");
        will.setSteps(18961);
        will.setWeight(71.9);
        User sara = users[1];
        sara.setWeight(56.8);
        sara.setSteps(12506);
        System.out.println("=== Changed ===");

        for (User user : users) {
            user.printAccountInfo();
            System.out.println("=====");
        }
    }
}
