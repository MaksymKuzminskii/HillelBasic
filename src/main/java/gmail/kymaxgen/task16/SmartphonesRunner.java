package gmail.kymaxgen.task16;

public class SmartphonesRunner {
    public static void main(String[] args) {
        Smartphones[] smartphones = new Smartphones[2];
        smartphones[0] = new IPHones();
        smartphones[1] = new Androids();

        useAbilities(smartphones);
    }

    private static void useAbilities(Smartphones[] smartphones) {
        for (Smartphones smartphone : smartphones) {
            smartphone.call();
            smartphone.sms();
            smartphone.internet();
        }
    }
}
