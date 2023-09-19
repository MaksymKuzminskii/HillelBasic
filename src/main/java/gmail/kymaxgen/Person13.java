package gmail.kymaxgen;

public class Person13 {
    String name;
    String surname;
    String city;
    long phoneNumber;
    public Person13(String name, String surname, String city, long phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        Person13 willard = new Person13("Will", "Smith", "New York", 2936729462846L);
        Person13 jackie = new Person13("Jackie", "Chan", "Shanghai", 12312412412L);
        Person13 sherlock = new Person13("Sherlock", "Holmes", "London", 37742123513L);

        willard.personInfo();
        jackie.personInfo();
        sherlock.personInfo();
    }

    public void personInfo() {
        System.out.printf("Зателефонувати громадянинові %s %s з міста %s можна за номером %d %n",
                name,
                surname,
                city,
                phoneNumber);
    }
}
